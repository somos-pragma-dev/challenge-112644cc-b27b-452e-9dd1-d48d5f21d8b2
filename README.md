# Diseño y Desarrollo de una API REST para Gestión de Productos

El equipo de desarrollo necesita una API REST que gestione productos en un catálogo. Los productos tienen nombre, precio, stock y categoría. La API debe prohibir precios negativos y nombres duplicados. Los productos se persistirán en una base de datos H2 y se documentarán con Swagger. El dominio es el de un e-commerce que requiere alta disponibilidad y consistencia de datos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | java-spring-boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Modelo de Datos

**Objetivo:** Definir el modelo de datos para los productos, asegurando la prohibición de precios negativos y nombres duplicados.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar las propiedades esenciales de un producto.
- Establecer las restricciones de validación para el nombre y el precio.
- Documentar las reglas de negocio para la creación y actualización de productos.

**Entregable:** Modelo de datos para productos con reglas de validación documentadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar y validar las propiedades de un producto.
- Piensa en las posibles validaciones necesarias para cumplir con las reglas de negocio.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar los endpoints REST para la gestión de productos, asegurando la persistencia en H2 y la documentación con Swagger.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear los endpoints para crear, leer, actualizar y eliminar productos.
- Persistir los productos en una base de datos H2.
- Documentar los endpoints con Swagger.

**Entregable:** API REST funcional con endpoints para gestión de productos, persistencia en H2 y documentación con Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar los endpoints para seguir las mejores prácticas de REST.
- Piensa en cómo manejar las validaciones y la persistencia de datos de manera eficiente.

</details>

### Fase 3: Pruebas y Optimización

**Objetivo:** Realizar pruebas unitarias y de integración para asegurar la funcionalidad y optimizar el rendimiento de la API.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Escribir pruebas unitarias para los modelos de datos y las validaciones.
- Escribir pruebas de integración para los endpoints REST.
- Optimizar el rendimiento de la API, considerando la alta disponibilidad y consistencia de datos.

**Entregable:** API REST con pruebas unitarias y de integración, y optimización de rendimiento.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo escribir pruebas efectivas para asegurar la funcionalidad de la API.
- Piensa en cómo optimizar el rendimiento de la API para cumplir con los requisitos de alta disponibilidad y consistencia de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos y por qué es importante en la gestión de productos?
- **paraQueSirve**: ¿Para qué sirven los endpoints REST en la gestión de productos?
- **comoSeUsa**: ¿Cómo se usan las validaciones en la gestión de productos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del rendimiento de la API?

## Criterios de Evaluacion

- Definición del modelo de datos con reglas de validación.
- Implementación de endpoints REST funcionales.
- Persistencia de datos en H2 y documentación con Swagger.
- Pruebas unitarias y de integración efectivas.
- Optimización del rendimiento de la API.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
