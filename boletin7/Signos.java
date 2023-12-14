package boletin7;

import java.util.Scanner;

public class Signos {
    public static void main(String[] args) {
        //declaracion del scanner para recoger datos por pantalla
        Scanner scanner = new Scanner(System.in);
        //dato pedido por pantalla
        System.out.print("Introduce un número: ");
        //dato recogido por el scanner en la variable numero
        int numero = scanner.nextInt();
        //cierre del scanner
        scanner.close();

        //comprobacion de los datos recogidos
        if (numero > 0) {
            System.out.println("+");
        } else if (numero < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
