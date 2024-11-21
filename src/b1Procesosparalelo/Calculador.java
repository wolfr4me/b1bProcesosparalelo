package b1Procesosparalelo;

public class Calculador {
	
	public static void realizarCalculo(int numBase, int numVeces, int timeSleep) {
        // Lógica de la función
        System.out.println("Cálculo iniciado con base: " + numBase);
        // Se repite hasta que i sea mayor que numVeces
        for (int i = 0; i < numVeces; i++) {
            System.out.println("Iteración " + (i + 1) + ": " + ((numBase + i) + (numBase + i + 1)));
            try {
            	// tiempo de espera
                Thread.sleep(timeSleep);
            } catch (InterruptedException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Cálculo finalizado.");
    }
	public static void main(String[] args) {
		 if (args.length < 3) {
	            System.err.println("Uso: java Calculador <numBase> <numVeces> <timeSleep>");
	            return;
	        }

	        int numBase = Integer.parseInt(args[0]);
	        int numVeces = Integer.parseInt(args[1]);
	        int timeSleep = Integer.parseInt(args[2]);

	        realizarCalculo(numBase, numVeces, timeSleep);
		
	}

}
