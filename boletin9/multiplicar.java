package boletin9;

import java.util.Scanner;

public class multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para a táboa de multiplicar: \n0 para terminar");
        int numero = scanner.nextInt();

        while (numero != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabla de "+numero+ "\n" + " x " + i + " = " + (numero * i)+"\n");
            }

            System.out.print("Introduce outro número: \n0 para terminar");
            numero = scanner.nextInt();
        }
        scanner.close();
    }
}
