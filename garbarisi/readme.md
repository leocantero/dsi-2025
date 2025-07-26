# Proyecto - Diseño de Sistemas (UTN FRBA)

Este proyecto fue desarrollado como parte de la asignatura **Diseño de Sistemas** (UTN FRBA), con el objetivo de aplicar conceptos teóricos a un modelo basado en eventos y mensajería.

---

##  Objetivo

Simular el funcionamiento de una **sucursal** que al concretar una venta, notifica a distintos observadores con diferentes responsabilidades.

---

##  Principales conceptos implementados

1. ✅ **Patrón Observer**
    - La `Sucursal` actúa como `Observable`, notificando a entidades como el `Deposito`, la `OficinaContable` y el `ContadorDeVentas`.

2. ✅ **Consumo de API REST vía Adapter**
    - Se modela el acceso a un sistema contable externo a través del patrón **Adapter** (`IAdapterAPI`).

3. ✅ **Principios SOLID**
    - **S**: Responsabilidad única (cada clase cumple un rol específico)
    - **O**: Abierto/cerrado (`TipoProducto`, `Impuesto`)
    - **I**: Segregación de interfaces (`IObserver`, `IAdapterAPI`)
    - **D**: Inversión de dependencias aplicada entre `OficinaContable` y `IAdapterAPI`

4. ✅ **Composición y polimorfismo**
    - Los productos tienen comportamiento polimórfico a través de su `TipoProducto`, que define cómo se calculan los impuestos.

---

##  Enfoque del diseño

Se priorizó la **simplicidad y claridad del modelo**, centrando el foco en el **desacoplamiento entre componentes** y la correcta delegación de responsabilidades.

El objetivo principal es representar un **sistema orientado a eventos**, donde múltiples actores reaccionan ante la ocurrencia de una acción puntual: la venta de un producto.

---

##  Tecnologías y herramientas

- UML / PlantUML para el modelado
- Java 17 , Lombock y Spring Boot (POO)

---

##  Estructura general

- `Sucursal` → genera eventos
- `IObserver` → interfaz para observadores
- `Producto` → encapsula precio y lógica de impuestos
- `OficinaContable` → se conecta a un sistema externo
- `Impuesto`, `TipoProducto` → abstraen comportamiento impositivo

---

## Autores:
- Santiago Cueliche – Estudiante de Ingeniería en Sistemas (UTN FRBA)  
- Leonel Cantero - Estudiante de Ingeniería en Sistemas (UTN FRBA)  
- Franco Andino - Estudiante de Ingeniería en Sistemas (UTN FRBA)  

