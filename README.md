# BridgeWay Hub

🧱 API Gateway

![Static Badge](https://img.shields.io/badge/Justedlev-BridgeWay%20Hub-BridgeWay%20Hub)
![GitHub top language](https://img.shields.io/github/languages/top/Justedlev/bridgewayhub)
![GitHub](https://img.shields.io/github/license/Justedlev/bridgewayhub)
![GitHub Repo stars](https://img.shields.io/github/stars/Justedlev/bridgewayhub)
![GitHub issues](https://img.shields.io/github/issues/Justedlev/bridgewayhub)

## ▶️ Start

### 🛠️ Intellij

Use the base [run configuration](.run%2FDefault.run.xml) to run the app on local machine, make sure that the eureka service 
already started or disable the dependency in [pom.xml](pom.xml)

### 🚢 Docker
You also can run the container in Docker env, the [docker-compose.yml](docker-compose.yml) based on [.docker.env](.docker.env)

1. ``maven clean verify``
2. ``docker-compose up -d --build``
