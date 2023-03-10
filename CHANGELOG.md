## [1.0.1](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/compare/1.0.0...1.0.1) (2023-03-01)


### Dependency updates

* **deps:** add lib to test mongo ([ffb3022](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/ffb3022aebc7360dc29623dc0453286f98525431))


### Tests

* **infrastructure:** add some mongodb tests ([e517535](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/e51753597f2e1157c7f6aa4e5ca98e1cd6964241))


### General maintenance

* add code documentation link to readme ([39eea01](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/39eea01b43b6bc55395a5087db680592510830f9))
* add method to get database to mongo client ([9a4b28e](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/9a4b28eeb8e0254935a603d329bc7aa47044e826))
* change microservice name in README ([cd4cf00](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/cd4cf0005474f4e5d1efc41387021f2a18723a7b))
* correct documentation links in readme ([55e1f7b](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/55e1f7b35e04bf08915de9e15e625af87e22d17c))


### Documentation

* **tests:** add documentation on mongo utility class ([c0ec33f](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/c0ec33f8eef2cdb9927ac38c2c24494dc3409a1f))


### Refactoring

* **test:** refactor mongodb tests ([5e71351](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/5e71351332198f0d303a79f1ed160ff59d5448fa))

## 1.0.0 (2023-02-28)


### Features

* add patient api ([8cfd0d3](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/8cfd0d3e83a7973d43966be90daf67c0476963be))
* create application service interface ([3725b09](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/3725b09c611d69ceee3ff9bfbabd531222780a64))
* create data for patient entity ([d6ebd8f](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/d6ebd8f90df55f138db3d13ce9d702b81edeaa9f))
* create patient application services ([f631250](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/f6312509f95040964dcab8d0c8f5e037be01be4b))
* create patient database manager ([d9ffe0e](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/d9ffe0e00c98fff88b0e65ded0c49a29d81da9f9))
* create patient entity ([617eeab](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/617eeab5607430844764cb963097b85f39c8d57e))
* create patient repository interface ([56b4f38](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/56b4f386a77cdd33f7e5ff3b5d1994bfd8c3d60d))
* create provider interface ([119a686](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/119a68616a150659425ebd0ca2a12dc665faa881))


### Bug Fixes

* change method to check if record is inserted due to kmongo bug on typed collection ([435d393](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/435d393392005734d7e2c0d7308a7557557b13dd))


### Dependency updates

* **deps:** add archunit lib ([d0f1959](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/d0f1959081ad13ae96c81e5b04aea9d746694a75))
* **deps:** add kmongo and logback deps ([abee96f](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/abee96f60e9cee83b0ca2d62a00e222915624331))
* **deps:** add ktor deps ([fba793d](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/fba793dc75534b3862c6c1fedae28d903198294b))


### Tests

* **architecture:** create test for clean architecture ([a8bb7b8](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/a8bb7b817a6290aa709548626f3304d6122b2934))
* **entity:** add test for patient entity ([5db5caa](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/5db5caa6d353c717ff70efad7dec7ebe1e27ded7))
* **service:** add test for patient application services ([e4ef293](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/e4ef2932768f0c615a0890a2ad65dc4d8a9a0e68))


### Refactoring

* move test class in entity package ([f82c3f4](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/f82c3f4ecf09b63ed6ce94296a13bf0aefd1a508))
* refactor api methods ([836d93c](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/836d93cf267e6756b820bfa4df3ed99d45510c69))


### Documentation

* **api:** add rest api specs ([39b3fcc](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/39b3fcc91b31950f447ece8db23a0ebd32bd10e5))


### Build and continuous integration

* add input to generate also rest api documentation ([c3aaf71](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/c3aaf714f0d07cfe9a914834cfd436735b883a29))


### General maintenance

