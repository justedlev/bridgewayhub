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
additional business requirements and is applied in the application
properties. [For more details](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)

## 🧾 References

- [Externalized Configuration](https://docs.spring.io/spring-boot/reference/features/external-config.html#features.external-config.typesafe-configuration-properties.relaxed-binding.environment-variables)
- [Docker CLI](https://docs.docker.com/reference/cli/docker/compose/)
- [Keycloak on Docker](https://www.keycloak.org/getting-started/getting-started-docker)
- [Postgres on Docker](https://hub.docker.com/_/postgres)

## ⚠️ Requirements

Before running the app you need to configure the next services that depends on:

- Keycloak - security layer
- DB for Keycloak `optional`
- Eureka Server, my [solution](https://github.com/Justedlev/simple-eureka-server) `optional`

## ▶️ Run

### <a href="#"><img src="https://github.com/JetBrains/logos/raw/refs/heads/master/web/intellij-idea/intellij-idea.svg" width="20"/></a> Intellij

To run the app you can use simple run configuration (Intellij IDEA), that based on [.env](.env)
and [jvm options](.vmoptions)

```xml

<component name="ProjectRunConfigurationManager">
    <configuration default="false" name="Default" type="SpringBootApplicationConfigurationType"
                   factoryName="Spring Boot">
        <option name="envFilePaths">
            <option value="$PROJECT_DIR$/.env"/>
        </option>
        <option name="FRAME_DEACTIVATION_UPDATE_POLICY" value="UpdateClassesAndResources"/>
        <module name="bridgewayhub"/>
        <selectedOptions>
            <option name="environmentVariables"/>
        </selectedOptions>
        <option name="SPRING_BOOT_MAIN_CLASS" value="io.justedlev.msrv.bridgeway.BridgeWayHubApplication"/>
        <option name="VM_PARAMETERS" value="@.vmoptions"/>
        <method v="2">
            <option name="Make" enabled="true"/>
        </method>
    </configuration>
</component>
```

> [!WARNING]
>
> Make sure that the next services already started
> 
> - Service Registry (eureka server)
> - Keycloak server
> - Postgres DB

> [!NOTE]
>
> The Service Registry (Discovery Service) can be disabled by using the properties if needed
> 
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
>
> You can also disable it in [.vmoptions](.vmoptions), just adding the envs
> 
> ```
> -Dspring.cloud.discovery.enabled=false
> -Deureka.client.enabled=false
> ```
> 
> OR
>
> You can add the env props to the [.env](.env)
> 
> ```
> SPRING_CLOUD_DISCOVERY_ENABLED=false
> EUREKA_CLIENT_ENABLED=false
> ```

### 🐳 Docker

First build your amazing 😁 `docker compose` file and then run using the below cmd

```shell
docker compose build -d
```

> [!TIP]
> 
> I already prepared some image on [🐳 docker hub](https://hub.docker.com/repository/docker/justedlev/bridgewayhub)

#### 📝 Docker compose

Simple command to run the container:

```shell
docker compose up -d --build
```

The full [compose.yaml](compose.yaml) that I personally use

```yml
name: justedlev-msrv
services:
  api-gateway:
    container_name: bridgewayhub
    image: justedlev/bridgewayhub:latest
    build:
      context: docs
    env_file:
      - .env
    ports:
      - "8765:${SERVER_PORT}"
    depends_on:
      - sso
      - service-registry

  # Service discovery
  service-registry:
    container_name: eureka-server
    image: justedlev/simple-eureka-server:latest
    environment:
      SERVER_PORT: 8761
      EUREKA_INSTANCE_HOSTNAME: service-registry
      SPRING_SECURITY_USER_NAME: example
      SPRING_SECURITY_USER_PASSWORD: example
    ports:
      - "8761:${SERVER_PORT}"

  # SSO service (keycloak)
  sso:
    container_name: keycloak
    image: quay.io/keycloak/keycloak:25.0.6
    command: [ "start-dev" ]
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
      - "9321:8080"

  # Postgres DB
  postgres:
    container_name: postgres
    image: postgres:16.4-alpine
    environment:
      POSTGRES_DB: "{example}"
      POSTGRES_USER: "{example}"
      POSTGRES_PASSWORD: "{example}"
    volumes:
      - db-data:/var/lib/postgresql/data
      - /.db:/docker-entrypoint-initdb.d
    ports:
      - "5432:5432"
    healthcheck:
      test: [ "CMD", "pg_isready", "-U", "${POSTGRES_USER}", "-d" ]
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
