<div id="header" align="center">
    <h1>BridgeWay Hub</h1>
    <h3>🧱 API Gateway</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2017-e6892e.svg?logo=openjdk&logoColor=white)](https://github.com/justedlev/bridgewayhub)
[![framework](https://img.shields.io/badge/Spring%20Boot%203-6DB33F.svg?logo=springboot&logoColor=white)](https://docs.spring.io/spring-boot/index.html)
[![Docker Image Version](https://img.shields.io/docker/v/justedlev/bridgewayhub?logo=docker&label=bridgewayhub)](https://hub.docker.com/repository/docker/justedlev/bridgewayhub)
[![license](https://img.shields.io/github/license/justedlev/bridgewayhub)](https://www.apache.org/licenses/LICENSE-2.0.txt)
[![stars](https://img.shields.io/github/stars/justedlev/bridgewayhub)](https://github.com/justedlev/bridgewayhub/star)
[![issues](https://img.shields.io/github/issues/justedlev/bridgewayhub)](https://github.com/justedlev/bridgewayhub/issues)

</div>

## 📋 About

__BridgeWay Hub__ example implementation of `API Gateway` based on `Spring Boot 3`, `Keycloak` as a security layer 
and `Eureka Client` as service registry, in microservice architecture, detailed configuration will depend directly on 
additional business requirements and is applied in the application properties. [For more details](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)

## ⚠️ Requirements

Before running the app you need to configure the next services that depends on:

- Keycloak - security layer
- DB for Keycloak `optional`
- Eureka Server, my [solution](https://github.com/Justedlev/simple-eureka-server) `optional`

## ▶️ Run

### <a href="#"><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/intellij/intellij-original.svg" width="20"/></a> Intellij

Clone the repository using `git clone https://github.com/Justedlev/bridgewayhub.git` and after that run the app local,
you can use the simple [run configuration](..%2F.run%2FDefault.run.xml), that based on [.env](../.env)
and [jvm options](../.vmoptions), make sure that the service registry (eureka service) already started.

> [!NOTE]
> The Service Registry (Discovery Service) can be disabled by using the properties if needed
> ```yml 
> spring:
>   cloud:
>     discovery:
>       enabled: false
> eureka:
>   client:
>     enabled: false
> ```

> [!TIP]
> You can also disable it in [.vmoptions](..%2F.vmoptions), just adding the envs
> ```
> -Dspring.cloud.discovery.enabled=false
> -Deureka.client.enabled=false
> ```

### <a href="#"><img src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/refs/heads/master/src/images/icons/Devops/docker.svg" width="20"/></a> Docker

I have a repository on [Docker Hub](https://hub.docker.com/repository/docker/justedlev/bridgewayhub/general)

#### 📝 Docker compose

Simple command to run the container: 
```shell
docker compose up -d --build
```

Learn More with Docker CLI: [Compose](https://docs.docker.com/reference/cli/docker/compose/)

The full compose.yaml that I personally use

```yml
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
      USERNAME: "{changeme}"
      PASSWORD: "{changeme}"
      ROLES:
        - "{changeme}"
        - "{changeme2}"
        - "{changeme-etc}"
      KEYCLOAK_HOST: http://sso:9321
      KEYCLOAK_REALM: "{changeme}"
      KEYCLOAK_ISSUER_URI: ${KEYCLOAK_HOST}/realms/${KEYCLOAK_REALM}
      KEYCLOAK_JWKS_URI: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/certs
      KEYCLOAK_TOKEN_ENDPOINT: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/token
      KEYCLOAK_INTROSPECTION_ENDPOINT: ${KEYCLOAK_ISSUER_URI}/protocol/openid-connect/token/introspect
      KEYCLOAK_CLIENT_ID: "{changeme}"
      KEYCLOAK_CLIENT_SECRET: "{changeme}"
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
      USERNAME: "{changeme}"
      PASSWORD: "{changeme}"
    ports:
      - 8761:8761

  # SSO service (keycloak)
  sso:
    container_name: keycloak
    image: quay.io/keycloak/keycloak:24.0.2
    command: [ "start-dev", "--http-port=9321" ]
    environment:
      KEYCLOAK_ADMIN: "{changeme}"
      KEYCLOAK_ADMIN_PASSWORD: "{changeme}"
      KC_HEALTH_ENABLED: true
      KC_HOSTNAME: localhost
      KC_DB: postgres
      KC_DB_URL: jdbc:postgresql://postgres:5432/{example}
      KC_DB_USERNAME: "{changeme}"
      KC_DB_PASSWORD: "{changeme}"
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
      POSTGRES_DB: "{changeme}"
      POSTGRES_USER: "{changeme}"
      POSTGRES_PASSWORD: "{changeme}"
    volumes:
      - db-data:/var/lib/postgresql/data
    ports:
      - 5432:5432
    healthcheck:
      test: [ "CMD", "pg_isready", "-U ${POSTGRES_USER}", "-d" ]
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
