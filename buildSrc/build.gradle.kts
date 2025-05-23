plugins {
    `java-library`
}

java {
    toolchain.languageVersion.set(
        providers
            .gradleProperty("javaVersion")
            .map { JavaLanguageVersion.of(it.toInt()) }
    )
}