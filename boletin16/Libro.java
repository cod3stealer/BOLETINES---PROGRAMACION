package boletin16;

public class Libro extends publicacion {
    // Atributo específico para Libro
    private boolean prestado;

    // Constructor de la clase Libro
    public Libro(int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = false; // Al crear un libro, inicialmente no está prestado
    }

    // Método específico para Libro
    public boolean isPrestado() {
        return prestado;
    }

    // Método toString que sobreescribe el de la superclase
    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}
