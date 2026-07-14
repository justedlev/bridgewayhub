# 📦 Changelog

All notable changes to this project will be documented in this file.

This project uses **[Conventional Commits](https://www.conventionalcommits.org/)** and is powered by **[release-please](https://github.com/googleapis/release-please)**.

## [1.0.0](https://github.com/justedlev/bridgewayhub/compare/v1.0.3...v1.0.0) (2026-07-14)


### ⚠ BREAKING CHANGES

* bump java version to 21
* migrate to spring boot v4
* **config:** improve profiles

### 🚀 Features

* add `spring.rabbitmq.*` base configuration ([02787bb](https://github.com/justedlev/bridgewayhub/commit/02787bbf3ff020d154ffd2db7d16cfcd53afceca))
* add config load from server ([307ddcc](https://github.com/justedlev/bridgewayhub/commit/307ddccd03cb8c41db4e079348556506f17c1f88))
* add configurable endpoint whitelist ([1fd9d30](https://github.com/justedlev/bridgewayhub/commit/1fd9d306bf82019ba0f9d7223a20f28d36ffab90)), closes [#32](https://github.com/justedlev/bridgewayhub/issues/32)
* add logging level for web ([dd154a7](https://github.com/justedlev/bridgewayhub/commit/dd154a7d3827348f6ba42abe34ab2ba218e25f56))
* add prometheus configuration props ([2ce9274](https://github.com/justedlev/bridgewayhub/commit/2ce92747da3d4578c669127ed830e790c061bfec))
* bump java version to 21 ([354a37f](https://github.com/justedlev/bridgewayhub/commit/354a37f0b1ff99307fd20174e02a1af3c4a56dc8)), closes [#65](https://github.com/justedlev/bridgewayhub/issues/65)
* **config:** add `BridgeWaySecurityConfigurationProperties.java` ([bfa2368](https://github.com/justedlev/bridgewayhub/commit/bfa23688ec05074a3010684eb4017a7902a51f17))
* **config:** add `config-client` profile ([a281b27](https://github.com/justedlev/bridgewayhub/commit/a281b27a26f964bebfda6d8788ce077bcc3f3b21))
* **config:** add `LOGGING_FILE_PATH` env var ([63323d5](https://github.com/justedlev/bridgewayhub/commit/63323d591119c20ff8729b41a2e8467fcd11a804))
* **config:** add `management` profile ([fb8e2fa](https://github.com/justedlev/bridgewayhub/commit/fb8e2fa5d8f5274f8e7def13205be34c83c5943a))
* **config:** add `oauth2` profile ([74d0e4f](https://github.com/justedlev/bridgewayhub/commit/74d0e4f96b782e27195a140ce23227a4c894e531))
* **config:** add `security.whitelist.GET` path pattern ([a462ec0](https://github.com/justedlev/bridgewayhub/commit/a462ec006dec124efea15f1970c906cf3a40b749))
* **config:** add `spring.cloud.discovery.reactive.enabled` property ([417e421](https://github.com/justedlev/bridgewayhub/commit/417e4216ecbf1ec40ec81975aae26537ba8cf007))
* **config:** add `spring.profiles.group.standalone` ([3c9b5e5](https://github.com/justedlev/bridgewayhub/commit/3c9b5e56bd6dd16f1b8027ca424a4185f54534a8))
* **config:** add default scopes ([6dd6f12](https://github.com/justedlev/bridgewayhub/commit/6dd6f124a9244fa69de35dd2c0be009dd7da5a7d))
* **config:** add lite config profile ([79ec04c](https://github.com/justedlev/bridgewayhub/commit/79ec04c92c5e705f18f6a701aed9acb3fe389a91))
* **config:** add missing flag enablers ([1182bab](https://github.com/justedlev/bridgewayhub/commit/1182bab5e892c6e5a2afdf9f7bdb3e628305be1a))
* **config:** improve oauth2 security configuration ([7e10248](https://github.com/justedlev/bridgewayhub/commit/7e102482cdfbad7c4372a7afbdb538d60fb59323))
* **config:** improve oauth2 security configuration ([2e80ffc](https://github.com/justedlev/bridgewayhub/commit/2e80ffc21aea800ce2201d6a1d399f37acd819b9))
* **config:** improve oauth2 security configuration ([4a398dc](https://github.com/justedlev/bridgewayhub/commit/4a398dc5770f956025461eb72033c3713c41ad48))
* **config:** remove `spring.cloud.gateway.server.webflux.loadbalancer.use404` property ([2000dbc](https://github.com/justedlev/bridgewayhub/commit/2000dbc2646ebc62d61519c360075cf37ecad498))
* **config:** remove `spring.devtools.add-properties` property ([43967bf](https://github.com/justedlev/bridgewayhub/commit/43967bf200e011ce9c84f773b78a9c4e10531eae))
* **config:** remove extra env var ([e393514](https://github.com/justedlev/bridgewayhub/commit/e393514c7ce57f11a4f6e84c19c833e04fc6f184))
* **config:** update `lite` profile ([6cf210d](https://github.com/justedlev/bridgewayhub/commit/6cf210d1f3591c007beec535bcbc8f70495ba6a7))
* **config:** update profiles ([ecfbf05](https://github.com/justedlev/bridgewayhub/commit/ecfbf056c3e80a836cf61268c22c92640dda0ea7)), closes [#94](https://github.com/justedlev/bridgewayhub/issues/94)
* **config:** use `allowed-origins` instead of `allowed-origin-patterns` ([a902068](https://github.com/justedlev/bridgewayhub/commit/a902068ba75fed1412e65138919672aa1d14d1be))
* **config:** use env var combined with default port ([72bf5c3](https://github.com/justedlev/bridgewayhub/commit/72bf5c36b2481d607a3f5dd408e75f38ea9bf464))
* **config:** use hardcoded default client registration id ([fe37e6a](https://github.com/justedlev/bridgewayhub/commit/fe37e6a533f062813785eaf1e67dd29e3738e652))
* deprecate custom impl `ServerLogoutHandler` ([62fc439](https://github.com/justedlev/bridgewayhub/commit/62fc439e7c8fe517dcf84fef5784856e25ae49cc))
* **docker:** add .env ([03005e7](https://github.com/justedlev/bridgewayhub/commit/03005e782b50837cb597409c8d680e028c04a4fd))
* **docker:** add .vmoptions ([355c3fe](https://github.com/justedlev/bridgewayhub/commit/355c3feb4d238ff193591232c207073d2f560006))
* **docker:** add compose.yaml ([58d09b4](https://github.com/justedlev/bridgewayhub/commit/58d09b4a4c51cc8034bace5efa70c803cac31aec))
* **docker:** add Dockerfile ([3b2eda2](https://github.com/justedlev/bridgewayhub/commit/3b2eda2d0da678ba6ef4c7ea483fd40dd8b2bb7c))
* **docker:** add entrypoint.sh ([ae6f829](https://github.com/justedlev/bridgewayhub/commit/ae6f829018bcf56e08e2e88197418efd1fc9d9ca))
* **docker:** add healthcheck.sh ([6b2fc5c](https://github.com/justedlev/bridgewayhub/commit/6b2fc5ceb0f42459a7a7e7e506900e1b1a79cea8))
* **gha:** add `target-branch: "dev"` ([b186c3f](https://github.com/justedlev/bridgewayhub/commit/b186c3f6cac141e341380a74deb3c64a09523722))
* integrate config server ([3651b25](https://github.com/justedlev/bridgewayhub/commit/3651b25bbddfd66483fa149b1a6a2707ff16b4ad))
* **management:** expose separate management server port ([dbbb9cc](https://github.com/justedlev/bridgewayhub/commit/dbbb9ccc56a0f93cac29d7f76b51e2b19f959528))
* migrate to spring boot v4 ([70272da](https://github.com/justedlev/bridgewayhub/commit/70272dadaec82970952a7dd52aac621feb4dd75f))
* migrate to spring boot v4 ([a206a0d](https://github.com/justedlev/bridgewayhub/commit/a206a0d4c26e8fb55cdaf980e7058ed38c0ae7f5))
* **security:** add oauth2 for `WebClient` ([73cc460](https://github.com/justedlev/bridgewayhub/commit/73cc460c9fbc4cef0bc5c80eb23073230a5c82a4)), closes [#80](https://github.com/justedlev/bridgewayhub/issues/80)
* **security:** update `SecurityConfiguration` ([9438850](https://github.com/justedlev/bridgewayhub/commit/9438850590c5876a26b5e71364eef3c0adeeb7b6))
* **security:** update logout handler ([d1642b2](https://github.com/justedlev/bridgewayhub/commit/d1642b2ec6b92acb0354628d3bd95b5447382a7a))
* update .env ([a8c4d0c](https://github.com/justedlev/bridgewayhub/commit/a8c4d0c02dcc1470452e5c16dd16d981f24936b0))
* update default user creds ([b6a3794](https://github.com/justedlev/bridgewayhub/commit/b6a379457e17aaf9130a4720379e172e4e506a3e))
* update gateway config ([030cfb9](https://github.com/justedlev/bridgewayhub/commit/030cfb999248a4eccbaf0f954dcec3263449f318))
* use `client_credentials` client reg grant type ([d82ba6d](https://github.com/justedlev/bridgewayhub/commit/d82ba6d175d64735aa2f84c828c5fd3d69b42275))
* use customizable auto configuration ([39da981](https://github.com/justedlev/bridgewayhub/commit/39da98186d8b4346c822621fae5065ed27ef0d5c))


### 🐛 Bug Fixes

* cannot resolve configuration property 'spring.cloud.discovery.reactive.enabled' ([4e214c3](https://github.com/justedlev/bridgewayhub/commit/4e214c3df3fbfa4d165434b2a8a8da333479119b))
* **config:** change `redirect-uri` path ([4c5b3f7](https://github.com/justedlev/bridgewayhub/commit/4c5b3f714cee861e9fea40725229383782bab4d0))
* **config:** fail with 404 not found on prometheus scrape ([3b6886b](https://github.com/justedlev/bridgewayhub/commit/3b6886b50595495e99545daedacc719fe12bd37d))
* **config:** incorrect management port ([9026d42](https://github.com/justedlev/bridgewayhub/commit/9026d42c36a209728d32af001c26b594d81b9fdb))
* **config:** remove extra properties ([7388987](https://github.com/justedlev/bridgewayhub/commit/7388987c5ede72ebcedf01329bb7d95a896c094a))
* **config:** remove logging `trace` level ([ac894d6](https://github.com/justedlev/bridgewayhub/commit/ac894d6d4a8ade9bef8b57af22fa3d6751bad76c))
* **config:** use correct profiles order ([bf04b32](https://github.com/justedlev/bridgewayhub/commit/bf04b3228bd09bd821a238df8e8486aa9ce06cae))
* **config:** use reactive configuration ([ce76eaf](https://github.com/justedlev/bridgewayhub/commit/ce76eaf37b80b61f941dcc0a7ee8759a3db653df))
* **gha:** correct configuration for `kentaro-m/auto-assign-action` ([982c088](https://github.com/justedlev/bridgewayhub/commit/982c0888011663352dfeb1bc24fa7ebc6914ffe0))
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
* **logging:** name from env ([f8c407d](https://github.com/justedlev/bridgewayhub/commit/f8c407dfc23adaaafaf51e9475e68b044156b518))
* normalize line endings using `.gitattributes` ([3aec177](https://github.com/justedlev/bridgewayhub/commit/3aec177680dc6c2953aa3c0239c1d5e4e0e6c857))
* normalize line endings using `.gitattributes` ([63072d1](https://github.com/justedlev/bridgewayhub/commit/63072d150eab58096aec2a0ec99b9a0cb328bfda)), closes [#69](https://github.com/justedlev/bridgewayhub/issues/69)
* registration failed if dont use `discovery` profile ([3096e2a](https://github.com/justedlev/bridgewayhub/commit/3096e2a629842449501e74e57eab0d47da3b5695))
* unautorized error on discovery registry ([a56d9b0](https://github.com/justedlev/bridgewayhub/commit/a56d9b0aba389749018647fc80ea3136de562f90))
* update `banner.txt` ([b5deec4](https://github.com/justedlev/bridgewayhub/commit/b5deec4f86ad2128d51ca7a676849933bffa40d6))


### ♻️ Refactoring

* add .run to .gitignore ([a030c49](https://github.com/justedlev/bridgewayhub/commit/a030c49273bfe7f9253b75ff3345499701fa8e88))
* add `CODEOWNERS` EOF ([c94c7b8](https://github.com/justedlev/bridgewayhub/commit/c94c7b823dbe6b09debd6a3e5f3417e1cfa11d69))
* add env variable ([3bff1ff](https://github.com/justedlev/bridgewayhub/commit/3bff1ff10d41a4027002127d43a37e1166d45ea4))
* add separate logging for debug mode ([a76f9b2](https://github.com/justedlev/bridgewayhub/commit/a76f9b24fa61da09968efe7bc7a328a574fa6842))
* change log files dir ([2746b83](https://github.com/justedlev/bridgewayhub/commit/2746b83a5ec27f35b26a057605bcdc1007df39cf))
* change RewritePath filter for keycloak routing ([ed2d70e](https://github.com/justedlev/bridgewayhub/commit/ed2d70e44af712f8410846e6b9bd707b434de9d1))
* change root package name ([3975eae](https://github.com/justedlev/bridgewayhub/commit/3975eaeeb6a04c03475a7a2c6af752db620b2885))
* **config:** remove `application-lite.yml` ([3ee0bc8](https://github.com/justedlev/bridgewayhub/commit/3ee0bc88329da6e7954d0dab2b1e175debe81c02))
* **config:** remove `bootstrap.yml` ([ba5529d](https://github.com/justedlev/bridgewayhub/commit/ba5529d0729a70ea76bbde1e73e082d7b8bd57ca))
* **config:** remove `logging.file` props ([3eeacd2](https://github.com/justedlev/bridgewayhub/commit/3eeacd2b284dd074d9ef2dcf615af9e8eab463ae))
* **config:** remove `logging.threshold` props ([4000c3e](https://github.com/justedlev/bridgewayhub/commit/4000c3ed321be3381af0381bb1736cbeac1af89a))
* **config:** remove extra env ([473573f](https://github.com/justedlev/bridgewayhub/commit/473573ff8173fdd2fb992deb6600d0120af7096d))
* **config:** remove extra gateway routes ([83946af](https://github.com/justedlev/bridgewayhub/commit/83946aff751040158b6b1c75ba39f163bd0c3a65))
* **config:** remove extra props ([794c50c](https://github.com/justedlev/bridgewayhub/commit/794c50c3a3f5b78d528dc7a22375e7f4b6e5d731))
* **config:** remove rabbit config ([8e7ee92](https://github.com/justedlev/bridgewayhub/commit/8e7ee92cacba0acddda4473c3a39ff77832210d8))
* **config:** rename bean name ([8dc3aff](https://github.com/justedlev/bridgewayhub/commit/8dc3aff689e333087ed41da1cfb46f0c56a0c852))
* **config:** rename root package name ([61e12c0](https://github.com/justedlev/bridgewayhub/commit/61e12c0df4a3e13b7a3f89bd1c912035564904f2))
* **config:** use fixed eureka defaultZone url ([8ae8d9f](https://github.com/justedlev/bridgewayhub/commit/8ae8d9f5bb040fa3673703843c36499046e41da2))
* **docs:** update README.md ([78fb77d](https://github.com/justedlev/bridgewayhub/commit/78fb77d3ebbfe97dacd31feb5909984acda53b3c))
* **env:** nested variables must not appear outside double quotes ([ca18a2f](https://github.com/justedlev/bridgewayhub/commit/ca18a2f8ae90c4a27baaf9a3f1485e85b99c3283))
* **env:** rename env name ([e55cc30](https://github.com/justedlev/bridgewayhub/commit/e55cc308feda7689adfb2b48745bd1f8c7a776c7))
* extract `SecurityProperties.PREFIX` const ([a740744](https://github.com/justedlev/bridgewayhub/commit/a740744827398b73b83c43384702bc86c3255197))
* fix deprecated properties ([212a3ac](https://github.com/justedlev/bridgewayhub/commit/212a3acd8442e7674ae6b9b9eadc3771f38b97e8))
* **logging:** update logging threshold ([1112da2](https://github.com/justedlev/bridgewayhub/commit/1112da211040fc972328cde460291473a194120c))
* move .dockerignore to docker dir ([74bce46](https://github.com/justedlev/bridgewayhub/commit/74bce46311cbe14f1206b7998e8531526887c0c1))
* move `server` properties to separate file ([f982775](https://github.com/justedlev/bridgewayhub/commit/f9827754d38befc6d9f1d2320d622bdb96ea4718))
* move `whitelist` property to `SecurityConfiguration` scope ([7091771](https://github.com/justedlev/bridgewayhub/commit/7091771b84a2e91ac4e7da99c48ba26de6d5b89c))
* move debug-file-appender.xml ([cd289ec](https://github.com/justedlev/bridgewayhub/commit/cd289ec76e4861390298008b68c5d0b53446f3fc))
* move separated props to `application.yml` ([68cb67e](https://github.com/justedlev/bridgewayhub/commit/68cb67e71d14faee3b7f81bb017e38e195621547))
* moved `whitelist` to configuration properties class ([563587f](https://github.com/justedlev/bridgewayhub/commit/563587fb467133c1494588cffee48eb494177e52))
* remove ([9d62ba4](https://github.com/justedlev/bridgewayhub/commit/9d62ba49909bc58968a53112bd9eb9aae01ab35f))
* remove `exclusions` ([ca6da26](https://github.com/justedlev/bridgewayhub/commit/ca6da26352fe2972ac12bddef8592452eacc24aa))
* remove `SecurityConfiguration.java` ([c886f84](https://github.com/justedlev/bridgewayhub/commit/c886f848fdeb1901f1ba59cbf3e7f8eba59e1a6c))
* remove `SERVER_PORT` ([be2e99a](https://github.com/justedlev/bridgewayhub/commit/be2e99a52df5184d8fcbfdd491f09124898a2463))
* remove `spring.security.user` props ([31003a1](https://github.com/justedlev/bridgewayhub/commit/31003a1af0b46b8c2e191eb390de633c257f703d))
* remove basic from default eureka config props ([eaebfb9](https://github.com/justedlev/bridgewayhub/commit/eaebfb9894145f4885b611ddbc435605b573f91e))
* remove compose.yaml ([b492dfa](https://github.com/justedlev/bridgewayhub/commit/b492dfaab8a856d89f0797463c1dc8f238bc6c0f))
* remove custom logging config ([b14a82a](https://github.com/justedlev/bridgewayhub/commit/b14a82a5a8eae64bea8aad720a54eb27026569d3))
* remove Default.run.xml ([a92b3a9](https://github.com/justedlev/bridgewayhub/commit/a92b3a9855b01664c741dbbb750e55d6b515731c))
* remove deprecated properties ([778a241](https://github.com/justedlev/bridgewayhub/commit/778a24152c39945629d88587a990a80320bed986))
* remove Dockerfile ([ec8119d](https://github.com/justedlev/bridgewayhub/commit/ec8119d7a2a8934f852e83d20c786e98542b22a4))
* remove extra endpoints ([73c9367](https://github.com/justedlev/bridgewayhub/commit/73c9367e50c2c41aae3cb7cd557342a3feb365a7))
* remove extra log appender ([3e2af3b](https://github.com/justedlev/bridgewayhub/commit/3e2af3b5aae6bb81bd3f541df84a323bbcd0ad5b))
* remove extra rout ([9ecd785](https://github.com/justedlev/bridgewayhub/commit/9ecd7850c33d39f6b6b31bfcb00329db6752d1eb))
* remove property classes ([567b23a](https://github.com/justedlev/bridgewayhub/commit/567b23a54a3420b25da861f0a9fed9ee7f10c910))
* rename `BridgeWayHubApplicationTests.java` ([51358a3](https://github.com/justedlev/bridgewayhub/commit/51358a3e0aa44f3cace090cc0a05ec68b67056c7))
* rename package from `io.github.justedlev.bridgeway.autoconfiguration` to `io.github.justedlev.bridgeway.autoconfigure` ([575f23e](https://github.com/justedlev/bridgewayhub/commit/575f23ef83bd144e4cfa13185ee767bb4652c073))
* rename package from `io.github.justedlev.bridgeway.autoconfiguration` to `io.github.justedlev.bridgeway.autoconfigure` ([262a98d](https://github.com/justedlev/bridgewayhub/commit/262a98dc328be155f10bd6a919f40dabe0e43298))
* rename package to `io.github.justedlev.bridgeway.autoconfigure` ([261678c](https://github.com/justedlev/bridgewayhub/commit/261678c5cc41f03b699bb02137bd63209be5768b))
* return `/*/*/v3/api-docs/**` pattern ([914da99](https://github.com/justedlev/bridgewayhub/commit/914da9942e763e2ae382405227da158f3fbc327a))
* **sec:** update SecurityConfiguration.java ([3077926](https://github.com/justedlev/bridgewayhub/commit/30779265524451b05b20af7b9f09a1234c2720e8))
* uncomment `security.whitelist` ([4d027d0](https://github.com/justedlev/bridgewayhub/commit/4d027d039804163f84b56d0697ad9a2393ed96c8))
* update `.env` ([6d89d79](https://github.com/justedlev/bridgewayhub/commit/6d89d791176e8cfe3382b7855645b0be4dc21515))
* update `release-please-config.json` ([2dfc4a0](https://github.com/justedlev/bridgewayhub/commit/2dfc4a019b9dc95ddf588f5f11dd38ec528bf5f4))
* update `SecurityConfiguration.java` ([c715d88](https://github.com/justedlev/bridgewayhub/commit/c715d88d51dc1e3c8185085933d025dc71174d12))
* update banner.txt ([a6e698a](https://github.com/justedlev/bridgewayhub/commit/a6e698a1de79bcf5a8e3dc02e5a4b8a1d1db80b7))
* update compose.yaml ([6f05bc8](https://github.com/justedlev/bridgewayhub/commit/6f05bc807c86c1f44206f0cc0a4233d406244322))
* update envs in .env ([cbd78e7](https://github.com/justedlev/bridgewayhub/commit/cbd78e7d00347f2a2703e89d2606dfec31d4d726))
* update logging ([a7dd324](https://github.com/justedlev/bridgewayhub/commit/a7dd324ae9efd9c3c45b01a3185ba74fcb6f446e))
* update properties ([c1194a3](https://github.com/justedlev/bridgewayhub/commit/c1194a39236ec2d208c0bb3156326f5a377045a7))
* update security.yml ([d624592](https://github.com/justedlev/bridgewayhub/commit/d6245928ef7447f6dd1626e4462758ea10c73fe2))
* use default app name ([99986da](https://github.com/justedlev/bridgewayhub/commit/99986da001e1cc28aea2820ddd0c50d8407943ab))


### 📚 Documentation

* add `bug_report.yml` issue template ([376ea77](https://github.com/justedlev/bridgewayhub/commit/376ea77eaffea7aa517e73182ab0672a94c0bbba))
* add `CHANGELOG.md` ([7441cc8](https://github.com/justedlev/bridgewayhub/commit/7441cc8b1ca2e7e31e1b25a620d3cdcf231048a4))
* add `config.yml` issue template ([6ddbcd9](https://github.com/justedlev/bridgewayhub/commit/6ddbcd9b7958e3ff4143a2d74bd36e11c9953e1b))
* add `feature_request.yml` issue template ([eff486c](https://github.com/justedlev/bridgewayhub/commit/eff486cfb0e5c2e8a4f58632010a2c272741a721))
* add `PULL_REQUEST_TEMPLATE.md` ([8a179f0](https://github.com/justedlev/bridgewayhub/commit/8a179f034f3dbb28dc0383f1c492277b8e886380))
* add `SECURITY.md` ([fc5efdd](https://github.com/justedlev/bridgewayhub/commit/fc5efddb30d4550343bc2087b458b2caf0807a57))
* enrich `CHANGELOG.md` ([cb6cabc](https://github.com/justedlev/bridgewayhub/commit/cb6cabc26ab02575f3f34de0672a28de0ee32cc4))
* remove README.Docker.md ([ef8b43a](https://github.com/justedlev/bridgewayhub/commit/ef8b43a6dcd55a697b451c647a66adb81fa339c7))
* update `PULL_REQUEST_TEMPLATE.md` ([adf81f6](https://github.com/justedlev/bridgewayhub/commit/adf81f683afbb5267c0e57070095871ae132c182))
* update `README.md` ([c54ed23](https://github.com/justedlev/bridgewayhub/commit/c54ed2300d1102f31c3507e13e66049371ce4326))
* update README.md ([9311c50](https://github.com/justedlev/bridgewayhub/commit/9311c50f25d962924eb4bd6e8668007946c52422))
* update README.md ([c9ca247](https://github.com/justedlev/bridgewayhub/commit/c9ca2471ff414f80154cc975a540e1ce38c6188a))
* update README.md ([512e1ce](https://github.com/justedlev/bridgewayhub/commit/512e1ce11ce5d05549912650089e38c4d311a53b))
* update README.md ([f125d2d](https://github.com/justedlev/bridgewayhub/commit/f125d2d2f62d2c41c85937da1b2db9def1feb47b))
* update README.md ([b3aa4ef](https://github.com/justedlev/bridgewayhub/commit/b3aa4efe182239e19723dd7c0998c58e2ce13137))
* update README.md ([76b2b70](https://github.com/justedlev/bridgewayhub/commit/76b2b70f001bab758e148401003dc8dec1e9b085))
* update README.md ([8ad8848](https://github.com/justedlev/bridgewayhub/commit/8ad88488973c3dd3d0e306ad4ec3102b82367be4))
* update README.md ([d897d20](https://github.com/justedlev/bridgewayhub/commit/d897d2019b59e9d379e808caa4cd640ba5bf5873))
* update README.md ([e2f73f9](https://github.com/justedlev/bridgewayhub/commit/e2f73f9326a24d8730ab03c1d24529939936ba6d))
* update README.md ([b169119](https://github.com/justedlev/bridgewayhub/commit/b169119ee6ac36fffbdbb901a1c21c9c66070de7))
* update README.md ([b1e514d](https://github.com/justedlev/bridgewayhub/commit/b1e514db42b103f6b4a8d8a98713f85b0b30366d))
* update README.md ([47a6e01](https://github.com/justedlev/bridgewayhub/commit/47a6e016ad59a187ab5cf434b78cd8ac5b03bb3f))
* update README.md ([18acbc1](https://github.com/justedlev/bridgewayhub/commit/18acbc12c32f9dd1451ac9bca731fce71c5e90e0))
* update README.md ([913c7df](https://github.com/justedlev/bridgewayhub/commit/913c7df387b4b1f66c613d2535f71d891a0850c8))
* update README.md ([c7ba5fd](https://github.com/justedlev/bridgewayhub/commit/c7ba5fddd0a72d57bb9248b06a9ad61f826a2662))
* update README.md ([7be8f64](https://github.com/justedlev/bridgewayhub/commit/7be8f64f31adbad425a68b5a2744050bfbc924c8))
* update README.md, moved to root path ([72b7223](https://github.com/justedlev/bridgewayhub/commit/72b7223c8e0076b58ed438dfeb4664c3ed4b1cbc))


### 🧪 Tests

* add `application.yml` ([7636437](https://github.com/justedlev/bridgewayhub/commit/7636437690f54b4e3896b0beae4ee741900f9d72))


### 🧹 Chores

* release 1.0.0 ([e4129a7](https://github.com/justedlev/bridgewayhub/commit/e4129a744c89d4d8a8c5cb325ec65609dc9920f2))


### ⚙️ Build

* bump version ([3ec36d2](https://github.com/justedlev/bridgewayhub/commit/3ec36d285038d16549a1a8f9236ceaac9ff29f7b))
* bump version ([55d3727](https://github.com/justedlev/bridgewayhub/commit/55d3727addf680a94e314b5ba5ee670e10866a8c))
* bump version ([de88ec1](https://github.com/justedlev/bridgewayhub/commit/de88ec1b0ea0be80ac991dac0d821f7edb29a0b7))
* bump version ([a0aaedd](https://github.com/justedlev/bridgewayhub/commit/a0aaeddb22cd78323d170ec6c39a3298904ce4f2))
* **deps:** add `micrometer-registry-prometheus` ([c911180](https://github.com/justedlev/bridgewayhub/commit/c911180a1566c8307cc7fc54c75d003c0a6d3744))
* **deps:** add `org.springframework.boot:spring-boot-webclient` ([d09f8d9](https://github.com/justedlev/bridgewayhub/commit/d09f8d9ba5fe59df0e94a392585ce20b84a3c962))
* **deps:** add `org.springframework.cloud:spring-cloud-starter-bus-amqp` ([d976a0d](https://github.com/justedlev/bridgewayhub/commit/d976a0d34aad6a03d18583f4f42c705026589e73))
* **deps:** bump actions/cache from 4 to 5 ([90e1032](https://github.com/justedlev/bridgewayhub/commit/90e10329db10f90aaddbec60aa6b093678227215))
* **deps:** bump actions/checkout from 4 to 5 ([14eaae9](https://github.com/justedlev/bridgewayhub/commit/14eaae90e5bd77f0f49ced02f1cbd5a0a443c4e0))
* **deps:** bump actions/checkout from 5 to 6 ([5a47f9a](https://github.com/justedlev/bridgewayhub/commit/5a47f9a3d988454c24349e0020d0e6c2f3d0bd52))
* **deps:** bump actions/checkout from 5 to 6 ([dcabba0](https://github.com/justedlev/bridgewayhub/commit/dcabba053f749caef813a80e0ce3331bc1626310))
* **deps:** bump actions/checkout from 5 to 6 ([bc5307d](https://github.com/justedlev/bridgewayhub/commit/bc5307d0818f7a6701c124356e2160516a5ab026))
* **deps:** bump actions/labeler from 5 to 6 ([d407ec2](https://github.com/justedlev/bridgewayhub/commit/d407ec2114b18646b3a9082a6877066e932f9b69))
* **deps:** bump docker/build-push-action from 6 to 7 ([47e5ab6](https://github.com/justedlev/bridgewayhub/commit/47e5ab6fe029432aca81c15bb5ecbd65e8ebf068))
* **deps:** bump docker/build-push-action from 6 to 7 ([ffd5a91](https://github.com/justedlev/bridgewayhub/commit/ffd5a9186d1bdfaf775ae078cc44b5591098fb69))
* **deps:** bump docker/login-action from 3 to 4 ([5cfee4c](https://github.com/justedlev/bridgewayhub/commit/5cfee4cb9c6a82f7fc612e6495d4ce3cd98fa2cb))
* **deps:** bump docker/login-action from 3 to 4 ([459428f](https://github.com/justedlev/bridgewayhub/commit/459428fd624c286004f8b6e23946311c9ceae887))
* **deps:** bump docker/metadata-action from 5 to 6 ([41c3af5](https://github.com/justedlev/bridgewayhub/commit/41c3af5069a41be3eafc62d3194b2eb4466a2a60))
* **deps:** bump docker/metadata-action from 5 to 6 ([92929af](https://github.com/justedlev/bridgewayhub/commit/92929afa85ef6b929d48d161c0489f55307bdd42))
* **deps:** bump docker/setup-buildx-action from 3 to 4 ([75f34a3](https://github.com/justedlev/bridgewayhub/commit/75f34a38e1132a4ce3887775afbb3e5e09a22fb8))
* **deps:** bump docker/setup-buildx-action from 3 to 4 ([40a91a7](https://github.com/justedlev/bridgewayhub/commit/40a91a7a3af6b8faccdddda467e46b834c630ce6))
* **deps:** bump github/codeql-action from 3 to 4 ([39fbae7](https://github.com/justedlev/bridgewayhub/commit/39fbae7df37f8ebb6cfb7d4fd11418b0c377a7ec))
* **deps:** bump org.apache.httpcomponents:httpclient ([b2752c2](https://github.com/justedlev/bridgewayhub/commit/b2752c2546f2dcf88c80e20fb3d2daec6e026004))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin ([30f51b5](https://github.com/justedlev/bridgewayhub/commit/30f51b5d311542474fe928020b63c83696953953))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin ([f7c4e08](https://github.com/justedlev/bridgewayhub/commit/f7c4e089aca1b35b4101115601f433a63d61394b))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin from 3.4.2 to 3.5.0 ([5d9c02c](https://github.com/justedlev/bridgewayhub/commit/5d9c02c237eec25443e571e44f39483e7dbcdcc6))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([269d6b8](https://github.com/justedlev/bridgewayhub/commit/269d6b8a82f7d4c1c0f5298e76bc353036292a14))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([09e1a66](https://github.com/justedlev/bridgewayhub/commit/09e1a669d16829948edb14551192da13ae58ee9e))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([85c9eea](https://github.com/justedlev/bridgewayhub/commit/85c9eeaf7ca53a27f4405275a9c2d9c2d048bede))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([d047150](https://github.com/justedlev/bridgewayhub/commit/d047150076f543fb8294abdd5257988eded63b8b))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([eb09b96](https://github.com/justedlev/bridgewayhub/commit/eb09b962314a28cdb1dc0d86a7fad79416074c24))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([e94abdc](https://github.com/justedlev/bridgewayhub/commit/e94abdcab34ae48ee2110bf560b3aaed01db5a41))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([0f6ad88](https://github.com/justedlev/bridgewayhub/commit/0f6ad88aafc87d4505ccac02bba7b6cb9b5d8cd7))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([536b445](https://github.com/justedlev/bridgewayhub/commit/536b445b3a1d99440f0b041cf0e8eb1bab07cbbc))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([7312184](https://github.com/justedlev/bridgewayhub/commit/731218408c437dbecefa34fb141e93f3b632adfd))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui from 2.6.0 to 2.8.4 ([ec361b8](https://github.com/justedlev/bridgewayhub/commit/ec361b808970e8ddc7831dbf2d221801dcc4cdfc))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui from 2.8.13 to 3.0.2 ([7a5d256](https://github.com/justedlev/bridgewayhub/commit/7a5d256d0d06292344c34e89467583cf81bb4ed2))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui from 2.8.4 to 2.8.5 ([1bb2c85](https://github.com/justedlev/bridgewayhub/commit/1bb2c85de988c1cde682d8bdd7bdd25336803196))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([ee0a886](https://github.com/justedlev/bridgewayhub/commit/ee0a8869b1d3af64d4143326a81891a876420684))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([60a3d1b](https://github.com/justedlev/bridgewayhub/commit/60a3d1bfb4a8bbb02ce24f2495d062670652b9ca))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([6277ce4](https://github.com/justedlev/bridgewayhub/commit/6277ce47059c8eae9b97e7410f4ed3f5bd3883d5))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([dfd8230](https://github.com/justedlev/bridgewayhub/commit/dfd82305daf00351bb39fdcc08b533c18de6e3ac))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([918441b](https://github.com/justedlev/bridgewayhub/commit/918441befed9ce9b949f413ff6b7b7250089e6a2))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([d0fd63c](https://github.com/justedlev/bridgewayhub/commit/d0fd63c89a2f6e5c75a0878a602babd7fa251caa))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([6922387](https://github.com/justedlev/bridgewayhub/commit/69223875dc56460336fadda5c3f3bb47bdb902b1))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([2239438](https://github.com/justedlev/bridgewayhub/commit/22394381916cc0f147d498fffcdfc240e763c43a))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([9aeedd8](https://github.com/justedlev/bridgewayhub/commit/9aeedd8725ebcdf36e58f5465a5e9138af9a500b))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([aa0ce19](https://github.com/justedlev/bridgewayhub/commit/aa0ce1983cb4dfae3856f6549f60e82685856f7f))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([18f31ba](https://github.com/justedlev/bridgewayhub/commit/18f31ba7cb0e138ba3e2b8273e3d999d1f9b611a))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([d2ae61a](https://github.com/justedlev/bridgewayhub/commit/d2ae61a95271c1a771cfead50d11fc88deb3cb8a))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([e2d7934](https://github.com/justedlev/bridgewayhub/commit/e2d79348ce8db06d420e2416541fe1b7f0a2e4eb))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent from 3.3.4 to 3.4.2 ([bf98ac9](https://github.com/justedlev/bridgewayhub/commit/bf98ac9ae9a54d63d7eff954245edf5241b0553d))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent from 3.5.6 to 4.0.4 ([dd4d4b0](https://github.com/justedlev/bridgewayhub/commit/dd4d4b03932eb1c3f2b7380abf4476929c241fba))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent from 4.0.0 to 4.0.1 ([b14f248](https://github.com/justedlev/bridgewayhub/commit/b14f2482eb1d9ea066f72ff600bd721e563d7a4c))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([6c7d110](https://github.com/justedlev/bridgewayhub/commit/6c7d110f310115da1f2911e95eec4b99a7df6efa))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([e7499fc](https://github.com/justedlev/bridgewayhub/commit/e7499fc60e0c988c93fed2f63221d2d3a4eb03b5))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([84c2b6f](https://github.com/justedlev/bridgewayhub/commit/84c2b6f33d4991c62f51b3ff70a0702bc2c7c4b9))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([6c2807e](https://github.com/justedlev/bridgewayhub/commit/6c2807ea2325e68920c77cb79e19aa88189d67e4))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([b1c16ef](https://github.com/justedlev/bridgewayhub/commit/b1c16ef2e16862754d572d0818bab0d5ac8b94f9))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies from 2023.0.3 to 2024.0.0 ([b7b53a3](https://github.com/justedlev/bridgewayhub/commit/b7b53a3514f823025d69a12d7d6a56e5b47ffa3f))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies from 2025.0.0 to 2025.1.1 ([d27348e](https://github.com/justedlev/bridgewayhub/commit/d27348e56fc7a174b9c1d64706e4f1e619b1ed5b))
* **deps:** fix vulnerabilities ([a0f9ac9](https://github.com/justedlev/bridgewayhub/commit/a0f9ac96c7440b93ef802a10e39dd62a9d4bd2f2))
* **docker-compose:** remove `volumes` ([b451166](https://github.com/justedlev/bridgewayhub/commit/b451166fbb22406e70f9ac5b7f0cc5a8cdd68517))
* **docker:** add metadata ([634c4dd](https://github.com/justedlev/bridgewayhub/commit/634c4dd49d611c468bacd8e9c36432f627ac5604))
* **docker:** expose separate management port ([ec12326](https://github.com/justedlev/bridgewayhub/commit/ec12326acb4c2c6af30b0dd2a94e4dd6163a2764))
* **docker:** fix healthcheck bad substitution error ([5fbac9e](https://github.com/justedlev/bridgewayhub/commit/5fbac9ea7741d732908ca1882a5ab4524085d5f4))
* **docker:** fix healthcheck script ([54bc4e2](https://github.com/justedlev/bridgewayhub/commit/54bc4e29412021c0a5ec68a5669e2dab77a7c977))
* **docker:** fix healthcheck script ([e0b30d9](https://github.com/justedlev/bridgewayhub/commit/e0b30d9e36f29edb0b6bc2e8b2c72a3b2b70a3bf))
* **docker:** fix ports ([aa03a5e](https://github.com/justedlev/bridgewayhub/commit/aa03a5eda92d8e092ef7b318253445af4308fd32))
* **docker:** remove debug mode ([58e2728](https://github.com/justedlev/bridgewayhub/commit/58e2728821e67ac07b7a29005b9a56afdacebb69))
* **docker:** update `.env` ([a627d72](https://github.com/justedlev/bridgewayhub/commit/a627d722e702ceee63e76a4bb5d902c04c1716ee))
* **docker:** update `compose.yaml` ([68159e7](https://github.com/justedlev/bridgewayhub/commit/68159e75b1f49894898e8209fa63cbb8fce346d4))
* **docker:** update `compose.yaml` ([0ef4be4](https://github.com/justedlev/bridgewayhub/commit/0ef4be40357ba432c97a6e17e6a890ba717f6be6))
* **docker:** update `compose.yaml` ([4fc18f8](https://github.com/justedlev/bridgewayhub/commit/4fc18f8c81aeb4c43696da1f8ea891c61d905cae))
* **docker:** update `entrypoint.sh` ([34871f8](https://github.com/justedlev/bridgewayhub/commit/34871f803ba5603da95405fc41e586c2323a65bd))
* **docker:** update compose.yaml ([b84ff01](https://github.com/justedlev/bridgewayhub/commit/b84ff01bb43081994631932611ee190825662ca3))
* **docker:** update Dockerfile ([883586d](https://github.com/justedlev/bridgewayhub/commit/883586d350e8b9603f5e240f0a35e9c8ff6e5c07))
* **docker:** update service-registry ([0768877](https://github.com/justedlev/bridgewayhub/commit/0768877931bce01f25199b69210b876489cce075))
* **docker:** use default port ([8381352](https://github.com/justedlev/bridgewayhub/commit/8381352ea40a62d052921549def657f174d199a6))
* **docker:** use env port ([c7f9ecb](https://github.com/justedlev/bridgewayhub/commit/c7f9ecb1c747bc956518252370dbac440546adba))
* **docker:** use env_file ([6750aba](https://github.com/justedlev/bridgewayhub/commit/6750aba4cea4356172a961b9ad6f0b381f9086e8))
* **docker:** use standard keycloak port ([dab644b](https://github.com/justedlev/bridgewayhub/commit/dab644bdd68259ea15a9cebba541069c122510fc))
* **gha:** remove `test` job ([37f72eb](https://github.com/justedlev/bridgewayhub/commit/37f72ebb01d52e60d973356b9d90c42e805282c6))
* **gha:** update `docker-image.yml` build job ([3e4fdc2](https://github.com/justedlev/bridgewayhub/commit/3e4fdc2e7536e35ca20f0f05014a4885ada2d9e0))
* **mvn:** bump maven wrapper to `3.9.12` ([be60ac0](https://github.com/justedlev/bridgewayhub/commit/be60ac03a92d60e08e0518a254d1a892d91e65a1))
* **mvn:** bump version ([1ba6c78](https://github.com/justedlev/bridgewayhub/commit/1ba6c78fa1035e998cfba543bde06aec0f05e34a))
* **mvn:** bump version ([4fc7f70](https://github.com/justedlev/bridgewayhub/commit/4fc7f7015e850547d784dbaf6cd9e1ce755c83f8))
* **mvn:** bump version ([7e33138](https://github.com/justedlev/bridgewayhub/commit/7e331386dd4e6679ec8bbf6a994994217cf680b4))
* **mvn:** bump version ([68a8ba5](https://github.com/justedlev/bridgewayhub/commit/68a8ba5863e5a03789b46707c928288a5a996d2a))
* **mvn:** bump version ([e4b41cb](https://github.com/justedlev/bridgewayhub/commit/e4b41cb0654146c4f92e92382285c3061366ce19))
* **mvn:** bump version `v0.3.0` ([eb6fe79](https://github.com/justedlev/bridgewayhub/commit/eb6fe7967c9fe766da39260e9d9ed86f0b4cca16))
* **mvn:** improve build plugin configuration ([be6491c](https://github.com/justedlev/bridgewayhub/commit/be6491cd0b044f4ee95960b9cfb3fd1c002f4ae1))
* **mvn:** remove unused deps ([74bfa33](https://github.com/justedlev/bridgewayhub/commit/74bfa33da9cc386881fc0983d723b7308771b648))
* **mvn:** update `pom.xml` ([8efdddc](https://github.com/justedlev/bridgewayhub/commit/8efdddc97ed857b6e457f170366dde0949e17178))
* **mvn:** update `project.name` ([840850e](https://github.com/justedlev/bridgewayhub/commit/840850e915ac49dad8696fc2e2e61d34a524d35c))
* **mvn:** update pom.xml ([9ce4ad9](https://github.com/justedlev/bridgewayhub/commit/9ce4ad9534453911250a0c8213fa3107ac5dca96))
* **mvn:** use `org.springframework.cloud:spring-cloud-starter-gateway-server-webflux` ([3263ffe](https://github.com/justedlev/bridgewayhub/commit/3263ffefbb199f622984b98f776107b1477d2ac9))
* **mvn:** version upgrade ([ba7980f](https://github.com/justedlev/bridgewayhub/commit/ba7980fb15a04e6bed349a1bb50c42fd48c374ac))
* **mvnw:** bump maven wrapper to `3.9.12` ([26ed4d9](https://github.com/justedlev/bridgewayhub/commit/26ed4d9c9c6f1655d63d0a3cd9fdbcd7d373229c))
* update `pom.xml` ([b95257d](https://github.com/justedlev/bridgewayhub/commit/b95257d5a11fb75abb6b0dcba3c999b5899e6d37))
* update `pom.xml` ([106998e](https://github.com/justedlev/bridgewayhub/commit/106998e4e06ee2669fad101b621b36f5f8f0375e))
* update compose.yaml ([030a96c](https://github.com/justedlev/bridgewayhub/commit/030a96caadb0f630ceaa0ad21cf3bf8fe93c6b77))
* update pom.xml ([383083d](https://github.com/justedlev/bridgewayhub/commit/383083d6a671ebf4f59fe995b543083c56ffb253))
* version upgrade ([d0702ec](https://github.com/justedlev/bridgewayhub/commit/d0702ec5772f7f930a34a4a4d827b8c95c045414))
* version upgrade ([81c2b78](https://github.com/justedlev/bridgewayhub/commit/81c2b78a062b3bc85283e7a01cfbd91b23c8e63e))

## [1.0.3](https://github.com/justedlev/bridgewayhub/compare/v1.0.2...v1.0.3) (2026-07-13)


### ⚙️ Build

* update `pom.xml` ([b95257d](https://github.com/justedlev/bridgewayhub/commit/b95257d5a11fb75abb6b0dcba3c999b5899e6d37))

## [1.0.2](https://github.com/justedlev/bridgewayhub/compare/v1.0.1...v1.0.2) (2026-04-08)


### ♻️ Refactoring

* **config:** rename bean name ([8dc3aff](https://github.com/justedlev/bridgewayhub/commit/8dc3aff689e333087ed41da1cfb46f0c56a0c852))


### ⚙️ Build

* update `pom.xml` ([106998e](https://github.com/justedlev/bridgewayhub/commit/106998e4e06ee2669fad101b621b36f5f8f0375e))

## [1.0.1](https://github.com/justedlev/bridgewayhub/compare/v1.0.0...v1.0.1) (2026-04-07)


### 🐛 Bug Fixes

* cannot resolve configuration property 'spring.cloud.discovery.reactive.enabled' ([4e214c3](https://github.com/justedlev/bridgewayhub/commit/4e214c3df3fbfa4d165434b2a8a8da333479119b))
* unautorized error on discovery registry ([a56d9b0](https://github.com/justedlev/bridgewayhub/commit/a56d9b0aba389749018647fc80ea3136de562f90))


### ⚙️ Build

* **deps:** add `org.springframework.boot:spring-boot-webclient` ([d09f8d9](https://github.com/justedlev/bridgewayhub/commit/d09f8d9ba5fe59df0e94a392585ce20b84a3c962))

## [1.0.0](https://github.com/justedlev/bridgewayhub/compare/v0.11.0...v1.0.0) (2026-03-29)


### ⚠ BREAKING CHANGES

* bump java version to 21
* migrate to spring boot v4

### 🚀 Features

* bump java version to 21 ([354a37f](https://github.com/justedlev/bridgewayhub/commit/354a37f0b1ff99307fd20174e02a1af3c4a56dc8)), closes [#65](https://github.com/justedlev/bridgewayhub/issues/65)
* **config:** improve oauth2 security configuration ([7e10248](https://github.com/justedlev/bridgewayhub/commit/7e102482cdfbad7c4372a7afbdb538d60fb59323))
* migrate to spring boot v4 ([70272da](https://github.com/justedlev/bridgewayhub/commit/70272dadaec82970952a7dd52aac621feb4dd75f))
* migrate to spring boot v4 ([a206a0d](https://github.com/justedlev/bridgewayhub/commit/a206a0d4c26e8fb55cdaf980e7058ed38c0ae7f5))


### 🐛 Bug Fixes

* **config:** use correct profiles order ([bf04b32](https://github.com/justedlev/bridgewayhub/commit/bf04b3228bd09bd821a238df8e8486aa9ce06cae))


### ♻️ Refactoring

* rename package from `io.github.justedlev.bridgeway.autoconfiguration` to `io.github.justedlev.bridgeway.autoconfigure` ([575f23e](https://github.com/justedlev/bridgewayhub/commit/575f23ef83bd144e4cfa13185ee767bb4652c073))
* rename package from `io.github.justedlev.bridgeway.autoconfiguration` to `io.github.justedlev.bridgeway.autoconfigure` ([262a98d](https://github.com/justedlev/bridgewayhub/commit/262a98dc328be155f10bd6a919f40dabe0e43298))
* rename package to `io.github.justedlev.bridgeway.autoconfigure` ([261678c](https://github.com/justedlev/bridgewayhub/commit/261678c5cc41f03b699bb02137bd63209be5768b))


### 🧹 Chores

* release 1.0.0 ([e4129a7](https://github.com/justedlev/bridgewayhub/commit/e4129a744c89d4d8a8c5cb325ec65609dc9920f2))


### ⚙️ Build

* **deps:** bump actions/cache from 4 to 5 ([90e1032](https://github.com/justedlev/bridgewayhub/commit/90e10329db10f90aaddbec60aa6b093678227215))
* **deps:** bump actions/checkout from 5 to 6 ([5a47f9a](https://github.com/justedlev/bridgewayhub/commit/5a47f9a3d988454c24349e0020d0e6c2f3d0bd52))
* **deps:** bump actions/checkout from 5 to 6 ([dcabba0](https://github.com/justedlev/bridgewayhub/commit/dcabba053f749caef813a80e0ce3331bc1626310))
* **deps:** bump actions/checkout from 5 to 6 ([bc5307d](https://github.com/justedlev/bridgewayhub/commit/bc5307d0818f7a6701c124356e2160516a5ab026))
* **deps:** bump docker/build-push-action from 6 to 7 ([47e5ab6](https://github.com/justedlev/bridgewayhub/commit/47e5ab6fe029432aca81c15bb5ecbd65e8ebf068))
* **deps:** bump docker/build-push-action from 6 to 7 ([ffd5a91](https://github.com/justedlev/bridgewayhub/commit/ffd5a9186d1bdfaf775ae078cc44b5591098fb69))
* **deps:** bump docker/login-action from 3 to 4 ([5cfee4c](https://github.com/justedlev/bridgewayhub/commit/5cfee4cb9c6a82f7fc612e6495d4ce3cd98fa2cb))
* **deps:** bump docker/login-action from 3 to 4 ([459428f](https://github.com/justedlev/bridgewayhub/commit/459428fd624c286004f8b6e23946311c9ceae887))
* **deps:** bump docker/metadata-action from 5 to 6 ([41c3af5](https://github.com/justedlev/bridgewayhub/commit/41c3af5069a41be3eafc62d3194b2eb4466a2a60))
* **deps:** bump docker/metadata-action from 5 to 6 ([92929af](https://github.com/justedlev/bridgewayhub/commit/92929afa85ef6b929d48d161c0489f55307bdd42))
* **deps:** bump docker/setup-buildx-action from 3 to 4 ([75f34a3](https://github.com/justedlev/bridgewayhub/commit/75f34a38e1132a4ce3887775afbb3e5e09a22fb8))
* **deps:** bump docker/setup-buildx-action from 3 to 4 ([40a91a7](https://github.com/justedlev/bridgewayhub/commit/40a91a7a3af6b8faccdddda467e46b834c630ce6))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin ([30f51b5](https://github.com/justedlev/bridgewayhub/commit/30f51b5d311542474fe928020b63c83696953953))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin ([f7c4e08](https://github.com/justedlev/bridgewayhub/commit/f7c4e089aca1b35b4101115601f433a63d61394b))
* **deps:** bump org.apache.maven.plugins:maven-jar-plugin from 3.4.2 to 3.5.0 ([5d9c02c](https://github.com/justedlev/bridgewayhub/commit/5d9c02c237eec25443e571e44f39483e7dbcdcc6))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([269d6b8](https://github.com/justedlev/bridgewayhub/commit/269d6b8a82f7d4c1c0f5298e76bc353036292a14))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui ([09e1a66](https://github.com/justedlev/bridgewayhub/commit/09e1a669d16829948edb14551192da13ae58ee9e))
* **deps:** bump org.springdoc:springdoc-openapi-starter-webflux-ui from 2.8.13 to 3.0.2 ([7a5d256](https://github.com/justedlev/bridgewayhub/commit/7a5d256d0d06292344c34e89467583cf81bb4ed2))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([ee0a886](https://github.com/justedlev/bridgewayhub/commit/ee0a8869b1d3af64d4143326a81891a876420684))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([60a3d1b](https://github.com/justedlev/bridgewayhub/commit/60a3d1bfb4a8bbb02ce24f2495d062670652b9ca))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([6277ce4](https://github.com/justedlev/bridgewayhub/commit/6277ce47059c8eae9b97e7410f4ed3f5bd3883d5))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent ([dfd8230](https://github.com/justedlev/bridgewayhub/commit/dfd82305daf00351bb39fdcc08b533c18de6e3ac))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent from 3.5.6 to 4.0.4 ([dd4d4b0](https://github.com/justedlev/bridgewayhub/commit/dd4d4b03932eb1c3f2b7380abf4476929c241fba))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent from 4.0.0 to 4.0.1 ([b14f248](https://github.com/justedlev/bridgewayhub/commit/b14f2482eb1d9ea066f72ff600bd721e563d7a4c))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([6c7d110](https://github.com/justedlev/bridgewayhub/commit/6c7d110f310115da1f2911e95eec4b99a7df6efa))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies ([e7499fc](https://github.com/justedlev/bridgewayhub/commit/e7499fc60e0c988c93fed2f63221d2d3a4eb03b5))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies from 2025.0.0 to 2025.1.1 ([d27348e](https://github.com/justedlev/bridgewayhub/commit/d27348e56fc7a174b9c1d64706e4f1e619b1ed5b))
* **mvn:** bump maven wrapper to `3.9.12` ([be60ac0](https://github.com/justedlev/bridgewayhub/commit/be60ac03a92d60e08e0518a254d1a892d91e65a1))
* **mvn:** improve build plugin configuration ([be6491c](https://github.com/justedlev/bridgewayhub/commit/be6491cd0b044f4ee95960b9cfb3fd1c002f4ae1))
* **mvnw:** bump maven wrapper to `3.9.12` ([26ed4d9](https://github.com/justedlev/bridgewayhub/commit/26ed4d9c9c6f1655d63d0a3cd9fdbcd7d373229c))

## [0.11.0](https://github.com/justedlev/bridgewayhub/compare/v0.10.3...v0.11.0) (2025-10-18)


### 🚀 Features

* **config:** add `spring.cloud.discovery.reactive.enabled` property ([417e421](https://github.com/justedlev/bridgewayhub/commit/417e4216ecbf1ec40ec81975aae26537ba8cf007))
* **config:** add `spring.profiles.group.standalone` ([3c9b5e5](https://github.com/justedlev/bridgewayhub/commit/3c9b5e56bd6dd16f1b8027ca424a4185f54534a8))
* **config:** add missing flag enablers ([1182bab](https://github.com/justedlev/bridgewayhub/commit/1182bab5e892c6e5a2afdf9f7bdb3e628305be1a))
* **config:** improve oauth2 security configuration ([2e80ffc](https://github.com/justedlev/bridgewayhub/commit/2e80ffc21aea800ce2201d6a1d399f37acd819b9))
* **config:** remove `spring.cloud.gateway.server.webflux.loadbalancer.use404` property ([2000dbc](https://github.com/justedlev/bridgewayhub/commit/2000dbc2646ebc62d61519c360075cf37ecad498))
* **config:** remove `spring.devtools.add-properties` property ([43967bf](https://github.com/justedlev/bridgewayhub/commit/43967bf200e011ce9c84f773b78a9c4e10531eae))
* **config:** use hardcoded default client registration id ([fe37e6a](https://github.com/justedlev/bridgewayhub/commit/fe37e6a533f062813785eaf1e67dd29e3738e652))

## [0.10.3](https://github.com/justedlev/bridgewayhub/compare/v0.10.2...v0.10.3) (2025-10-14)


### 🐛 Bug Fixes

* **config:** use reactive configuration ([ce76eaf](https://github.com/justedlev/bridgewayhub/commit/ce76eaf37b80b61f941dcc0a7ee8759a3db653df))

## [0.10.2](https://github.com/justedlev/bridgewayhub/compare/v0.10.1...v0.10.2) (2025-10-13)


### 🐛 Bug Fixes

* **config:** fail with 404 not found on prometheus scrape ([3b6886b](https://github.com/justedlev/bridgewayhub/commit/3b6886b50595495e99545daedacc719fe12bd37d))
* **config:** incorrect management port ([9026d42](https://github.com/justedlev/bridgewayhub/commit/9026d42c36a209728d32af001c26b594d81b9fdb))

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
