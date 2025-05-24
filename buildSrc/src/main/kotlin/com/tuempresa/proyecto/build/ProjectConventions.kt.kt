package com.tuempresa.proyecto.build

import org.gradle.jvm.toolchain.JavaLanguageVersion

object ProjectConventions {
    val javaVersion = JavaLanguageVersion.of(21)
    const val group = "com.tuempresa.proyecto"
    const val version = "1.0.0"
}