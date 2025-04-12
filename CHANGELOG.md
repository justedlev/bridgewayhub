# 📦 Changelog

All notable changes to this project will be documented in this file.

This project uses **[Conventional Commits](https://www.conventionalcommits.org/)** and is powered by **[release-please](https://github.com/googleapis/release-please)**.

## [0.4.0](https://github.com/justedlev/bridgewayhub/compare/v0.3.19...v0.4.0) (2025-04-12)


### 🚀 Features

* add `spring.rabbitmq.*` base configuration ([02787bb](https://github.com/justedlev/bridgewayhub/commit/02787bbf3ff020d154ffd2db7d16cfcd53afceca))
* add config load from server ([307ddcc](https://github.com/justedlev/bridgewayhub/commit/307ddccd03cb8c41db4e079348556506f17c1f88))
* add logging level for web ([dd154a7](https://github.com/justedlev/bridgewayhub/commit/dd154a7d3827348f6ba42abe34ab2ba218e25f56))
* **config:** add `LOGGING_FILE_PATH` env var ([63323d5](https://github.com/justedlev/bridgewayhub/commit/63323d591119c20ff8729b41a2e8467fcd11a804))
* **config:** add `security.whitelist.GET` path pattern ([a462ec0](https://github.com/justedlev/bridgewayhub/commit/a462ec006dec124efea15f1970c906cf3a40b749))
* **config:** remove extra env var ([e393514](https://github.com/justedlev/bridgewayhub/commit/e393514c7ce57f11a4f6e84c19c833e04fc6f184))
* **config:** use `allowed-origins` instead of `allowed-origin-patterns` ([a902068](https://github.com/justedlev/bridgewayhub/commit/a902068ba75fed1412e65138919672aa1d14d1be))
* **config:** use env var combined with default port ([72bf5c3](https://github.com/justedlev/bridgewayhub/commit/72bf5c36b2481d607a3f5dd408e75f38ea9bf464))
* deprecate custom impl `ServerLogoutHandler` ([62fc439](https://github.com/justedlev/bridgewayhub/commit/62fc439e7c8fe517dcf84fef5784856e25ae49cc))
* **docker:** add .env ([03005e7](https://github.com/justedlev/bridgewayhub/commit/03005e782b50837cb597409c8d680e028c04a4fd))
* **docker:** add .vmoptions ([355c3fe](https://github.com/justedlev/bridgewayhub/commit/355c3feb4d238ff193591232c207073d2f560006))
* **docker:** add compose.yaml ([58d09b4](https://github.com/justedlev/bridgewayhub/commit/58d09b4a4c51cc8034bace5efa70c803cac31aec))
* **docker:** add Dockerfile ([3b2eda2](https://github.com/justedlev/bridgewayhub/commit/3b2eda2d0da678ba6ef4c7ea483fd40dd8b2bb7c))
* **docker:** add entrypoint.sh ([ae6f829](https://github.com/justedlev/bridgewayhub/commit/ae6f829018bcf56e08e2e88197418efd1fc9d9ca))
* **docker:** add healthcheck.sh ([6b2fc5c](https://github.com/justedlev/bridgewayhub/commit/6b2fc5ceb0f42459a7a7e7e506900e1b1a79cea8))
* **gha:** add `target-branch: "dev"` ([b186c3f](https://github.com/justedlev/bridgewayhub/commit/b186c3f6cac141e341380a74deb3c64a09523722))
* integrate config server ([3651b25](https://github.com/justedlev/bridgewayhub/commit/3651b25bbddfd66483fa149b1a6a2707ff16b4ad))
* **security:** update logout handler ([d1642b2](https://github.com/justedlev/bridgewayhub/commit/d1642b2ec6b92acb0354628d3bd95b5447382a7a))
* update .env ([a8c4d0c](https://github.com/justedlev/bridgewayhub/commit/a8c4d0c02dcc1470452e5c16dd16d981f24936b0))
* update default user creds ([b6a3794](https://github.com/justedlev/bridgewayhub/commit/b6a379457e17aaf9130a4720379e172e4e506a3e))
* update gateway config ([030cfb9](https://github.com/justedlev/bridgewayhub/commit/030cfb999248a4eccbaf0f954dcec3263449f318))


### 🐛 Bug Fixes

* **config:** change `redirect-uri` path ([4c5b3f7](https://github.com/justedlev/bridgewayhub/commit/4c5b3f714cee861e9fea40725229383782bab4d0))
* **config:** remove extra properties ([7388987](https://github.com/justedlev/bridgewayhub/commit/7388987c5ede72ebcedf01329bb7d95a896c094a))
* **config:** remove logging `trace` level ([ac894d6](https://github.com/justedlev/bridgewayhub/commit/ac894d6d4a8ade9bef8b57af22fa3d6751bad76c))
* **logging:** name from env ([f8c407d](https://github.com/justedlev/bridgewayhub/commit/f8c407dfc23adaaafaf51e9475e68b044156b518))
* update `banner.txt` ([b5deec4](https://github.com/justedlev/bridgewayhub/commit/b5deec4f86ad2128d51ca7a676849933bffa40d6))


### ♻️ Refactoring

* add .run to .gitignore ([a030c49](https://github.com/justedlev/bridgewayhub/commit/a030c49273bfe7f9253b75ff3345499701fa8e88))
* add env variable ([3bff1ff](https://github.com/justedlev/bridgewayhub/commit/3bff1ff10d41a4027002127d43a37e1166d45ea4))
* add separate logging for debug mode ([a76f9b2](https://github.com/justedlev/bridgewayhub/commit/a76f9b24fa61da09968efe7bc7a328a574fa6842))
* change log files dir ([2746b83](https://github.com/justedlev/bridgewayhub/commit/2746b83a5ec27f35b26a057605bcdc1007df39cf))
* change RewritePath filter for keycloak routing ([ed2d70e](https://github.com/justedlev/bridgewayhub/commit/ed2d70e44af712f8410846e6b9bd707b434de9d1))
* change root package name ([3975eae](https://github.com/justedlev/bridgewayhub/commit/3975eaeeb6a04c03475a7a2c6af752db620b2885))
* **config:** rename root package name ([61e12c0](https://github.com/justedlev/bridgewayhub/commit/61e12c0df4a3e13b7a3f89bd1c912035564904f2))
* **docs:** update README.md ([78fb77d](https://github.com/justedlev/bridgewayhub/commit/78fb77d3ebbfe97dacd31feb5909984acda53b3c))
* **env:** rename env name ([e55cc30](https://github.com/justedlev/bridgewayhub/commit/e55cc308feda7689adfb2b48745bd1f8c7a776c7))
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
* remove compose.yaml ([b492dfa](https://github.com/justedlev/bridgewayhub/commit/b492dfaab8a856d89f0797463c1dc8f238bc6c0f))
* remove custom logging config ([b14a82a](https://github.com/justedlev/bridgewayhub/commit/b14a82a5a8eae64bea8aad720a54eb27026569d3))
* remove Default.run.xml ([a92b3a9](https://github.com/justedlev/bridgewayhub/commit/a92b3a9855b01664c741dbbb750e55d6b515731c))
* remove deprecated properties ([778a241](https://github.com/justedlev/bridgewayhub/commit/778a24152c39945629d88587a990a80320bed986))
* remove Dockerfile ([ec8119d](https://github.com/justedlev/bridgewayhub/commit/ec8119d7a2a8934f852e83d20c786e98542b22a4))
* remove extra endpoints ([73c9367](https://github.com/justedlev/bridgewayhub/commit/73c9367e50c2c41aae3cb7cd557342a3feb365a7))
* remove extra log appender ([3e2af3b](https://github.com/justedlev/bridgewayhub/commit/3e2af3b5aae6bb81bd3f541df84a323bbcd0ad5b))
* remove extra rout ([9ecd785](https://github.com/justedlev/bridgewayhub/commit/9ecd7850c33d39f6b6b31bfcb00329db6752d1eb))
* remove property classes ([567b23a](https://github.com/justedlev/bridgewayhub/commit/567b23a54a3420b25da861f0a9fed9ee7f10c910))
* return `/*/*/v3/api-docs/**` pattern ([914da99](https://github.com/justedlev/bridgewayhub/commit/914da9942e763e2ae382405227da158f3fbc327a))
* **sec:** update SecurityConfiguration.java ([3077926](https://github.com/justedlev/bridgewayhub/commit/30779265524451b05b20af7b9f09a1234c2720e8))
* uncomment `security.whitelist` ([4d027d0](https://github.com/justedlev/bridgewayhub/commit/4d027d039804163f84b56d0697ad9a2393ed96c8))
* update `SecurityConfiguration.java` ([c715d88](https://github.com/justedlev/bridgewayhub/commit/c715d88d51dc1e3c8185085933d025dc71174d12))
* update banner.txt ([a6e698a](https://github.com/justedlev/bridgewayhub/commit/a6e698a1de79bcf5a8e3dc02e5a4b8a1d1db80b7))
* update compose.yaml ([6f05bc8](https://github.com/justedlev/bridgewayhub/commit/6f05bc807c86c1f44206f0cc0a4233d406244322))
* update envs in .env ([cbd78e7](https://github.com/justedlev/bridgewayhub/commit/cbd78e7d00347f2a2703e89d2606dfec31d4d726))
* update logging ([a7dd324](https://github.com/justedlev/bridgewayhub/commit/a7dd324ae9efd9c3c45b01a3185ba74fcb6f446e))
* update properties ([c1194a3](https://github.com/justedlev/bridgewayhub/commit/c1194a39236ec2d208c0bb3156326f5a377045a7))
* update security.yml ([d624592](https://github.com/justedlev/bridgewayhub/commit/d6245928ef7447f6dd1626e4462758ea10c73fe2))


### 📚 Documentation

* add `bug_report.yml` issue template ([376ea77](https://github.com/justedlev/bridgewayhub/commit/376ea77eaffea7aa517e73182ab0672a94c0bbba))
* add `CHANGELOG.md` ([7441cc8](https://github.com/justedlev/bridgewayhub/commit/7441cc8b1ca2e7e31e1b25a620d3cdcf231048a4))
* add `config.yml` issue template ([6ddbcd9](https://github.com/justedlev/bridgewayhub/commit/6ddbcd9b7958e3ff4143a2d74bd36e11c9953e1b))
* add `feature_request.yml` issue template ([eff486c](https://github.com/justedlev/bridgewayhub/commit/eff486cfb0e5c2e8a4f58632010a2c272741a721))
* add `PULL_REQUEST_TEMPLATE.md` ([8a179f0](https://github.com/justedlev/bridgewayhub/commit/8a179f034f3dbb28dc0383f1c492277b8e886380))
* add `SECURITY.md` ([fc5efdd](https://github.com/justedlev/bridgewayhub/commit/fc5efddb30d4550343bc2087b458b2caf0807a57))
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

## [Unreleased]

_Changes that are in progress but not yet released._

<!-- RELEASE PLEASE INSERT CHANGELOG HERE -->
