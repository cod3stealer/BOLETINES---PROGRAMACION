package boletin8;

import java.util.Scanner;

/*Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras .
     O usuario premerá a opción desexada .Según ésta o programa pediralle os datos precisos e, utilizando un switch…case visualizará o resultado .
   No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “ opción incorrecta “.
1…. Cadrado
2…. Triangulo
3…. Circulo
*/

public class superficie {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);

        //Atributos
        double superficie=0;
        float lado, altura;
        boolean control = true;
        int opcion;

        //Comienzo del menu
        System.out.println("Escolle a figura para calcular a superficie:\n1. Cadrado\n2. Triángulo\3. Círculo");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Lado del cuadrado: ");
                lado = sc.nextFloat();
                superficie = lado * lado;
                break;
            case 2:
                System.out.println("Base del triangulo: ");
                lado = sc.nextFloat();
                System.out.println("Altura del triangulo: ");
                altura = sc.nextFloat();
                superficie = lado*altura/2;
                break;
            case 3:
                System.out.println("Radio del circulo: ");
                lado = sc.nextFloat();
                superficie = Math.PI * Math.pow(lado,2);
                break;
            default:
                System.out.println("Opcion no valida, vuelva a introducir la opcion");
                break;
        }

        if (control)
            System.out.println("A superficie da figura é: " + superficie);
    }
}
