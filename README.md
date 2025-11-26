# Simulación de un Proceso de Venta — Programación Orientada a Objetos (Java)

Este proyecto corresponde a un ejercicio académico diseñado para practicar y demostrar comprensión profunda de los fundamentos de la Programación Orientada a Objetos (POO) en Java. El enfoque no está puesto en la complejidad del sistema, sino en la correcta modelación, interacción y ciclo de vida de las clases involucradas en un proceso de compra sencillo.

---

## Enunciado del Ejercicio

Una empresa desea simular el flujo básico de una venta de productos físicos. Cada venta involucra un único cliente, un único producto y una cantidad específica a comprar. El sistema debe reflejar el ciclo de vida completo de los objetos: su creación, su interacción durante el proceso de compra y el efecto que dicha interacción provoca en sus estados internos (por ejemplo, el saldo del cliente y el stock del producto).

El objetivo es crear un pequeño modelo compuesto por clases que representen entidades reales del dominio (Cliente, Producto y Venta), y una clase de simulación que actúe como punto de entrada del sistema. Esta simulación debe mostrar, de forma clara y secuencial:

1. El estado inicial del cliente y del producto.  
2. La creación de una venta con la cantidad deseada.  
3. La ejecución de la venta (actualización de saldo, stock y registro de fecha).  
4. El estado final de cada objeto involucrado.  
5. Un resumen de la venta realizada.

El diseño no debe utilizar estructuras de datos avanzadas, interfaces, excepciones personalizadas ni conceptos que no se hayan estudiado aún. El propósito central es demostrar dominio de las relaciones entre clases, encapsulación y flujo de ejecución en POO.

---

## Objetivo del Proyecto

El objetivo principal es poner en práctica, de forma integrada, los conceptos fundamentales de la Programación Orientada a Objetos en Java, logrando:

- Representar entidades del mundo real mediante clases bien encapsuladas.  
- Definir relaciones claras entre objetos (asociación y dependencia).  
- Aplicar el ciclo de vida de los objetos desde su creación hasta su uso final.  
- Separar el modelo del dominio de la capa que orquesta la ejecución (simulación).  
- Controlar y actualizar el estado de los objetos a través de métodos propios de cada clase.  
- Ejecutar un caso de uso completo en un entorno controlado que permita observar cómo interactúan las instancias del sistema.

---

## Competencias Alcanzadas

### 1. Modelación orientada a objetos
- Identificación correcta de clases del dominio.  
- Representación de atributos y comportamientos coherentes.  
- Creación de objetos con constructores apropiados y validaciones mínimas.

### 2. Relaciones entre clases
- Uso adecuado de asociación para vincular Cliente, Producto y Venta.  
- Comprensión de la dirección y tipo de dependencia entre objetos.

### 3. Encapsulación y responsabilidad
- Solidez en el uso de getters y métodos internos para proteger el estado de cada clase.  
- Cada clase modifica únicamente sus propios atributos.  
- Evitación de acoplamiento indebido entre entidades.

### 4. Ciclo de vida de los objetos
- Creación, uso, modificación y observación del estado de clientes, productos y ventas.  
- Trazado del flujo natural de un proceso de compra realista.

### 5. Estructuración del flujo del programa
- Separación clara entre el modelo (clases del dominio) y el punto de entrada (simulación).  
- Ejecución ordenada del caso de uso: antes → operación → después.

### 6. Buenas prácticas iniciales en Java
- Uso de excepciones estándar para validar parámetros.  
- Uso adecuado de listas simples para almacenar compras del cliente.  
- Impresión ordenada del estado del sistema.

---

## Estado del Proyecto

El proyecto cumple con el alcance del ejercicio de manera completa. No pretende ser un sistema comercial real, sino un ejercicio académico para practicar y evaluar los fundamentos de POO a través de un caso sencillo y bien estructurado.
