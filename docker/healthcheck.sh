#!/bin/sh
########################################################################################################################
#
# Healthcheck script to ensure that the Spring Boot app is running.
#
# Supports:
#   - SERVER_PORT
#   - SERVER_SERVLET_CONTEXT_PATH
#   - MANAGEMENT_SERVER_PORT
#   - MANAGEMENT_SERVER_BASE_PATH
#   - MANAGEMENT_SERVER_SERVLET_CONTEXT_PATH  # legacy/fallback
#   - MANAGEMENT_ENDPOINTS_WEB_BASE_PATH
#   - HEALTH_ENDPOINT_PATH
#
########################################################################################################################

set -u

log() {
  echo "$0: $*"
}

normalize_path() {
  path=""

  for part in "$@"; do
    [ -n "$part" ] || continue

    # Remove leading and trailing slashes
    part=$(echo "$part" | sed 's#^/*##; s#/*$##')

    [ -n "$part" ] || continue
    path="${path}/${part}"
  done

  [ -n "$path" ] || path="/"
  echo "$path"
}

APP_PORT="${SERVER_PORT:-8080}"
MANAGEMENT_PORT="${MANAGEMENT_SERVER_PORT:-$APP_PORT}"

SERVER_CONTEXT_PATH="${SERVER_SERVLET_CONTEXT_PATH:-}"
MANAGEMENT_CONTEXT_PATH="${MANAGEMENT_SERVER_BASE_PATH:-${MANAGEMENT_SERVER_SERVLET_CONTEXT_PATH:-}}"

ACTUATOR_BASE_PATH="${MANAGEMENT_ENDPOINTS_WEB_BASE_PATH:-/actuator}"
HEALTH_ENDPOINT_PATH="${HEALTH_ENDPOINT_PATH:-health}"

CONNECT_TIMEOUT="${HEALTHCHECK_CONNECT_TIMEOUT:-2}"
MAX_TIME="${HEALTHCHECK_MAX_TIME:-5}"

if [ "$MANAGEMENT_PORT" = "$APP_PORT" ]; then
  URL_PATH=$(normalize_path "$SERVER_CONTEXT_PATH" "$ACTUATOR_BASE_PATH" "$HEALTH_ENDPOINT_PATH")
else
  URL_PATH=$(normalize_path "$MANAGEMENT_CONTEXT_PATH" "$ACTUATOR_BASE_PATH" "$HEALTH_ENDPOINT_PATH")
fi

URL="http://localhost:${MANAGEMENT_PORT}${URL_PATH}"

log "checking $URL"

RESPONSE=$(
  curl \
    --silent \
    --show-error \
    --fail \
    --connect-timeout "$CONNECT_TIMEOUT" \
    --max-time "$MAX_TIME" \
    "$URL" 2>&1
)

CURL_EXIT_CODE=$?

if [ "$CURL_EXIT_CODE" -ne 0 ]; then
  log "curl failed: $RESPONSE"
  exit 1
fi

STATUS=$(echo "$RESPONSE" | sed -n 's/.*"status"[[:space:]]*:[[:space:]]*"\([^"]*\)".*/\1/p')

log "status: ${STATUS:-unknown}"

if [ "$STATUS" = "UP" ]; then
  exit 0
fi

exit 1
