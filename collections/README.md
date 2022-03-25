# Colecciones 

## Estructura de clases (1 punto)
Implementa una estructura de clases que permita almacenar la información de un zoo:
- Nombre del zoo
- Zonas del zoo indexadas por nombre. Por cada zona:
  - Nombre de la zona
  - Lista de cercados (cages). Por cada cercado (Cage)
    - Número de cercado
    - Especies del cercado: conjunto no ordenado de String

## Ordenación de zonas  (1 punto)

Crea un Comparator de zonas que ordene las mismas por nombre, en orden alfabético.

### Métodos (2 puntos)

Implementa los siguientes métodos en la clase Zoo
- Un método que dado un nombre de zona, devuelva los cercados. Si no existe la zona lanza la excepción ZoneNotFoundException
- Un método que dado un nombre de zona y un número de cercado, devuelva las especies de ese cercado. Si no existe la zona lanza la excepción ZoneNotFoundException. Si no existe el cercado lanza la excepción CageNotFoundException
- Un método que dada una especie, devuelve una lista de cercados que contengan esa especie.