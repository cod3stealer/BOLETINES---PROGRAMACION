package boletin12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garaxe garaxe = new Garaxe();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce la matricula del coche (o 'salir' para salír): ");
            String matricula = scanner.nextLine();

            if (matricula.equals("salir")){
                break;
            }

            System.out.print("Introduce a marca do coche: ");
            String marca = scanner.nextLine();

            garaxe.comprobarCapacidade(matricula, marca);

            System.out.print("Introduce o tempo de estacionamento en horas: ");
            int horas = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            garaxe.calcularAparcamiento(horas, matricula);
        }
    }
}
