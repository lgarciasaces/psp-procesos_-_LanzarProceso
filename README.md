# psp-procesos_-_LanzarProceso
Lanza un proceso de forma simple

Declaramos e inicializamos un ```ProcessBuilder``` ([doc](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/ProcessBuilder.html)), al que le pasamos como único argumento el nombre del ejecutable ```Notepad``` (no le damos la ruta completa por que está incluída en el path de Windows)

Ejecutamos el ProcessBuilder que puede propagar una excepción de tipo ```IOException``` ([doc](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/IOException.html))
