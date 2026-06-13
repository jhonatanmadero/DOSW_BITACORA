# DOSW_BITACORA
Bitácora Pokémon  donde cada entrenado registrará los resultados de sus investigaciones utilizando Java, Streams y  Expresiones Lambda. 

# SEMANA No 1 — DOSW Manejo de Streams

## Datos personales:
- **Nombre y Apellido:** jhonatan David Madero Riaño
- **Código de Estudiante:** 1000097206
- **Curso:** DOSW Intersemestral

---

### Ejercicio 1 — Numeros pares mayores a diez

Dada una lista de numeros enteros, obtener una nueva lista solo con los números pares mayores a 10.

**Código implementado:**
![sem1-ej1-codigo.png](capturas/semana%201/sem1-ej1-codigo.png)

**Captura de ejecución:** 
![sem1-ej1-prueba.png](capturas/semana%201/sem1-ej1-prueba.png)

**Explicación:** Se usa `filter()` para conservar solo los números que cumplan dos condiciones: que sean pares (`n % 2 == 0`) y mayores a 10 (`n > 10`).

---

### Ejercicio 2 — Cantidad de palabras con mas de 4 caracteres

Dada una lista de palabras, filtrar las que tengan más de 4 caracteres, convertirlas en mayúsculas, ordenarlas alfabéticamente y contar el total.

**Código implementado:**
![sem1-ej2-codigo.png](capturas/semana%201/sem1-ej2-codigo.png)

**Captura de ejecución:** 
![sem1-ej2-prueba.png](capturas/semana%201/sem1-ej2-prueba.png)

**Explicación:** Se encadenan `filter()` para palabras largas, `map()` para mayúsculas, `sorted()` para ordenar y `count()` para obtener el total.

---

### Ejercicio 3 — Obtener nombres de los usuarios

Dada una lista de usuarios con atributos id, name, age y active, filtrar solo los activos y obtener sus nombres en mayúscula ordenados alfabéticamente.

**Código implementado:**
![sem1-ej3-codigo2.png](capturas/semana%201/sem1-ej3-codigo2.png)
![sem1-ej3-codigo.png](capturas/semana%201/sem1-ej3-codigo.png)

**Captura de ejecución:** 
![sem1-ej3-prueba.png](capturas/semana%201/sem1-ej3-prueba.png)

**Explicación:** Se usa `filter()` para quedarse con usuarios activos, `map()` para extraer el nombre en mayúsculas y `sorted()` para ordenarlos alfabéticamente.

---

### Ejercicio 4 — Personas mayores de edad

Dado un listado de usuarios, filtrar las personas mayores de edad y obtener sus nombres.

**Código implementado:**
![sem1-ej4-codigo.png](capturas/semana%201/sem1-ej4-codigo.png)

**Captura de ejecución:** 
![sem1-ej4-prueba.png](capturas/semana%201/sem1-ej4-prueba.png)

**Explicación:** Se usa `filter()` para conservar solo los usuarios con edad mayor o igual a 18 y `map()` para extraer únicamente sus nombres.

---

### Ejercicio 5 — Transacciones bancarias

Dada una lista de transacciones bancarias, usar `peek()` para ver cada transacción procesada y verificar si existe al menos una no aprobada.

**Código implementado:**
![sem1-ej5-codigo.png](capturas/semana%201/sem1-ej5-codigo.png)
![sem1-ej5-codigo2.png](capturas/semana%201/sem1-ej5-codigo2.png)

**Captura de ejecución:** 
![sem1-ej5-prueba.png](capturas/semana%201/sem1-ej5-prueba.png)

**Explicación:** Se usa `peek()` para imprimir cada transacción mientras se procesa y `anyMatch()` para verificar si al menos una no está aprobada. El lote es válido solo si todas están aprobadas.

# SEMANA No 2 — Bitácora Pokémon
---

### Ejercicio 01 — Pokémon Tipo Fuego

Dada una lista de Pokémon con nombre y tipo, obtener únicamente aquellos cuyo tipo sea Fuego.

