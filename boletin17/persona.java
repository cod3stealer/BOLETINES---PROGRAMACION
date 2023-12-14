package boletin17;

public class persona {
    private String nombre;
    private String apellidos;
    private String NIF;

    public persona(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + "]";
    }
}
