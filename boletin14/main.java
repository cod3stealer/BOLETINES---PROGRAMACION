package boletin14;

import boletin14.componentes.Monitor;
import boletin14.componentes.Teclado;
import boletin14.componentes.Procesador;

public class main {
    public static void main(String[] args) {
        // Creo instancias de los componentes del ordenador
        Monitor monitor = new Monitor("Marca");
        Teclado teclado = new Teclado("Marca");
        Procesador procesador = new Procesador(3.2); // Velocidad en GHz

        // Creo instancia del ordenador
        Ordenador ordenador = new Ordenador(monitor, teclado, procesador, 120);

        // Mostrar características del ordenador
        ordenador.mostrarCaracteristicas();

        // Mostrar precio del ordenador
        System.out.println("Precio del ordenador: $" + ordenador.getPrecio());
    }
}
