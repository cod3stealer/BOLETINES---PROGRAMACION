package boletin17;

public class conta {
    private long numeroConta;
    private double saldo;
    private persona cliente;
    private char tipo;
    private static final double INTERES_FIJO = 1.5;

    public conta(persona cliente, long numeroConta, char tipo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.tipo = tipo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public persona getCliente() {
        return cliente;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void actualizarSaldo(){
        if (tipo == 'a'){
            double interes = getSaldo() * (INTERES_FIJO / 100);
            ingresar(interes);
        }
    }

    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }
}
