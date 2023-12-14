package boletin16;

public class publicacion {
    // Atributos comunes para las subclases libro y revista
    protected int codigo;
    protected String titulo;
    protected int anoPublicacion;

    // Constructor de la superclase Publicacion
    public publicacion(int codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    // Métodos comunes para Libro y Revista
    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return anoPublicacion;
    }

    // Método toString que devuelve la información en forma de cadena
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + anoPublicacion;
    }
}
