# Excepciones y logging (3 puntos)


Implementa un programa que pida al usuario sus datos personales, los guarde en un objeto de tipo User y, finalmente, 
lo imprima en pantalla.

Crea un POJO User con los siguientes campos:
- name
- surname
- age (entero)

Utilizando el Scanner y un Logger:
- Implementa un método que pida al usuario los tres campos anteriores y devuelva un User (askUser).
  - Si el usuario mete una edad negativa lanza la excepción NegativeAgeException
  - Si el usuario mete un valor no númerico en la edad vuelve a pedir la edad hasta que meta un número
- Crea un método main que pida invoque el método askUser y muestre en pantalla los datos introducidos
  - En caso de que se produzca la excepción NegativeAgeException muestra por pantalla el error "Edad inválida, no puede ser negativa"

## Configuración

Para poder realizar esta tarea hay que añadir la dependencia slf4j

```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-log4j12</artifactId>
  <version>1.7.30</version>
</dependency>
```

También hay que crear el fichero log4j.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">

<log4j:configuration debug="true">
  <appender name="fileAppender" class="org.apache.log4j.RollingFileAppender">
    <param name="File" value="out.log"/>
    <layout class="org.apache.log4j.PatternLayout">
      <param name="ConversionPattern" value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n" />
    </layout>
  </appender>

  <appender name="consoleAppender" class="org.apache.log4j.ConsoleAppender">
    <param name="Target" value="System.out"/>
    <layout class="org.apache.log4j.PatternLayout">
      <param name="ConversionPattern" value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n" />
    </layout>
  </appender>
  <root>
    <priority value="info" />
    <appender-ref ref="consoleAppender" />
    <appender-ref ref="fileAppender" />
  </root>
</log4j:configuration>
```
