package boletin9;

import java.util.Scanner;

public class sueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trabajadores1000 = 0;
        int trabajadores1750 = 0;
        int totalTrabajadores = 0;

        System.out.print("Introduce el sueldo del trabajador\n(0 para finalizar el programa): ");
        double sueldo = scanner.nextDouble();

        while (sueldo != 0) {
            if (sueldo <= 1000)
                trabajadores1000++;
            else if (sueldo <= 1750)
                trabajadores1750++;
            totalTrabajadores++;

            System.out.print("Introduce el sueldo del trabajador\n(0 para finalizar el programa): ");
            sueldo = scanner.nextDouble();
        }

        if (totalTrabajadores > 0) {
            System.out.println("Número de trabajadores entre 1000 e 1750 €: " + trabajadores1750);
            System.out.println("Porcentaje de trabajadores que ganan menos de 1000 €: " +
                      (trabajadores1000 / totalTrabajadores * 100) + "%");
        } else {
            System.out.println("No se introdujo ningún trabajador.");
        }
    }
}
