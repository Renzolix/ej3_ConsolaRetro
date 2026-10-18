# Ejercicio 3: ConsolaRetro

## 🧠 Explicación Lógica
1. **Control de Estado:** El atributo booleano `encendida` sirve como bandera para determinar la situación operativa del dispositivo (inicializado en `false`).
2. **Cambio de Estado:** Los métodos de tipo `void` `encender()` y `apagar()` modifican directamente la variable `encendida` a `true` o `false` respectivamente.
3. **Evaluación Condicional:** El método `mostrarEstado()` utiliza una estructura `if / else` sobre la variable `encendida` para notificar si la consola está encendida o apagada.