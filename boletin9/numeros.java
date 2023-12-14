package boletin9;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número enteiro: ");
            int numero = scanner.nextInt();

            if (numero > 0)
                positivos++;
            else if (numero < 0)
                negativos++;
            else
                ceros++;
        }
        scanner.close();

        System.out.println("Cantidade de números positivos: " + positivos + "\n" +
                "Cantidade de números negativos: " + negativos + "\nCantidade de ceros: " + ceros);
    }
}
