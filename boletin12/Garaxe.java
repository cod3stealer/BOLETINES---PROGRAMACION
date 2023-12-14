package boletin12;

import java.util.Scanner;

/**
 *Codifica un programa para xestionar un garaxe de coches .
 *      A clase Garaxe ten como atributos :
 *             numeroCoches ( para saber o nº de coches que están nese momento no garaxe )
 *            matricula para identificalo
 *           marca do coche
 *       Antes de deixar aparcar un coche. Debemos comprobar que temos sitio para él, en caso afirmativo poñemos unha mensase
 *       “PLAZAS DISPOÑIBLES “ e rexistramos o coche . No caso contrario poríamos unha mensaxe “ COMPLETO “.
 *    Para facer máis doado o programa, suponer que o garaxe ten capacidade para 5 coches
 *  Para calcular o prezo do aparcamento , considerade o seguinte :
 * primeiros 3 horas. ----> 1.5 €
 * O resto do tempo : pagamos 0.20 € cada hora.
 * A daida será :
 * FACTURA
 * MATRICULA COCHE ........
 * TEMPO .................
 * PRECIO...............
 * CARTOS RECIBIDOS...........
 * CARTOS DEVOLTOS............
 * GRACIAS POR USAR O NOSO APARCADOIRO
 */

public class Garaxe {
    // Atributos
    private final int capacidade = 5;
    private final float prim3horas = 1.5f;
    private final float restoHoras = 0.20f;
    private int numCoches;
    private String[] matricula;
    private String[] marca;

    // Constructor
    public Garaxe (){
        // Inicializo el numCoches y los arrays con una lonjitud equivalente a la capacidad del garaje
        numCoches = 0;
        matricula = new String[capacidade];
        marca = new String[capacidade];
    }

    // Métodos
    public void comprobarCapacidade(String matricula, String marca){
        if (numCoches < capacidade) {
            System.out.println("PLAZAS DISPONIBLES");
            // En la posicion 0 del array agrego los datos de los nuevos vehiculos de la siguiente manera
            this.matricula[numCoches] = matricula;
            this.marca[numCoches] = marca;
            // Como ya he guardado los datos, agrego un 1 al contador que en este caso es numCoches
            numCoches++;
        } else {
            System.out.println("COMPLETO");
        }
    }

    public void calcularAparcamiento(int horas, String matricula){
        double precio;
        float cartosRec;

        if (horas > 3){
            precio = prim3horas + (horas - 3) * restoHoras;
        } else {
            precio = horas * restoHoras;
        }
        System.out.println("FACTURA\nMATRICULA DEL COCHE: "+matricula+" \nTIEMPO DE APARCAMIENTO: "+horas+" horas\nPRECIO: "+precio+" €");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero a insertar: ");
        cartosRec = sc.nextFloat();

        if (precio > cartosRec) {
            while (precio > cartosRec){
                System.out.println("Operación incorrecta, faltan "+(cartosRec - precio)+" € por ingresar");
                System.out.println("Dinero a insertar: ");
                cartosRec = sc.nextFloat();
            }
            System.out.println("Operación realizada");
        } else {
            System.out.println("Dinero a devolver: "+(precio - cartosRec)+" €");
        }
        System.out.println("GRACIAS POR USAR NUESTRO APARCAMIENTO");
    }
}
