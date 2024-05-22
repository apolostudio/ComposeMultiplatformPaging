[ ![Download](https://img.shields.io/maven-central/v/io.github.apolostudio/composemultiplatformpaging) ](https://maven-badges.herokuapp.com/maven-central/io.github.apolostudio/composemultiplatformpaging)
![Kotlin](https://img.shields.io/badge/kotlin-2.0.0-blue.svg?logo=kotlin)
![Compose MP](https://img.shields.io/badge/Compose%20Multiplatform-1.6.10-blue.svg?logo=jetpackcompose)
![Platforms](https://img.shields.io/badge/Multiplatform-Android,%20iOS,%20JVM-blue)
[![License](https://img.shields.io/badge/License-Apache--2.0-blue)](http://www.apache.org/licenses/LICENSE-2.0)
<!--[ ![Download](https://img.shields.io/github/v/release/apolostudio/ComposeMultiplatformPaging?color=orange&include_prereleases&label=latest%20build) ](https://maven-badges.herokuapp.com/maven-central/io.github.apolostudio/composemultiplatformpaging)-->
## Multiplatform Paging Compose
It adds collectAsLazyPagingItems from common code in Compose Multiplatform


### Note that JVM needs a coroutine Main Dispatcher
We plan to add it by default as a depedency but for now you need ``` implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.8.1") ``` in the dependencies block in jvmMain


### Dependency
```implementation("io.github.apolostudio:composemultiplatformpaging:0.0.0")```
