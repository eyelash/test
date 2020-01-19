plugins {
  kotlin("js") version "1.3.61"
}

repositories {
  mavenCentral()
}

kotlin {
  target {
    browser()
  }
  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("react", "16.12.0"))
    implementation(npm("react-dom", "16.12.0"))
  }
}
