package BancoPrototype;

public class CuentaCorriente extends CuentaBancaria {
    private double comision;

    public CuentaCorriente(int numero, double saldo, String titular, double comision) {
        super(numero, saldo, titular);
        this.comision = comision;

    }

    public void cobrarcomision(){
        realizarTransaccion(-comision);

    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta corriente;");
        System.out.println("Numero: "+obtenerNumero() +
                ", Saldo: " +obtenerSaldo()+
                ", Titular: " +obtenerTitular());

    }

    @Override
    public void calcularInteresesOComision() {
        cobrarcomision();
    }
}
