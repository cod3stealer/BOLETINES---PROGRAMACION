package boletin14;

// Imports de los packages creados a mano
import boletin14.componentes.Monitor;
import boletin14.componentes.Teclado;
import boletin14.componentes.Procesador;

public class Ordenador {
    // Atributos de la clase Ordenador, esto es lo mismo que crear
    // objetos como en Monitor mo = new Monitor();
    // solo que esta vez no se lanzan los constructores de dichas instancias
    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    private float precio;

    // Constructor parametrizado
    public Ordenador(Monitor mo, Teclado te, Procesador pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    // Métodos para obtener características del ordenador
    public void mostrarCaracteristicas() {
        // Como he dicho antes, los atributos creados al principio
        // son realmente referencias a las clases creadas demtro
        // del package "componentes"
        System.out.println("Características del ordenador:");
        System.out.println("Marca del monitor: " + mo.getMarca());
        System.out.println("Marca del teclado: " + te.getMarca());
        System.out.println("Velocidad del procesador: " + pro.getVelocidad() + " GHz");
    }

    // Getter
    public float getPrecio() {
        return precio;
    }
}
