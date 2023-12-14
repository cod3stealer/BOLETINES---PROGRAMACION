package boletin5;

public class Consumo {
    //Atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    //Constructores
    //Constructor por defecto
    public Consumo(){
    }

    //Constructor parametrizado
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    //Metodo de acceso
    //Getters
    public float getTempo(){
        return km/vMed;
    }
    public float getvMed(){
        return vMed;
    }
    //Setters
    public void setKms(float km){
        this.km = km;
    }
    public void setLitros(float litros){
        this.litros = litros;
    }
    public void setVMed(float vMed){
        this.vMed = vMed;
    }
    public void setPGas(float pGas){
        this.pGas = pGas;
    }

    //Metodos
    public float consumoMedio(){
        return (km/litros)*100;
    }
    public float consumoEuros(){
        return (litros/pGas)/km*100;
    }
}
