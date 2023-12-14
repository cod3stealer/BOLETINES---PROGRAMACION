package boletin8;

import java.util.Scanner;

public class almacen {
    public static void main(String[] args) {
        //Atributos
        String tipoArtigo;

        //declaracion del scanner
        Scanner scanner = new Scanner(System.in);

        //pedida de datos por pantalla
        System.out.print("Introduce o nome do artigo: ");
        String nomeArtigo = scanner.nextLine();
        System.out.print("Introduce as vendas anuais do artigo: ");
        int vendasAnuais = scanner.nextInt();

        //Comparacion
        if (vendasAnuais <= 100)
            tipoArtigo = "Baixo";
        else if (vendasAnuais <= 500)
            tipoArtigo = "Medio";
        else if (vendasAnuais <= 1000)
            tipoArtigo = "Alto";
        else
            tipoArtigo = "Primeira Necesidade";

        //Print del resultado
        System.out.println("O artigo " + nomeArtigo + " é de consumo " + tipoArtigo);
    }
}
