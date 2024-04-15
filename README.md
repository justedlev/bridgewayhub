<div id="header" align="center">
    <h1>BridgeWay Hub</h1>
    <h3>🧱 API Gateway</h3>
    <div id="badges">
        <img alt="language" src="https://img.shields.io/badge/Java%2017-e6892e">
        <img alt="framework" src="https://img.shields.io/badge/Spring%20Framework%206-6cb52d">
        <img alt="framework" src="https://img.shields.io/badge/Spring%20Boot%203-6cb52d">
        <img alt="GitHub" src="https://img.shields.io/github/license/Justedlev/bridgewayhub">
        <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/Justedlev/bridgewayhub">
        <img alt="GitHub issues" src="https://img.shields.io/github/issues/Justedlev/bridgewayhub">
    </div>
</div>

## 📋 About

__BridgeWay Hub__ it's an *API Gateway* for easy launch and using, based on the Spring framework 6,
keycloak as a security layer and eureka client for registration in the registry service, etc.
You can see the all dependencies [here](pom.xml)

## ⚠️ Requirements

Before running the app you need to configure the next services that depends on:

#### Keycloak

add to [compose.yaml](compose.yaml) in the `services` section

```yaml
sso:
  container_name: keycloak
  image: quay.io/keycloak/keycloak:24.0.2
  command: [ "start-dev", "--http-port=9321" ]
  environment:
    KEYCLOAK_ADMIN: admin
    KEYCLOAK_ADMIN_PASSWORD: admin
    KC_HEALTH_ENABLED: true
    KC_HOSTNAME: localhost
    KC_DB: keycloak-db
    KC_DB_URL: jdbc:postgresql://postgres:5432/${KC_DB}
    KC_DB_USERNAME: su
    KC_DB_PASSWORD: su
    KC_DB_SCHEMA: keycloak
  depends_on:
    - postgres
  ports:
    - 9321:9321
```

---

#### DB: for [keycloak](#Keycloak)

add to [compose.yaml](compose.yaml) in the `services` section

```yaml
  postgres:
    container_name: postgres
    image: postgres:16.2-alpine
    environment:
      POSTGRES_DB: justedlev-db
      POSTGRES_USER: su
      POSTGRES_PASSWORD: su
    volumes:
      - db-data:/var/lib/postgresql/data
    ports:
      - 5432:5432
    healthcheck:
      test: ["CMD", "pg_isready"]
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

---

#### Eureka

you can use my [solution](https://github.com/Justedlev/simple-eureka-server)

#### Docker compose

The full compose.yaml that I personally use

```yaml
name: justedlev-microservice
services:
  bridgewayhub:
    container_name: bridgewayhub
    image: justedlev/bridgewayhub:0.0.1-SNAPSHOT
    build:
      context: .
    env_file:
      - docker.env
    ports:
      - 8123:8123
    depends_on:
      - sso
      - simple-eureka-server

  # SSO service (keycloak)
  sso:
    container_name: keycloak
    image: quay.io/keycloak/keycloak:24.0.2
    command: ["start-dev", "--http-port=9321"]
    environment:
      KEYCLOAK_ADMIN: admin
      KEYCLOAK_ADMIN_PASSWORD: admin
      KC_HEALTH_ENABLED: true
      KC_HOSTNAME: localhost
      KC_DB: keycloak-db
      KC_DB_URL: jdbc:postgresql://postgres:5432/${KC_DB}
      KC_DB_USERNAME: su
      KC_DB_PASSWORD: su
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
      POSTGRES_DB: justedlev-db
      POSTGRES_USER: su
      POSTGRES_PASSWORD: su
    volumes:
      - db-data:/var/lib/postgresql/data
    ports:
      - 5432:5432
    healthcheck:
      test: ["CMD", "pg_isready"]
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

## ▶️ Run

### 🛠️ Intellij

Clone the repository using `git clone https://github.com/Justedlev/bridgewayhub.git` and after that run the app local,
you can use the simple [run configuration](.run%2FDefault.run.xml), that based on [.env](.env)
and [jvm options](.vmoptions), make sure that the service registry (eureka service) already started
or disable the dependency in [pom.xml](pom.xml)

### 🚢 Docker

[Docker Hub](https://hub.docker.com/repository/docker/justedlev/bridgewayhub/general)

Run with [Docker](README.Docker.md)
