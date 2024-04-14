<div id="header" align="center">
    <h1>BridgeWay Hub</h1>
    <h3>🧱 API Gateway</h3>
    <div id="badges">
        <img alt="language" src="https://img.shields.io/badge/Java%2017-e6892e">
        <img alt="framework" src="https://img.shields.io/badge/-Spring%20Framework%206-6cb52d">
        <img alt="GitHub" src="https://img.shields.io/github/license/Justedlev/bridgewayhub">
        <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/Justedlev/bridgewayhub">
        <img alt="GitHub issues" src="https://img.shields.io/github/issues/Justedlev/bridgewayhub">
    </div>
</div>

## 📋 About

__BridgeWay Hub__ it's an *API Gateway* for easy launch and using, based on the Spring framework 6,
keycloak as a security layer and eureka client for registration in the registry service, etc.
You can see the all dependencies [here](pom.xml)

## ▶️ Run

### 🛠️ Intellij

Clone the repository using `git clone https://github.com/Justedlev/bridgewayhub.git` and after that run the app local,
you can use the simple [run configuration](.run%2FDefault.run.xml), that based on [.env](.env)
and [jvm options](.vmoptions), make sure that the service registry (eureka service) already started
or disable the dependency in [pom.xml](pom.xml)

### 🚢 Docker

Run with [Docker](README.Docker.md)
