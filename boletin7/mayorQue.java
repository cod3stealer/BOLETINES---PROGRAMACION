package boletin7;

import java.util.Scanner;

public class mayorQue {
    public static void main(String[] args) {
        //declaracion del scanner
        Scanner scanner = new Scanner(System.in);

        //recogida del string por el scanner en la variable num1
        System.out.print("Introduce o primeiro número: ");
        int num1 = scanner.nextInt();

        //recogida del string por el scanner en la variable num2
        System.out.print("Introduce o segundo número: ");
        int num2 = scanner.nextInt();

        //recogida del string por el scanner en la variable num3
        System.out.print("Introduce o terceiro número: ");
        int num3 = scanner.nextInt();

        //cierre del scanner
        scanner.close();

        //comparacion de numeros
        //no pongo corchetes ya que no son necesarios si solo es una linea de codigo despues de los IFs
        if (num1 > num2 && num1 > num3)
            System.out.println("O maior número é: " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("O maior número é: " + num2);
        else
            System.out.println("O maior número é: " + num3);
    }
}
