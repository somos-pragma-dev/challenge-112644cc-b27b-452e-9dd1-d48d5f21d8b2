# Implementación de una API REST para gestión de productos

El sistema debe permitir la gestión de productos con nombre, precio, stock y categoría. Los precios no pueden ser negativos y los nombres no pueden ser duplicados. La API debe persistir los productos en una base de datos H2 y debe estar documentada con Swagger.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | API REST con persistencia en H2 y documentación con Swagger |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición y persistencia de productos

**Objetivo:** Definir y persistir productos en la base de datos H2.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crear un modelo de producto con los atributos mencionados.
- Implementar un repositorio para persistir los productos en H2.
- Asegurar que los precios no sean negativos y los nombres no sean duplicados.

**Entregable:** Modelo de producto y repositorio funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo validar los atributos del producto antes de persistir.
- Piensa en cómo manejar los errores de validación.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar endpoints para crear, leer, actualizar y eliminar productos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crear endpoints para las operaciones CRUD de productos.
- Asegurar que los endpoints sigan los principios REST.
- Documentar los endpoints con Swagger.

**Entregable:** Endpoints CRUD documentados con Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar los endpoints para seguir los principios REST.
- Piensa en cómo documentar los endpoints de manera clara y concisa.

</details>

### Fase 3: Pruebas y mejoras

**Objetivo:** Realizar pruebas y mejorar la API.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Realizar pruebas unitarias y de integración para la API.
- Identificar y corregir errores.
- Mejorar la documentación con Swagger.

**Entregable:** API mejorada y documentada.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo realizar pruebas efectivas para la API.
- Piensa en cómo mejorar la documentación con Swagger.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de producto y cómo se usa en la API?
- **paraQueSirve**: ¿Para qué sirve la documentación con Swagger en la API?
- **comoSeUsa**: ¿Cómo se usan los endpoints CRUD en la API?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la mejora de la API y la documentación con Swagger?

## Criterios de Evaluacion

- Implementación correcta del modelo de producto y repositorio.
- Implementación de endpoints CRUD siguiendo los principios REST.
- Documentación clara y concisa con Swagger.
- Realización de pruebas unitarias y de integración.
- Mejora de la API y documentación con Swagger.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