**Código implementado:**
![ej1-codigo.png](capturas/semana%202/ej1-codigo.png)

**Captura de ejecución:**
![ej1-prueba.png](capturas/semana%202/ej1-prueba.png)

**Explicación:** Se usa `filter()` para obtener solo los Pokémon cuyo tipo sea "Fuego", luego `map()` para extraer únicamente el nombre.

---

### Ejercicio 02 — Pokédex Gritona

Transformar todos los nombres de Pokémon a mayúsculas.

**Código implementado:**
![ej2-codigo.png](capturas/semana%202/ej2-codigo.png)

**Captura de ejecución:**
![ej2-prueba.png](capturas/semana%202/ej2-prueba.png)

**Explicación:** Se usa `map(String::toUpperCase)` con Method Reference para convertir cada nombre a mayúsculas.

---

### Ejercicio 03 — Poder Total del Equipo

Dada una lista de niveles de Pokémon, calcular la suma total de niveles del equipo.

**Código implementado:**
![ej3-codigo.png](capturas/semana%202/ej3-codigo.png)

**Captura de ejecución:**
![ej3-prueba.png](capturas/semana%202/ej3-prueba.png)

**Explicación:** Se usa `reduce(0, Integer::sum)` para sumar todos los niveles del equipo partiendo desde 0.

---

### Ejercicio 04 — Pokémon Alfa

Encontrar el Pokémon con el nivel más alto dentro del equipo.

**Código implementado:**
![ej4-codigo.png](capturas/semana%202/ej4-codigo.png)

**Captura de ejecución:**
![ej4-prueba.png](capturas/semana%202/ej4-prueba.png)

**Explicación:** Se usa `max(Comparator.comparingInt)` para encontrar el Pokémon con el nivel más alto de la lista.

---

### Ejercicio 05 — Pokémon Legendarios

Contar cuántos Pokémon del equipo tienen nivel superior a 80.

**Código implementado:**
![ej5-codigo.png](capturas/semana%202/ej5-codigo.png)

**Captura de ejecución:**
![ej5-prueba.png](capturas/semana%202/ej5-prueba.png)

**Explicación:** Se usa `filter()` para obtener los Pokémon con nivel mayor a 80 y `count()` para contarlos.

---

### Ejercicio 06 — Pokédex Sin Duplicados

Dada una lista de Pokémon con elementos repetidos, generar una nueva colección donde cada Pokémon aparezca una sola vez.

**Código implementado:**
![ej6-codigo.png](capturas/semana%202/ej6-codigo.png)

**Captura de ejecución:**
![ej6-prueba.png](capturas/semana%202/ej6-prueba.png)

**Explicación:** Se usa `distinct()` para eliminar automáticamente los elementos repetidos de la lista.

---

### Ejercicio 07 — Orden del Profesor Oak

El Profesor Oak quiere su Pokédex organizada. Ordenar alfabéticamente los nombres de los Pokémon.

**Código implementado:**
![ej7-codigo.png](capturas/semana%202/ej7-codigo.png)

**Captura de ejecución:**
![ej7-prueba.png](capturas/semana%202/ej7-prueba.png)

**Explicación:** Se usa `sorted()` para ordenar los nombres de los Pokémon alfabéticamente de forma natural.

---

### Ejercicio 08 — Evoluciones Preparadas

Dada una lista de Pokémon que incluye si pueden evolucionar, obtener únicamente los que estén listos para evolucionar.

**Código implementado:**
![ej8-codigo.png](capturas/semana%202/ej8-codigo.png)

**Captura de ejecución:**
![ej8-prueba.png](capturas/semana%202/ej8-prueba.png)

**Explicación:** Se usa `filter()` para obtener solo los Pokémon cuyo atributo `puedeEvolucionar` sea `true`.

---

### Ejercicio 09 — Equipo Élite

Mostrar únicamente los Pokémon cuyo poderCombate sea superior a 500.

