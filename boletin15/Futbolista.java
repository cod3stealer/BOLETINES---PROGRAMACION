package boletin15;

public class Futbolista extends seleccionFutbol {
    private String posicion;

    public Futbolista(int id, String nome, String apelidos, int edade, String posicion) {
        super(id, nome, apelidos, edade);
        this.posicion = posicion;
    }

    public void xogarPartido() {
        super.a();
    }
}

