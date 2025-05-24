plugins {
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