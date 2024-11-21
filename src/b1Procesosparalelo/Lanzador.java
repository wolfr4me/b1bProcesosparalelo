package b1Procesosparalelo;

import java.io.IOException;

public class Lanzador {

	public static void main(String[] args) {
		try {
            // Construir el comando para ejecutar Calculador
            ProcessBuilder p1 = new ProcessBuilder(
                "java", "Calculador", "10", "20", "1500" // Clase y parámetros
            );
            ProcessBuilder p2 = new ProcessBuilder(
            		"java", "Calculador","10", "20", "300"
            		);
            // Heredar entrada/salida del proceso
            p1.inheritIO();
            p2.inheritIO();

            // Iniciar el proceso
            Process proceso1 = p1.start();
            Process proceso2 = p2.start();

            // Esperar a que el proceso termine
            int exitCode1 = proceso1.waitFor();
            int exitCode2 = proceso2.waitFor();
            System.out.println("Proceso finalizado con código: " + exitCode1 + exitCode2);

        } catch (IOException | InterruptedException e) {
            System.err.println("Error al ejecutar el proceso: " + e.getMessage());
        }

	}

}
