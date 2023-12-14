package boletin7;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        //declaracion del scanner
        Scanner scanner = new Scanner(System.in);

        //pide numero por pantalla
        System.out.print("Introduce un número: ");
        //recoge el dato en la variable numero
        int numero = scanner.nextInt();

        //cierre del scanner para ahorrar recursos
        scanner.close();

        //comprobacion del valor del numero pedido por pantalla
        if (numero > 0) {
            System.out.println("es positivo.");
        } else {
            System.out.println("no es positivo.");
        }
    }
}

