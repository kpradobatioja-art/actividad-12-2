import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de términos (n): ");
            int n = input.nextInt();

            double suma = 0;

            int f1 = 0;
            int f2 = 1;

            int potencia = 2;

            for (int i = 1; i <= n; i++) {

                int fib = f1;

                double termino = Math.pow(fib, potencia) / i;

                if (i == 2 || i == 7) {
                    termino = -termino;
                }

                // Mostrar
                System.out.println("Término " + i + ": " + termino);

                suma += termino;

                int siguiente = f1 + f2;
                f1 = f2;
                f2 = siguiente;

                potencia++;
            }

            System.out.println("\nLa suma total es: " + suma);
        }
}