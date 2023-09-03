package BancoPrototype;

public abstract class CuentaBancaria implements Cloneable {
    private int numero;
    private double saldo;
    private String titular;

    public CuentaBancaria (int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;

    }

    public int obtenerNumero(){
        return numero;
    }

    public double obtenerSaldo (){
        return saldo;
    }

    public String obtenerTitular(){
        return titular;
    }

    public void realizarTransaccion (double monto){
        saldo += monto;
    }


    @Override
    protected CuentaBancaria clone() throws CloneNotSupportedException {
        return (CuentaBancaria) super.clone();
    }

    public abstract void mostrarInformacion();
    public abstract void calcularInteresesOComision();
}

