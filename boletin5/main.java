package boletin5;

public class main {
    public static void main(String[] args) {
        Consumo consume = new Consumo();

        consume.setLitros(50);
        consume.setPGas(1.57f);

        Consumo consumo = new Consumo(250000, 500, 120,20);

        consumo.consumoMedio();
        consumo.setLitros(200);
        System.out.println(consumo.getvMed());
    }
}
