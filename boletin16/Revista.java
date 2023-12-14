package boletin16;

public class Revista extends publicacion {
    // Atributo específico para Revista
    private int numero;

    // Constructor de la clase Revista
    public Revista(int codigo, String titulo, int anoPublicacion, int numero) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    // Método específico para Revista
    public int getNumero() {
        return numero;
    }

    // Método toString que sobreescribe el de la superclase
    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}
