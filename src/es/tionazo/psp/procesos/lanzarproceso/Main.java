package es.tionazo.psp.procesos.lanzarproceso;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /* Declaramos e inicializamos un ProcessBuilder, al que le pasamos como único argumento el nombre del
            ejecutable (no le damos la ruta completa por que está incluída en el path de Windows)
         */
        ProcessBuilder pb = new ProcessBuilder("Notepad");
        try {
            // ejecutamos el ProcessBuilder que puede propagar una excepción de tipo IO Exception
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
