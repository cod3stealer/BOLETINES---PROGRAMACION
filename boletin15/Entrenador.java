package boletin15;

public class Entrenador extends seleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nome, String apelidos, int edade, String idFederacion) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
        super.a();
    }

}
