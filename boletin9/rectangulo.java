package boletin9;

import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a base do rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce a altura do rectángulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        if (base > 0 && altura > 0)
            System.out.println("O área do rectángulo é: " + (base*altura));
        else
            System.out.println("Os valores deben ser positivos.");

    }
}
