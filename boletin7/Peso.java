package boletin7;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        //declaracion del scanner
        Scanner scanner = new Scanner(System.in);
        //pedida de datos por pantalla
        System.out.print("Nome da primeira persoa: ");
        //recogida del string por el scanner en la variable nome1
        String nome1 = scanner.nextLine();
        //pedida de datos por pantalla
        System.out.print("Peso da primeira persoa: ");
        //recogida del string por el scanner en la variable peso1
        double peso1 = scanner.nextDouble();
        //pedida de datos por pantalla
        System.out.print("Nome da segunda persoa: ");

        //Esto es porque despues de un nextDouble,Int,Float... se consume una linea de entrada adicional
        //desembocando en que la entrada dedicada al proximo scanner ya esté en uso por lo que
        //el usuario vería el texto del systemoutPrint pero no podria escribir nada porque
        //para el scanner el valor ya ha sido introducido. Para evitar esto, se usa un nextLine()
        //despues de la lectura de cualquier dato numerico para asegurar que se consume la linea
        //pendiente del buffer, es decir, la que deciamos que fue consumida de manera prematura y
        //por la que no se guarda el proximo dato pedido por el scanner.
        //Al consumir esta y volver a pedir datos con el scanner, este error se arregla.
        scanner.nextLine();
        String nome2 = scanner.nextLine();
        //recogida del string por el scanner en la variable peso1
        System.out.print("Peso da segunda persoa: ");
        double peso2 = scanner.nextDouble();
        scanner.close();

        //comprobacion de datos
        if (peso1 > peso2) {
            System.out.println(nome1 + " pesa máis que " + nome2);
            System.out.println("Diferenza de peso: " + (peso1 - peso2));
        } else if (peso2 > peso1) {
            System.out.println(nome2 + " pesa máis que " + nome1);
            System.out.println("Diferenza de peso: " + (peso2 - peso1));
        } else {
            System.out.println("Ambas persoas pesan o mesmo.");
        }
    }
}

