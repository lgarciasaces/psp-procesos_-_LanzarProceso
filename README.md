# psp-procesos_-_LanzarProceso
Lanza un proceso de forma simple

Declaramos e inicializamos un ```ProcessBuilder```, al que le pasamos como único argumento el nombre del ejecutable ```Notepad``` (no le damos la ruta completa por que está incluída en el path de Windows)

Ejecutamos el ProcessBuilder que puede propagar una excepción de tipo ```IOException```
