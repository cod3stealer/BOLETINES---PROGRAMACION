package boletin7;

import java.util.Scanner;

public class sumaResta {
    public static void main(String[] args) {
        //declaracion del scanner
        Scanner scanner = new Scanner(System.in);

        //dato pedido por pantalla
        System.out.print("Introduce o primeiro número (short): ");
        //dato recogido por el scanner en la variable num1
        short num1 = scanner.nextShort();
        //dato pedido por pantalla
        System.out.print("Introduce o segundo número (short): ");
        //dato recogido por el scanner por la variable num2
        short num2 = scanner.nextShort();
        //cierre del scanner para ahorrar recursos
        scanner.close();

        //comprobacion de ambos numeros y calculos
        if (num1 >= num2)
            System.out.println("Resta: " + (num1 - num2));
        System.out.println("Suma: " + (num1 + num2));
    }
}
