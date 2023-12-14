package boletin18;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Declaramos las variables
        int minutos, dia, turno;
        double importe, impuesto;

        // Leemos los datos de entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la duración de la llamada (en minutos): ");
        minutos = sc.nextInt();
        System.out.print("Introduzca el día de la semana (1-7): ");
        dia = sc.nextInt();
        System.out.print("Introduzca el turno de la llamada (1-2): ");
        turno = sc.nextInt();

        // Calculamos el importe de la llamada
        importe = calcularImporte(minutos);

        // Calculamos el impuesto
        impuesto = calcularImpuesto(importe, dia, turno);

        // Imprimimos los resultados
        System.out.println("El importe de la llamada es de " + importe + " euros");
        System.out.println("El impuesto a pagar es de " + impuesto + " euros");

    }

    private static double calcularImporte(int minutos) {
        double importe = 0;

        if (minutos <= 5) {
            importe = minutos * 1;
        } else if (minutos <= 8) {
            importe = 5 * 1 + (minutos - 5) * 0.8;
        } else if (minutos <= 10) {
            importe = 5 * 1 + 3 * 0.8 + (minutos - 8) * 0.7;
        } else {
            importe = 5 * 1 + 3 * 0.8 + 2 * 0.7 + (minutos - 10) * 0.5;
        }

        return importe;
    }

    public static double calcularImpuesto(double importe, int dia, int turno) {
        double impuesto = 0;

        if (dia == 0) {
            impuesto = importe * 0.03;
        } else if (turno == 1) {
            impuesto = importe * 0.15;
        } else if (turno == 2) {
            impuesto = importe * 0.1;
        }

        return impuesto;
    }
}