**Código implementado:**
primero cree la clase pokemon:
![ej9-clasePokemon-codigo.png](capturas/semana%202/ej9-clasePokemon-codigo.png)

luego el ejercicio:
![ej9-codigo.png](capturas/semana%202/ej9-codigo.png)

**Captura de ejecución:**
![ej9-prueba.png](capturas/semana%202/ej9-prueba.png)

**Explicación:** Se usa `filter()` para obtener los Pokémon con poderCombate mayor a 500 y `sorted().reversed()` para ordenarlos de mayor a menor.

---

### Ejercicio 10 — Pokédex Compacta

Generar una lista que contenga únicamente los nombres de todos los Pokémon del equipo.

**Código implementado:**
![ej10-codigo.png](capturas/semana%202/ej10-codigo.png)

**Captura de ejecución:**
![ej10-prueba.png](capturas/semana%202/ej10-prueba.png)

**Explicación:** Se usa `map(Pokemon::getNombre)` con Method Reference para extraer únicamente el nombre de cada Pokémon.

---

### Ejercicio 11 — Poder Promedio

Calcular el promedio de poderCombate de todos los Pokémon del equipo.

**Código implementado:**
![ej11-codigo.png](capturas/semana%202/ej11-codigo.png)

**Captura de ejecución:**
![ej11-prueba.png](capturas/semana%202/ej11-prueba.png)

**Explicación:** Se usa `mapToDouble()` para convertir a valores numéricos y `average()` para calcular el promedio automáticamente.

---

### Ejercicio 12 — Campeón Regional

Obtener el Pokémon con mayor poderCombate de toda la lista.

**Código implementado:**
![ej12-codigo.png](capturas/semana%202/ej12-codigo.png)

**Captura de ejecución:**
![ej12-prueba.png](capturas/semana%202/ej12-prueba.png)

**Explicación:** Se usa `max(Comparator.comparingDouble)` para encontrar el Pokémon con el mayor poderCombate de la lista.

---

### Ejercicio 13 — Organizar por Tipo

Agrupar todos los Pokémon por su tipo y mostrar el listado por grupo.

**Código implementado:**
![ej13-codigo.png](capturas/semana%202/ej13-codigo.png)

**Captura de ejecución:**
![ej13.prueba.png](capturas/semana%202/ej13.prueba.png)

**Explicación:** Se usa `groupingBy(Pokemon::getTipo)` para agrupar por tipo y `mapping()` para extraer solo los nombres de cada grupo.

---

### Ejercicio 14 — Organizar por Región

Agrupar los Pokémon según su región de origen.

**Código implementado:**
![ej14-codigo.png](capturas/semana%202/ej14-codigo.png)

**Captura de ejecución:**
![ej14-prueba.png](capturas/semana%202/ej14-prueba.png)

**Explicación:** Se usa `groupingBy(Pokemon::getRegion)` para agrupar por región y `mapping()` para extraer solo los nombres de cada grupo.

---

### Ejercicio 15 — Maestro de Gimnasios

Dado un listado de entrenadores con sus medallas, encontrar el entrenador con más medallas.

**Código implementado:**
primero implemente la clase entrenadior:
![ej15-codigoEntrenador.png](capturas/semana%202/ej15-codigoEntrenador.png)

luego el ejercicio:
![ej15-codigo.png](capturas/semana%202/ej15-codigo.png)

**Captura de ejecución:**
![ej15-prueba.png](capturas/semana%202/ej15-prueba.png)

**Explicación:** Se usa `max(Comparator.comparingInt)` para encontrar el entrenador con mayor número de medallas.

---

### Ejercicio 16 — Entrenadores Experimentados

Mostrar únicamente los entrenadores que posean más de 5 medallas.

**Código implementado:**
![ej16-codigo.png](capturas/semana%202/ej16-codigo.png)

**Captura de ejecución:**
![ej16-prueba.png](capturas/semana%202/ej16-prueba.png)

**Explicación:** Se usa `filter()` para obtener solo los entrenadores con más de 5 medallas y `map()` para formatear la salida.

---

