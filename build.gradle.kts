plugins {}

allprojects {
    group = project.findProperty("projectGroup") as String
    version = project.findProperty("projectVersion") as String

    repositories {
        mavenCentral()
    }
}