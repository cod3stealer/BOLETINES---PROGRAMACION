package boletin2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class boletines {
    /*
    Deseña un algoritmo que calcule o área dun triángulo. A  saida faise  por
    pantalla . ( para codificar este programa inicializa a base ao valor 4, e a altura ao valor 3 ) .
    Codifica este programa nun proxecto chamado boletin2_1

  float base,altura,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base:");
        base = sc.nextFloat();
        System.out.println("introduce la altura:");
        altura = sc.nextFloat();
        area = (base*altura)/2;
        System.out.println("area= "+ area);
    */

    // Atributos
    private float b = 3;
    private float h = 4;

    // Constructor
    public void setVariables(float b, float h) {
        this.b = b;
        this.h = h;
    }

    public float getBase() {
        return b;
    }

    public float getAltura() {
        return h;
    }

    // Metodos
    public void areaCalc() {
        float resul = b * h / 2;
        System.out.println(b + " y " + h);
        System.out.println("El área del triangulo es el siguiente " + resul);
    }

    /*
    Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado ).
    Codifica o programa, correspondente, para executar o programa  co nome boletin2_3
    */
    // Metodos
    public void cambioED() {
        double cambio = 0.651;
        //Creo un objeto Scanner que recogerá la entrada por linea
        Scanner sc = new Scanner(System.in);

        //Pido por pantalla el valor que quiero recoger, en este caso Euros
        System.out.println("Cuántos euros quieres cambiar a dolares? ");

        //Recoge la entrada por teclado
        float euro = sc.nextFloat();

        //Cierro el scanner
        sc.close();

        double resultado = cambio * euro;
        System.out.println("El resultado es "+resultado);

        // Anotación importante, no se pueden usar JOptionPane y Scanner juntos.
    }

    /*
    * Escribe un programa que lea o valor dunha distancia en millas mariñas e a pase a metros ( 1 milla mariña = 1852 m ).
     Codifica o programa correspondente para executar o programa
    * */
    public void cambioMMetros() {
        float cambio = 1852;
        //Creo un objeto Scanner que recogerá la entrada por linea
        Scanner sc = new Scanner(System.in);

        //Pido por pantalla el valor que quiero recoger, en este caso Euros
        System.out.println("Dame un numero de millas que quieres cambiar a metros? ");

        //Recoge la entrada por teclado
        float millas = sc.nextFloat();

        //Cierro el scanner
        sc.close();

        double resultado = cambio * millas;
        System.out.println("El resultado de pasar "+millas+ " millas a metros es "+resultado);
    }

    /*
    Codifica un programa que permita o seguinte xogo  para adiviñar un número .
    O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar ( entre 1 e 50 ) e
    o número máximo de intentos que ten o segundo xogador para dar con el . O programa irá sacando por pantaia
    mensaxes que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar
    */
    public void jueguito(){
        // Atributos
        Random random = new Random();
        // numero random entre 1 y 50
        int numero = random.nextInt(50) + 1;

        //Declaracion de numero a adivinar y numero de intentos
        int numAdv = Integer.parseInt(JOptionPane.showInputDialog(null,"Número que quieres que adivine el otro jugador: "));
        while (numAdv<1 || numAdv>50){
            numAdv = Integer.parseInt(JOptionPane.showInputDialog(null,"Número que quieres que adivine el otro jugador: "));
        }
        int numIntentos = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de intentos: "));
        while (numIntentos<1){
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de intentos: "));
        }
        int numAdvado=100;

        int x = 1;
        //Bucle
        while (numAdv!=numAdvado && numIntentos!=0){
            System.out.println("Adivina el numero, tienes un total de "+numIntentos+" intentos");
            numAdvado = Integer.parseInt(JOptionPane.showInputDialog("Número que crees que es: "));
            numIntentos--;

            if (numAdv==numAdvado)
                x = 0;
        }
        if (x!=1)
            System.out.println("felicidades, lo has adivinado");
        else
            System.out.println("Mala suerte, no has conseguido adivinar un numero");
    }
}









