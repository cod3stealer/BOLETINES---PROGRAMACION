package boletin4;

public class Libro {
    //Atributos
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //Constructor por defecto (inicializa los valores de los atributos)
    public void Libro(){}

    //Constructor
    public void libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    //Metodos de acceso

    // Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public float getValoracion(){
        return valoracion;
    }

    public void amosar(){
        System.out.println(titulo+" "+autor+" "+ano+" "+numPaginas+" "+valoracion);
    }
}
