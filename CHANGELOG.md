# 📦 Changelog

All notable changes to this project will be documented in this file.

This project uses **[Conventional Commits](https://www.conventionalcommits.org/)** and is powered by **[release-please](https://github.com/googleapis/release-please)**.

## [0.9.0](https://github.com/justedlev/bridgewayhub/compare/v0.8.0...v0.9.0) (2025-08-26)


### 🚀 Features

* add configurable endpoint whitelist ([1fd9d30](https://github.com/justedlev/bridgewayhub/commit/1fd9d306bf82019ba0f9d7223a20f28d36ffab90)), closes [#32](https://github.com/justedlev/bridgewayhub/issues/32)
* **config:** add default scopes ([6dd6f12](https://github.com/justedlev/bridgewayhub/commit/6dd6f124a9244fa69de35dd2c0be009dd7da5a7d))
* **security:** add oauth2 for `WebClient` ([73cc460](https://github.com/justedlev/bridgewayhub/commit/73cc460c9fbc4cef0bc5c80eb23073230a5c82a4)), closes [#80](https://github.com/justedlev/bridgewayhub/issues/80)


### ♻️ Refactoring

* **config:** remove `bootstrap.yml` ([ba5529d](https://github.com/justedlev/bridgewayhub/commit/ba5529d0729a70ea76bbde1e73e082d7b8bd57ca))
* **config:** remove `logging.file` props ([3eeacd2](https://github.com/justedlev/bridgewayhub/commit/3eeacd2b284dd074d9ef2dcf615af9e8eab463ae))
* **config:** remove `logging.threshold` props ([4000c3e](https://github.com/justedlev/bridgewayhub/commit/4000c3ed321be3381af0381bb1736cbeac1af89a))
* **config:** remove extra gateway routes ([83946af](https://github.com/justedlev/bridgewayhub/commit/83946aff751040158b6b1c75ba39f163bd0c3a65))
* **config:** remove rabbit config ([8e7ee92](https://github.com/justedlev/bridgewayhub/commit/8e7ee92cacba0acddda4473c3a39ff77832210d8))
* **config:** use fixed eureka defaultZone url ([8ae8d9f](https://github.com/justedlev/bridgewayhub/commit/8ae8d9f5bb040fa3673703843c36499046e41da2))
* **env:** nested variables must not appear outside double quotes ([ca18a2f](https://github.com/justedlev/bridgewayhub/commit/ca18a2f8ae90c4a27baaf9a3f1485e85b99c3283))
* remove `SERVER_PORT` ([be2e99a](https://github.com/justedlev/bridgewayhub/commit/be2e99a52df5184d8fcbfdd491f09124898a2463))
* remove `spring.security.user` props ([31003a1](https://github.com/justedlev/bridgewayhub/commit/31003a1af0b46b8c2e191eb390de633c257f703d))
* use default app name ([99986da](https://github.com/justedlev/bridgewayhub/commit/99986da001e1cc28aea2820ddd0c50d8407943ab))

## [0.8.0](https://github.com/justedlev/bridgewayhub/compare/v0.7.3...v0.8.0) (2025-08-08)


### 🚀 Features

* add prometheus configuration props ([2ce9274](https://github.com/justedlev/bridgewayhub/commit/2ce92747da3d4578c669127ed830e790c061bfec))
* **management:** expose separate management server port ([dbbb9cc](https://github.com/justedlev/bridgewayhub/commit/dbbb9ccc56a0f93cac29d7f76b51e2b19f959528))
* **security:** update `SecurityConfiguration` ([9438850](https://github.com/justedlev/bridgewayhub/commit/9438850590c5876a26b5e71364eef3c0adeeb7b6))
* use `client_credentials` client reg grant type ([d82ba6d](https://github.com/justedlev/bridgewayhub/commit/d82ba6d175d64735aa2f84c828c5fd3d69b42275))


### ♻️ Refactoring

* fix deprecated properties ([212a3ac](https://github.com/justedlev/bridgewayhub/commit/212a3acd8442e7674ae6b9b9eadc3771f38b97e8))
* remove basic from default eureka config props ([eaebfb9](https://github.com/justedlev/bridgewayhub/commit/eaebfb9894145f4885b611ddbc435605b573f91e))

## [0.7.3](https://github.com/justedlev/bridgewayhub/compare/v0.7.2...v0.7.3) (2025-05-16)


### 🐛 Bug Fixes

* normalize line endings using `.gitattributes` ([3aec177](https://github.com/justedlev/bridgewayhub/commit/3aec177680dc6c2953aa3c0239c1d5e4e0e6c857))
* normalize line endings using `.gitattributes` ([63072d1](https://github.com/justedlev/bridgewayhub/commit/63072d150eab58096aec2a0ec99b9a0cb328bfda)), closes [#69](https://github.com/justedlev/bridgewayhub/issues/69)

## [0.7.2](https://github.com/justedlev/bridgewayhub/compare/v0.7.1...v0.7.2) (2025-04-13)


### 🐛 Bug Fixes

* **gha:** correct configuration for `kentaro-m/auto-assign-action` ([982c088](https://github.com/justedlev/bridgewayhub/commit/982c0888011663352dfeb1bc24fa7ebc6914ffe0))


### ♻️ Refactoring

* rename `BridgeWayHubApplicationTests.java` ([51358a3](https://github.com/justedlev/bridgewayhub/commit/51358a3e0aa44f3cace090cc0a05ec68b67056c7))


### 🧪 Tests

* add `application.yml` ([7636437](https://github.com/justedlev/bridgewayhub/commit/7636437690f54b4e3896b0beae4ee741900f9d72))

## [0.7.1](https://github.com/justedlev/bridgewayhub/compare/v0.7.0...v0.7.1) (2025-04-13)


### 🐛 Bug Fixes

* **gha:** remove `release-type` from `release-please-config.json` ([4930492](https://github.com/justedlev/bridgewayhub/commit/49304922703edb3238dbcfcd86624c5bfe45b92f))
* **gha:** update `docker-image.yml` ([a57df2b](https://github.com/justedlev/bridgewayhub/commit/a57df2beb462a1d4770854d12ec917638572990b))
* **gha:** update `release-please-config.json` ([98304ce](https://github.com/justedlev/bridgewayhub/commit/98304cef9f1986f32c9d415213cda635fe5d27f1))
* **gha:** update `release-please-config.json` ([383a0d4](https://github.com/justedlev/bridgewayhub/commit/383a0d4de8d0ef9685ef454910c98c306e6be071))
* **gha:** update `release-please-config.json` ([a8e1422](https://github.com/justedlev/bridgewayhub/commit/a8e1422b781116a0417a117c5d19f0928bc32026))
* **gha:** update `release-please-config.json` ([c681685](https://github.com/justedlev/bridgewayhub/commit/c681685196b740f007f044c3fafdb3c604014551))
* **gha:** update `release-please-config.json` ([e670cc1](https://github.com/justedlev/bridgewayhub/commit/e670cc12fa7dc02d395d10115108b2c059820dcb))
* **gha:** update `release-please-config.json` ([7aad236](https://github.com/justedlev/bridgewayhub/commit/7aad236d049d93003118dd178d3da065054b0754))
* **gha:** update `release-please-config.json` ([a13eff3](https://github.com/justedlev/bridgewayhub/commit/a13eff39a401a46ee272ee0ec477d648d19bce21))
* **gha:** update `release-please-config.json` ([23d9cea](https://github.com/justedlev/bridgewayhub/commit/23d9cea229aadfbab2663479033f0cf92c2fcbfd))
* **gha:** update `release-please-config.json` ([78d32ec](https://github.com/justedlev/bridgewayhub/commit/78d32ec40103c545a124ffa4158f096ea742610e))
* **gha:** update `release-please-config.json` ([42b9f75](https://github.com/justedlev/bridgewayhub/commit/42b9f7577d2a0035a2253ae26f280e0176f300c2))
* **gha:** update `release-please-manifest.json` ([b169055](https://github.com/justedlev/bridgewayhub/commit/b169055fe9fb116f77a3d03e6adfb0175b86aa39))
* **gha:** update `release-please.yml` ([4ad86ec](https://github.com/justedlev/bridgewayhub/commit/4ad86ece1bca88ac707bbab493c7782f5a84847b))
* **gha:** update `release-please.yml` ([1da3c1e](https://github.com/justedlev/bridgewayhub/commit/1da3c1e1015bfc4717c6647b9b2ca057e606e05a))


### ♻️ Refactoring

* update `release-please-config.json` ([2dfc4a0](https://github.com/justedlev/bridgewayhub/commit/2dfc4a019b9dc95ddf588f5f11dd38ec528bf5f4))


### 📚 Documentation

* add `bug_report.yml` issue template ([376ea77](https://github.com/justedlev/bridgewayhub/commit/376ea77eaffea7aa517e73182ab0672a94c0bbba))
* add `CHANGELOG.md` ([7441cc8](https://github.com/justedlev/bridgewayhub/commit/7441cc8b1ca2e7e31e1b25a620d3cdcf231048a4))
* add `config.yml` issue template ([6ddbcd9](https://github.com/justedlev/bridgewayhub/commit/6ddbcd9b7958e3ff4143a2d74bd36e11c9953e1b))
* add `feature_request.yml` issue template ([eff486c](https://github.com/justedlev/bridgewayhub/commit/eff486cfb0e5c2e8a4f58632010a2c272741a721))
* add `PULL_REQUEST_TEMPLATE.md` ([8a179f0](https://github.com/justedlev/bridgewayhub/commit/8a179f034f3dbb28dc0383f1c492277b8e886380))
* add `SECURITY.md` ([fc5efdd](https://github.com/justedlev/bridgewayhub/commit/fc5efddb30d4550343bc2087b458b2caf0807a57))
* update `PULL_REQUEST_TEMPLATE.md` ([adf81f6](https://github.com/justedlev/bridgewayhub/commit/adf81f683afbb5267c0e57070095871ae132c182))

## [Unreleased]

_Changes that are in progress but not yet released._

<!-- RELEASE PLEASE INSERT CHANGELOG HERE -->
