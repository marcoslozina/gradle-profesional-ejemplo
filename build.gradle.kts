plugins {
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.3"
    java
    jacoco
}

allprojects {
    repositories {
        mavenCentral()
    }
}

tasks.jacocoTestReport {
    dependsOn("test")
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}