* add application launcher ([44bc022](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/44bc022d1fefced7aec997ff6f9bf09030cceae7))
* add equals and hashcode to entities ([7107b98](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/7107b987de65efe266c1ed20816455cbeb317032))
* add serializable annotations on entities ([7ee2bc7](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/7ee2bc7f8f89abb7872a3d001321caa0e4b65e15))
* change database name ([14dd152](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/14dd152468b0579fad155a014607e00bd0809327))
* change project name ([e717075](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/e7170758655618846fe57005a1703422002aad75))
* create api router with ktor ([4096e9e](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/4096e9e7344b884d69f0fc7fbca4e506f1a74ffd))
* create mock db manager to test application service ([4c9c914](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/4c9c914a480c9c8bac674d5e8a72720484e53f4d))
* create mongo client and implement db operations ([cfd3187](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/cfd318769e08e667b32ed64be4b6bf20a0969374))
* create patient api dto ([c6d53cd](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/c6d53cd55e6cf0e93e3e421da7a802dc777d0c06))
* delete sample test class ([28fe7a1](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/28fe7a1f8544c5cbd13cd499dfb18f935afa2bb7))
* implement patient controller ([8587c4b](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/8587c4b3f8a3cc0899e6acff9641a43c67f3c486))
* implement provider interface ([f9689f7](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/f9689f77a819c2a1a9dfd04d8ff490ab52124102))
* modify project name ([fe5b3a1](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/fe5b3a1d94749a109029ea11626a932e7952f3be))
* update Dockerfile with run task ([ad09eb8](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/ad09eb8aaaa46b2d05ef9a30058c20988b303757))
* update README ([b3c0342](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/b3c03427c6a204fe6f374485bf654fb6c7c91186))
* update README ([ea3340d](https://github.com/SmartOperatingBlock/patient-management-integration-microservice/commit/ea3340d45510da67905616c1cf439faba4522f2f))

## [0.1.1](https://github.com/SmartOperatingBlock/kotlin-template-project/compare/0.1.0...0.1.1) (2023-02-06)


### General maintenance

* activate publish on github pages by semantic release plugin ([8a9001c](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/8a9001cea81ea319a19af37f6545a0bc7a86a31d))
* add Dockerfile ([2a36c9f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/2a36c9f6b542ffb6d59fe8b3a915f15b83dae755))
* add plugin for publish documentation to github pages ([99eb3c8](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/99eb3c8e3fd98388f268fc1443e6f8186e44606e))
* change plugin for publish documentation to github pages ([ced9b0a](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/ced9b0ab4d85184eb7cca15726c1e156e82bff7d))
* configure semantic release to deploy documentation on github pages ([683e53f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/683e53f6383286a7ee51a2a4d9d5d6cac8221e2c))
* ensure ci success before merging pull request ([4c124f4](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/4c124f4ab5dc3533f343fb84c3261bdd82ebf8e3))
* update gitignore ([d1d1ba3](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/d1d1ba3a8d1ed41c8fdbc6e68a1fa48121bb8500))
* update gitignore with checkstyle-idea file ([5065596](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/506559626d185616be0b497f828b3954a6a7639c))
* update README ([f9800e0](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/f9800e04b39a1ae2826adbff26592f08fba534cd))


### Build and continuous integration

* add codecov action to generate coverage from jacoco report ([e0365aa](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/e0365aa1d2b767c1d773106f74f00489a461c544))
* add docker image auto delivery ([05f996d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/05f996d993fd29f7dfb9f8f268d8d1cca365fab2))
* add docs generation step ([6073bda](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/6073bdaa781bf7679de69ffa711b7af8834b7f36))
* **deps:** update docker/build-push-action action to v3.3.1 ([a19985a](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/a19985a3d47ce45d4c1133527c89314eeb3257fe))
* **deps:** update docker/build-push-action action to v4 ([2f667d7](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/2f667d7835f9c55f6de1cc5f808de51d973b645d))
* export version number from semantic release ([922a212](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/922a2125cb81b830026737608e7d0bd04cab57bc))
* make image name lowercase ([3e34d6d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/3e34d6d37b2ad7b682b0418ff2c2e6ed6f690327))
* modify condition for documentation deploy ([76fcef6](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/76fcef6b274f8489ce642c2d49c77ae2cd572a16))
* modify release concurrency group ([9002f26](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/9002f2625f0e6d1ad758b0ddb906c6c1af985a49))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-stdlib to v1.8.10 ([d637f2e](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/d637f2ebc93c686311057c0790cb17a8db6af3e5))
* **deps:** update node.js to 18.14 ([e7105c5](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/e7105c5c6d3192852b8d79056385e94bf6937264))
* **deps:** update plugin com.gradle.enterprise to v3.12 ([ccce09d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/ccce09d55f5b0a2ced1aefb6d0db386e47d1bc81))
* **deps:** update plugin com.gradle.enterprise to v3.12.1 ([bf28ba4](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/bf28ba43df7a82e7cbcb8e44d2fa874f533da2de))
* **deps:** update plugin com.gradle.enterprise to v3.12.2 ([5a11c72](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/5a11c72463d7d37f9f46070b429fa5973a5d4aa8))
* **deps:** update plugin com.gradle.enterprise to v3.12.3 ([18e6393](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/18e63935ef61344e5079600d0f8adaa1a6283b28))
* **deps:** update plugin kotlin-qa to v0.32.0 ([43155c8](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/43155c8a0fe2c07c3add9beeb42017822d2d0062))
* **deps:** update plugin kotlin-qa to v0.33.0 ([7e80e6f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/7e80e6f763899189951763d01d3cfc6daa554bce))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.1 ([920e201](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/920e201193df0f1cbe0a8c6f4104293ce0d99a3c))
