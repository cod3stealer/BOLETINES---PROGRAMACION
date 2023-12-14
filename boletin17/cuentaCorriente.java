package boletin17;

public class cuentaCorriente extends conta {

    public cuentaCorriente(persona cliente, long numeroConta, char tipo) {
        super(cliente, numeroConta,tipo);
    }

    @Override
    public String toString() {
        return "cuenta corriente " + super.toString();
    }
}
