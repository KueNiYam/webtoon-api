plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":domain"))
}

tasks {
    bootJar {
        enabled = true
    }
    jar {
        enabled = false
    }
}
