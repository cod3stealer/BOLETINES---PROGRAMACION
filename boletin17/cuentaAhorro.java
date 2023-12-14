package boletin17;

public class cuentaAhorro extends conta {
    private double interesVariable;
    private double saldoMinimo;

    public cuentaAhorro(persona cliente, long numeroConta, double interesVariable, double saldoMinimo, char tipo) {
        super(cliente, numeroConta, tipo);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public void cambiarInteres(double nuevoInteres) {
        this.interesVariable = nuevoInteres;
    }

    public void actualizarSaldo() {
        if (getSaldo() >= saldoMinimo) {
            double interes = getSaldo() * (interesVariable / 100);
            ingresar(interes);
        }
    }

    @Override
    public String toString() {
        return "CuentaAhorro " + super.toString() + ", interesVariable=" + interesVariable + ", saldoMinimo=" + saldoMinimo;
    }
}
