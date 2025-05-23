# 📘 Proyecto de Referencia – Arquitectura Hexagonal con Gradle y Java

Este repositorio acompaña al e-book **"Gradle Profesional con Java: Productividad Moderna para Desarrolladores Backend"**, y representa una implementación práctica de los conceptos explicados en el libro, aplicados a una **arquitectura hexagonal** moderna.

> 💡 **Objetivo**: Mostrar cómo estructurar un proyecto backend modular, usando Gradle, Java y los principios de arquitectura hexagonal.

---

## 📂 Estructura del Proyecto

```
hexagonal-architecture/
├── buildSrc/                # Convenciones reutilizables y lógica compartida de build
├── app/                     # Módulo de aplicación principal (Spring Boot)
├── domain/                  # Módulo de dominio con lógica de negocio pura
├── application/             # Orquestación de casos de uso y puertos de entrada/salida
├── infrastructure/          # Adaptadores externos y configuración técnica
└── gradle.properties        # Versión de Java y otras propiedades centralizadas
```

Esta estructura refleja una separación clara de responsabilidades, promoviendo mantenibilidad, testabilidad y extensibilidad.

---

## 📘 Relación con el e-book

Cada capítulo del libro introduce un concepto clave de Gradle y lo aplica directamente en este proyecto:

| Capítulo del e-book                          | Módulo relacionado            | Tema principal aplicado                             |
|---------------------------------------------|-------------------------------|------------------------------------------------------|
| 1. Introducción a Gradle                     | build.gradle.kts              | Sintaxis Kotlin DSL, estructura inicial              |
| 2. Modularización con Java y Gradle          | domain/, application/         | Separación por capas, dependencias explícitas       |
| 3. buildSrc y convenciones                   | buildSrc/                     | Reutilización de lógica de build                     |
| 4. Declaración de versiones con propiedades  | gradle.properties             | Gestión centralizada de versiones y flags            |
| 5. Tasks personalizadas y limpieza           | build.gradle.kts y buildSrc/  | Automatización y mantenimiento                      |
| 6. Compilación y toolchain de Java           | build.gradle.kts              | Configuración con `JavaLanguageVersion`             |
| 7. Publicación, testing y calidad            | test/, jacoco, lint           | Pruebas, cobertura y chequeos automáticos           |

---

## 🛠️ Compilación y ejecución

Este proyecto se compila siguiendo la configuración centralizada en `gradle.properties`. El primer módulo en compilarse es `buildSrc`, ya que define convenciones reutilizables en los otros módulos.

```bash
./gradlew clean build
```

Para ejecutar la aplicación:

```bash
./gradlew :app:bootRun
```

---

## 📗 Requisitos

- Java 21 (o definido en `gradle.properties`)
- Gradle 8+
- Docker (opcional)
- IDE recomendada: IntelliJ IDEA

---

## 📚 Recursos adicionales

- 📕 [Comprar el e-book en Hotmart](#) (próximamente)
- 🧑‍💻 [Videos complementarios en YouTube](#) (en desarrollo)
- 🧩 Template extensible para proyectos hexagonales modernos

---

## 🤝 Contribuciones

Este proyecto está diseñado para fines educativos y como base para desarrollos profesionales. Sentite libre de adaptarlo y reutilizarlo en tus propios proyectos.