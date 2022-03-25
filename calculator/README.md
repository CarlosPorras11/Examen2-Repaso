# Calculadora

En este proyecto hay una clase Calculator que implementa varias operaciones aritméticas:

- sqrt: Calcula la raíz cuadrada de un número, si el número es negativo devuelve una excepción
- sum: Suma todos los valores del array de enteros recibido.

## Javadoc (1 punto)

Añade documentación a la clase Calculator usando Javadoc. Comenta tanto la clase como los métodos.

## Tests (2 puntos)

Implementa tests que comprueben los escenarios relevantes de cada método de Calculator

### Configuración

Para poder realizar tests vamos a usar la librería junit

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```