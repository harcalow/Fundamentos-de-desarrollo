# Java Katas — Repaso de fundamentos

15 ejercicios para repasar Java: clases, interfaces, herencia, colecciones (`List`, `Map`),
excepciones, `Optional` y streams básicos.

## Cómo funcionan

Cada kata tiene dos partes:

- **El enunciado y el esqueleto**, en `app/src/main/java/com/fundamentos/katas/kataNN/`.
  El enunciado está en el Javadoc de la clase y de cada método. Los métodos lanzan
  `UnsupportedOperationException("TODO")`: sustituye eso por tu implementación.
- **Los tests**, en `app/src/test/java/com/fundamentos/katas/kataNN/`. Al principio todos fallan
  (rojo). La kata está resuelta cuando todos pasan (verde). **No modifiques los tests.**

Las clases marcadas como "ya está completo" (records de datos, `RecursoSimulado`) son de apoyo
y no hace falta tocarlas.

## Ejecutar los tests

```bash
# Una sola kata (recomendado mientras trabajas)
./gradlew test --tests "com.fundamentos.katas.kata01.*"

# Todas las katas
./gradlew test
```

En Windows PowerShell usa `.\gradlew.bat` en lugar de `./gradlew`.

El informe HTML con el detalle de cada fallo queda en
`app/build/reports/tests/test/index.html`.

> Mientras queden katas sin resolver, `./gradlew test` y `./gradlew build` terminarán en
> `BUILD FAILED`. Es lo esperado: indica que aún quedan tests en rojo.

## Lista de katas

| #  | Tema | Clase(s) a implementar | Practicas |
|----|------|------------------------|-----------|
| 01 | Clases y objetos | `Persona` | constructores, validación, `toString`, `equals`/`hashCode` |
| 02 | Encapsulamiento | `CuentaBancaria` | estado privado, invariantes, listas no modificables |
| 03 | Interfaces | `Figura`, `Circulo`, `Rectangulo`, `CalculadoraFiguras` | `implements`, métodos `default`, polimorfismo |
| 04 | Herencia | `Empleado`, `Gerente`, `Desarrollador`, `DesarrolladorSenior`, `Nomina` | clases abstractas, `super`, `@Override` |
| 05 | Records y orden | `Producto`, `OrdenadorProductos` | `record`, `Comparable`, `Comparator` |
| 06 | List | `OperacionesLista` | `ArrayList`, `Set`, genéricos, bucles (sin streams) |
| 07 | Map: frecuencias | `ContadorPalabras` | `HashMap`, `merge`, `getOrDefault`, regex simple |
| 08 | Map: agrupar y fusionar | `OperacionesMapa` | `TreeMap`, `computeIfAbsent`, `entrySet` |
| 09 | Excepciones | `Conversiones`, `EdadInvalidaException` | `try/catch`, checked vs unchecked, causa, try-with-resources |
| 10 | Excepciones propias | `Inventario`, `StockInsuficienteException`, `ProductoNoEncontradoException` | excepciones con datos, operaciones atómicas |
| 11 | Optional básico | `RepositorioUsuarios` | `ofNullable`, `map`, `orElse`, `orElseThrow` |
| 12 | Optional encadenado | `OptionalAvanzado` | `filter`, `flatMap`, evitar `null` |
| 13 | Streams básicos | `GestorEstudiantes` | `filter`, `map`, `sorted`, `count`, `max`, `anyMatch` |
| 14 | Streams numéricos | `StreamsNumericos` | `IntStream`, `reduce`, `boxed`, `joining` |
| 15 | Collectors (reto final) | `ReporteVentas` | `groupingBy`, `partitioningBy`, `toMap`, `summingDouble` |

## Consejos

1. Haz las katas en orden: cada una se apoya en conceptos de las anteriores.
2. Lee el mensaje del test que falla: suele decir qué valor esperaba y cuál recibió.
3. Cuando una kata esté en verde, intenta mejorar el código sin romper los tests (refactor).
4. Para repetir una kata desde cero: `git checkout -- app/src/main/java/com/fundamentos/katas/kataNN`
