<div id="header" align="center">
    <h1>BridgeWay Hub</h1>
    <h3>🧱 API Gateway</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2017-e6892e)](https://github.com/Justedlev/bridgewayhub)
[![framework](https://img.shields.io/badge/Spring%20Framework%206-6cb52d)](https://github.com/Justedlev/bridgewayhub)
[![framework](https://img.shields.io/badge/Spring%20Boot%203-6cb52d)](https://github.com/Justedlev/bridgewayhub)
[![license](https://img.shields.io/github/license/Justedlev/bridgewayhub)](https://github.com/Justedlev/bridgewayhub)
[![stars](https://img.shields.io/github/stars/Justedlev/bridgewayhub)](https://github.com/Justedlev/bridgewayhub/star)
[![issues](https://img.shields.io/github/issues/Justedlev/bridgewayhub)](https://github.com/Justedlev/bridgewayhub/issues)

</div>

## 📋 About

__BridgeWay Hub__ it's an `API Gateway` for easy launch and using, based on the `Spring Boot 3`,
`Keycloak` as a security layer and `Eureka` as service registry.
You can see the all dependencies [here](../pom.xml)

## ⚠️ Requirements

Before running the app you need to configure the next services that depends on:

- Keycloak
- DB for Keycloak if needed
- Eureka Server, my [solution](https://github.com/Justedlev/simple-eureka-server)

## ▶️ Run

### <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/intellij/intellij-original.svg" width="20"/> Intellij

Clone the repository using `git clone https://github.com/Justedlev/bridgewayhub.git` and after that run the app local,
you can use the simple [run configuration](.run%2FDefault.run.xml), that based on [.env](../.env)
and [jvm options](../.vmoptions), make sure that the service registry (eureka service) already started.

> [!NOTE]
> The Discovery Service can be disabled by using the property 👇 in [application.yml](..%2Fsrc%2Fmain%2Fresources%2Fapplication.yml)
> ```yml 
> spring:
>   cloud:
>     discovery:
>       enabled: false
> ```

> [!TIP]
> You can also disable it in [.vmoptions](..%2F.vmoptions), just adding the env `-Dspring.cloud.discovery.enabled=false`

### <img src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/refs/heads/master/src/images/icons/Devops/docker.svg" width="20"/> Docker

I have a repository on [Docker Hub](https://hub.docker.com/repository/docker/justedlev/bridgewayhub/general)

### 📝 Docker compose

Simple command to run the container: `docker compose up -d --build`

The full compose.yaml that I personally use

```yaml
name: justedlev-microservice
services:
  bridgewayhub:
    container_name: bridgewayhub
    image: justedlev/bridgewayhub:0.0.1-SNAPSHOT
    build:
      context: ..
    environment:
      SERVICE_REGISTRY: http://{example}:{example}@service-discovery:8761/eureka
      ORIGINS: http://service-discovery:8761,http://localhost:8761,http://localhost:3000
      USERNAME: "{example}"
      PASSWORD: "{example}"
      ROLES: admin,user,editor,owner
      KEYCLOAK_HOST: http://sso:9321
      KEYCLOAK_REALM: "{example}"
      KEYCLOAK_ISSUER_URI: ${KEYCLOAK_HOST}/realms/${KEYCLOAK_REALM}
      KEYCLOAK_JWKS_URI: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/certs
      KEYCLOAK_TOKEN_ENDPOINT: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/token
      KEYCLOAK_INTROSPECTION_ENDPOINT: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/token/introspect
      KEYCLOAK_CLIENT_ID: "{example}"
      KEYCLOAK_CLIENT_SECRET: "{example}"
    ports:
      - 8123:8123
    depends_on:
      - sso
      - service-discovery

  # Service discovery
  service-discovery:
    container_name: service-discovery
    image: justedlev/simple-eureka-server:1.0.0-SNAPSHOT
    environment:
      USERNAME: "{example}"
      PASSWORD: "{example}"
    ports:
      - 8761:8761

  # SSO service (keycloak)
  sso:
    container_name: keycloak
    image: quay.io/keycloak/keycloak:24.0.2
    command: [ "start-dev", "--http-port=9321" ]
    environment:
      KEYCLOAK_ADMIN: "{example}"
      KEYCLOAK_ADMIN_PASSWORD: "{example}"
      KC_HEALTH_ENABLED: true
      KC_HOSTNAME: localhost
      KC_DB: postgres
      KC_DB_URL: jdbc:postgresql://postgres:5432/{example}
      KC_DB_USERNAME: "{example}"
      KC_DB_PASSWORD: "{example}"
      KC_DB_SCHEMA: keycloak
    depends_on:
      - postgres
    ports:
      - 9321:9321

  # Postgres DB
  postgres:
    container_name: postgres
    image: postgres:16.2-alpine
    environment:
      POSTGRES_DB: "{example}"
      POSTGRES_USER: "{example}"
      POSTGRES_PASSWORD: "{example}"
    volumes:
      - db-data:/var/lib/postgresql/data
    ports:
      - 5432:5432
    healthcheck:
      test: [ "CMD", "pg_isready", "-U {example}", "-d" ]
      interval: 15s
      timeout: 10s
      retries: 5
      start_period: 12s
    restart: unless-stopped
    deploy:
      resources:
        limits:
          cpus: "1"
          memory: 250MB

volumes:
  db-data:
```
