# 📦 Changelog

All notable changes to this project will be documented in this file.

This project uses **[Conventional Commits](https://www.conventionalcommits.org/)** and is powered by **[release-please](https://github.com/googleapis/release-please)**.

## [0.10.1](https://github.com/justedlev/bridgewayhub/compare/v0.10.0...v0.10.1) (2025-10-13)


### 🐛 Bug Fixes

* registration failed if dont use `discovery` profile ([3096e2a](https://github.com/justedlev/bridgewayhub/commit/3096e2a629842449501e74e57eab0d47da3b5695))

## [0.10.0](https://github.com/justedlev/bridgewayhub/compare/v0.9.2...v0.10.0) (2025-10-13)


### ⚠ BREAKING CHANGES

* **config:** improve profiles

### 🚀 Features

* **config:** add `BridgeWaySecurityConfigurationProperties.java` ([bfa2368](https://github.com/justedlev/bridgewayhub/commit/bfa23688ec05074a3010684eb4017a7902a51f17))
* **config:** add `config-client` profile ([a281b27](https://github.com/justedlev/bridgewayhub/commit/a281b27a26f964bebfda6d8788ce077bcc3f3b21))
* **config:** add `management` profile ([fb8e2fa](https://github.com/justedlev/bridgewayhub/commit/fb8e2fa5d8f5274f8e7def13205be34c83c5943a))
* **config:** add `oauth2` profile ([74d0e4f](https://github.com/justedlev/bridgewayhub/commit/74d0e4f96b782e27195a140ce23227a4c894e531))
* **config:** add lite config profile ([79ec04c](https://github.com/justedlev/bridgewayhub/commit/79ec04c92c5e705f18f6a701aed9acb3fe389a91))
* **config:** improve oauth2 security configuration ([4a398dc](https://github.com/justedlev/bridgewayhub/commit/4a398dc5770f956025461eb72033c3713c41ad48))
* **config:** update `lite` profile ([6cf210d](https://github.com/justedlev/bridgewayhub/commit/6cf210d1f3591c007beec535bcbc8f70495ba6a7))
* **config:** update profiles ([ecfbf05](https://github.com/justedlev/bridgewayhub/commit/ecfbf056c3e80a836cf61268c22c92640dda0ea7)), closes [#94](https://github.com/justedlev/bridgewayhub/issues/94)
* use customizable auto configuration ([39da981](https://github.com/justedlev/bridgewayhub/commit/39da98186d8b4346c822621fae5065ed27ef0d5c))


### ♻️ Refactoring

* **config:** remove `application-lite.yml` ([3ee0bc8](https://github.com/justedlev/bridgewayhub/commit/3ee0bc88329da6e7954d0dab2b1e175debe81c02))
* **config:** remove extra env ([473573f](https://github.com/justedlev/bridgewayhub/commit/473573ff8173fdd2fb992deb6600d0120af7096d))
* **config:** remove extra props ([794c50c](https://github.com/justedlev/bridgewayhub/commit/794c50c3a3f5b78d528dc7a22375e7f4b6e5d731))
* extract `SecurityProperties.PREFIX` const ([a740744](https://github.com/justedlev/bridgewayhub/commit/a740744827398b73b83c43384702bc86c3255197))
* update `.env` ([6d89d79](https://github.com/justedlev/bridgewayhub/commit/6d89d791176e8cfe3382b7855645b0be4dc21515))


### ⚙️ Build

* **deps:** bump actions/labeler from 5 to 6 ([d407ec2](https://github.com/justedlev/bridgewayhub/commit/d407ec2114b18646b3a9082a6877066e932f9b69))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([85c9eea](https://github.com/justedlev/bridgewayhub/commit/85c9eeaf7ca53a27f4405275a9c2d9c2d048bede))
* **docker:** expose separate management port ([ec12326](https://github.com/justedlev/bridgewayhub/commit/ec12326acb4c2c6af30b0dd2a94e4dd6163a2764))
* **docker:** fix ports ([aa03a5e](https://github.com/justedlev/bridgewayhub/commit/aa03a5eda92d8e092ef7b318253445af4308fd32))
* **docker:** remove debug mode ([58e2728](https://github.com/justedlev/bridgewayhub/commit/58e2728821e67ac07b7a29005b9a56afdacebb69))
* **docker:** use default port ([8381352](https://github.com/justedlev/bridgewayhub/commit/8381352ea40a62d052921549def657f174d199a6))

## [0.9.2](https://github.com/justedlev/bridgewayhub/compare/v0.9.1...v0.9.2) (2025-08-26)


### ⚙️ Build

* **docker-compose:** remove `volumes` ([b451166](https://github.com/justedlev/bridgewayhub/commit/b451166fbb22406e70f9ac5b7f0cc5a8cdd68517))
* **docker:** fix healthcheck bad substitution error ([5fbac9e](https://github.com/justedlev/bridgewayhub/commit/5fbac9ea7741d732908ca1882a5ab4524085d5f4))
* **docker:** update `.env` ([a627d72](https://github.com/justedlev/bridgewayhub/commit/a627d722e702ceee63e76a4bb5d902c04c1716ee))

## [0.9.1](https://github.com/justedlev/bridgewayhub/compare/v0.9.0...v0.9.1) (2025-08-26)


### 📚 Documentation

* enrich `CHANGELOG.md` ([cb6cabc](https://github.com/justedlev/bridgewayhub/commit/cb6cabc26ab02575f3f34de0672a28de0ee32cc4))


### ⚙️ Build

* **docker:** fix healthcheck script ([54bc4e2](https://github.com/justedlev/bridgewayhub/commit/54bc4e29412021c0a5ec68a5669e2dab77a7c977))
* **docker:** fix healthcheck script ([e0b30d9](https://github.com/justedlev/bridgewayhub/commit/e0b30d9e36f29edb0b6bc2e8b2c72a3b2b70a3bf))

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

## [0.7.0](https://github.com/justedlev/bridgewayhub/compare/v0.6.0...v0.7.0) (2025-03-25)

### 🚀 Features

* add `spring.rabbitmq.*` base configuration ([02787bb](https://github.com/justedlev/bridgewayhub/commit/02787bbf3ff020d154ffd2db7d16cfcd53afceca))
* **docker:** add .env ([03005e7](https://github.com/justedlev/bridgewayhub/commit/03005e782b50837cb597409c8d680e028c04a4fd))
* **docker:** add .vmoptions ([355c3fe](https://github.com/justedlev/bridgewayhub/commit/355c3feb4d238ff193591232c207073d2f560006))
* **docker:** add compose.yaml ([58d09b4](https://github.com/justedlev/bridgewayhub/commit/58d09b4a4c51cc8034bace5efa70c803cac31aec))
* **docker:** add Dockerfile ([3b2eda2](https://github.com/justedlev/bridgewayhub/commit/3b2eda2d0da678ba6ef4c7ea483fd40dd8b2bb7c))
* **docker:** add entrypoint.sh ([ae6f829](https://github.com/justedlev/bridgewayhub/commit/ae6f829018bcf56e08e2e88197418efd1fc9d9ca))
* **docker:** add healthcheck.sh ([6b2fc5c](https://github.com/justedlev/bridgewayhub/commit/6b2fc5ceb0f42459a7a7e7e506900e1b1a79cea8))


## [0.6.0](https://github.com/justedlev/bridgewayhub/compare/v0.5.3...v0.6.0) (2025-02-18)

### 🚀 Features

* add config load from server ([307ddcc](https://github.com/justedlev/bridgewayhub/commit/307ddccd03cb8c41db4e079348556506f17c1f88))


## [0.5.3](https://github.com/justedlev/bridgewayhub/compare/v0.4.4...v0.5.3) (2025-02-08)

### 🐛 Bug Fixes

* **config:** remove extra properties ([7388987](https://github.com/justedlev/bridgewayhub/commit/7388987c5ede72ebcedf01329bb7d95a896c094a))
* update `banner.txt` ([b5deec4](https://github.com/justedlev/bridgewayhub/commit/b5deec4f86ad2128d51ca7a676849933bffa40d6))


## [0.4.4](https://github.com/justedlev/bridgewayhub/compare/v0.4.1...v0.4.4) (2025-02-07)

### 🚀 Features

* **config:** add `LOGGING_FILE_PATH` env var ([63323d5](https://github.com/justedlev/bridgewayhub/commit/63323d591119c20ff8729b41a2e8467fcd11a804))
* **config:** add `security.whitelist.GET` path pattern ([a462ec0](https://github.com/justedlev/bridgewayhub/commit/a462ec006dec124efea15f1970c906cf3a40b749))
* **config:** remove extra env var ([e393514](https://github.com/justedlev/bridgewayhub/commit/e393514c7ce57f11a4f6e84c19c833e04fc6f184))
* **config:** use `allowed-origins` instead of `allowed-origin-patterns` ([a902068](https://github.com/justedlev/bridgewayhub/commit/a902068ba75fed1412e65138919672aa1d14d1be))
* **config:** use env var combined with default port ([72bf5c3](https://github.com/justedlev/bridgewayhub/commit/72bf5c36b2481d607a3f5dd408e75f38ea9bf464))
* **gha:** add `target-branch: "dev"` ([b186c3f](https://github.com/justedlev/bridgewayhub/commit/b186c3f6cac141e341380a74deb3c64a09523722))

### 🐛 Bug Fixes

* **config:** change `redirect-uri` path ([4c5b3f7](https://github.com/justedlev/bridgewayhub/commit/4c5b3f714cee861e9fea40725229383782bab4d0))
* **config:** remove logging `trace` level ([ac894d6](https://github.com/justedlev/bridgewayhub/commit/ac894d6d4a8ade9bef8b57af22fa3d6751bad76c))
* **logging:** name from env ([f8c407d](https://github.com/justedlev/bridgewayhub/commit/f8c407dfc23adaaafaf51e9475e68b044156b518))


## [0.3.0](https://github.com/justedlev/bridgewayhub/compare/v0.1.0...v0.3.0) (2024-10-03)

### 🚀 Features

* add logging level for web ([dd154a7](https://github.com/justedlev/bridgewayhub/commit/dd154a7d3827348f6ba42abe34ab2ba218e25f56))
* integrate config server ([3651b25](https://github.com/justedlev/bridgewayhub/commit/3651b25bbddfd66483fa149b1a6a2707ff16b4ad))
* update .env ([a8c4d0c](https://github.com/justedlev/bridgewayhub/commit/a8c4d0c02dcc1470452e5c16dd16d981f24936b0))
* update default user creds ([b6a3794](https://github.com/justedlev/bridgewayhub/commit/b6a379457e17aaf9130a4720379e172e4e506a3e))
* update gateway config ([030cfb9](https://github.com/justedlev/bridgewayhub/commit/030cfb999248a4eccbaf0f954dcec3263449f318))


## [0.1.0](https://github.com/justedlev/bridgewayhub/compare/v0.0.1-SNAPSHOT...v0.1.0) (2024-09-28)

### 🚀 Features

* deprecate custom impl `ServerLogoutHandler` ([62fc439](https://github.com/justedlev/bridgewayhub/commit/62fc439e7c8fe517dcf84fef5784856e25ae49cc))
* **security:** update logout handler ([d1642b2](https://github.com/justedlev/bridgewayhub/commit/d1642b2ec6b92acb0354628d3bd95b5447382a7a))


## 0.0.1-SNAPSHOT (2024-09-19)

### 🚀 Features

* Init

## [Unreleased]

_Changes that are in progress but not yet released._

<!-- RELEASE PLEASE INSERT CHANGELOG HERE -->
