# Contaminacion
## Algoritmos y programacion III - Segundo Recuperatorio del 1er parcial 2023

Se requiere modelar un sistema que permita poner en funcionamiento una Salamadra. La misma admite los siguientes tipos de combustibles:

|                 | Precio ($/kg) | Grado de contaminacion (gCO_2)                                                      |
|-----------------|---------------|-------------------------------------------------------------------------------------|
| Quebracho       | 1000          | Vale 5 por cada kilo de Quebracho                                                   |
| Pino            | 500           | Vale siempre 150, independientemente de cuántos kilos de Pino haya en la salamandra |
| Resina Plastica | 250           | Vale 5^n , siendo n los kilos de resina que haya en la salamandra.                  |


La salamandra tiene una capacidad maxima para operar de 10 kg de combustible totales. No necesariamente tienen que ser los 10 kg del mismo, puede ser una combinacion de los mismos tambien, pero _en ningun caso pueden exceder los 10 kg._ Por otro lado, la salamandra _aborta_ su operatoria en caso de superar los 500 gCO_2 de contaminacion.

Casos de uso:
    1. Calcular el costo de la **Combustion** resultante para una salamandra rellenada con 5 kilos de Quebracho, 1 kilo de Pino y 1 kilo de Resina Plastica.
    2. Calcular el grado de contaminacion de la **Combustion** resultante para una salamandra rellenada con 6 kilos de Quebracho y 5 kilos de Pino.
    3. Calcular el grado de contaminacion de la **Combustion** resultante para una salamandra rellenada con 2 kilos de Quebracho, 1 kilo de Pino y 5 kilos de Resina Plastica.
    4. Calcular el grado de contaminacion de la **Combustion** resultante para una salamandra rellenada con 5 kilos de Quebracho, 1 kilo de Pino y 1 kilo de Resina Plastica.
    
Se pide:
    ** Diagrama de clases completo incluyendo todas las clases y abstraccion por mas que no se utilicen en los diagramas de secuencia de los casos de uso.
    ** Diagrama de secuencia para cada uno de los casos de uso.
    ** Codigo de pruebas (positiva **y** negativa segun corresponda) para cada uno de los casos de uso.
