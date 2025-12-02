import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        // Número de elementos a sumar
        int numElementos = 10; // Se puede ajustar según se desee más o menos términos

        double suma = 0.0; // Variable para almacenar el resultado final

        for (int i = 0; i < numElementos; i++) {
            // Fórmula para cada término en la sucesión
            double termino = Math.pow(i, 2) / (Math.sqrt(i + 1));
            suma += termino;

            System.out.println("Término " + (i + 1) + ": " + termino);
        }

        // Mostrar la suma total de la sucesión
        System.out.println("\nLa suma total de los primeros " + numElementos + " términos es: " + suma);
    }
}