### Ejercicio 17 — Equipo Más Poderoso

Calcular cuál entrenador tiene la suma total de poderCombate más alta entre todos sus Pokémon.

**Código implementado:**
![ej17-codigo.png](capturas/semana%202/ej17-codigo.png)

**Captura de ejecución:**
![ej17-prueba.png](capturas/semana%202/ej17-prueba.png)

**Explicación:** Se usa `mapToDouble()` y `sum()` para calcular el poder total de cada equipo, y `max()` para encontrar el entrenador más poderoso.

---

### Ejercicio 18 — Top 5 Pokémon Más Fuertes

Generar un ranking de los cinco Pokémon con mayor poderCombate de toda la Pokédex.

**Código implementado:**
![ej18-codigo.png](capturas/semana%202/ej18-codigo.png)

**Captura de ejecución:**
![ej18-prueba.png](capturas/semana%202/ej18-prueba.png)

**Explicación:** Se usa `sorted().reversed()` para ordenar de mayor a menor y `limit(5)` para obtener solo los primeros 5.

---

### Ejercicio 19 — Top 3 Entrenadores

Generar un ranking de los 3 mejores entrenadores considerando medallas, poder acumulado y orden alfabético.

**Código implementado:**
![ej19-codigo.png](capturas/semana%202/ej19-codigo.png)

**Captura de ejecución:**
![ej19-prueba.png](capturas/semana%202/ej19-prueba.png)

**Explicación:** Se usa un `Comparator` encadenado que ordena por medallas, luego por poder acumulado y finalmente alfabéticamente como desempate.

---

### Ejercicio 20 — Pokédex Analítica

Construir una estructura que muestre cantidad de Pokémon por tipo, por región, cantidad de legendarios, promedio de nivel y el Pokémon más fuerte.

**Código implementado:**
![ej20-codigo.png](capturas/semana%202/ej20-codigo.png)
![ej20-codigo2.png](capturas/semana%202/ej20-codigo2.png)

**Captura de ejecución:**
![ej20-prueba.png](capturas/semana%202/ej20-prueba.png)

**Explicación:** Se combinan `groupingBy()`, `counting()`, `filter()`, `mapToInt()`, `average()` y `max()` para construir un análisis completo de la Pokédex usando únicamente Streams.

---

## Retos Especiales 
- [x] Reto Legendario — Method References
    - Ejercicio 02: String::toUpperCase
    - Ejercicio 03: Integer::sum
    - Ejercicio 09: Pokemon::getPoderCombate
    - Ejercicio 10: Pokemon::getNombre
    - Ejercicio 12: Pokemon::getPoderCombate


- [x] Reto Shiny — Buenas prácticas de commits
    - feat: top 3 entrenadores
    - feat: top 5 mas fuertes
    - feat: equipo poderoso completo
    - feat: entrenadores pros completo
    - feat: maestro de gim ejercicio 15
    - feat: ejercicio 14 completado
    - feat: ejercicio 13 completado
    - feat: ejercicio 12 completado


- [x] Reto Mewtwo — Ejercicio propuesto
  - Ejercicio propuesto: Liga Pokémon DOSW Dado un equipo completo de Pokémon, generar un informe que muestre los legendarios más fuertes agrupados por región, ordenados por poder de combate y calculando el poder promedio de cada grupo regional.
  

**Código implementado:**
![RetoMewtwo-codigo.png](capturas/semana%202/RetoMewtwo-codigo.png)
![RetoMewtwo-codigo2.png](capturas/semana%202/RetoMewtwo-codigo2.png)

**Captura de ejecución:**
![RetoMewtwo-prueba.png](capturas/semana%202/RetoMewtwo-prueba.png)

---

# SEMANA No 3 — DOSW Diagrama de clases

## Ejercicio en clase:
![img.png](capturas/semana%203/img.png)
![img_1.png](capturas/semana%203/img_1.png)

## Solucion:
![diagrama de clases pokemon.png](capturas/semana%203/diagrama%20de%20clases%20pokemon.png)