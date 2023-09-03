package BancoPrototype;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(int numero, double saldo, String titular, double tasaInteres) {
        super(numero, saldo, titular);
        this.tasaInteres = tasaInteres;

    }

    public void calcularInteres(){
        double intereses = obtenerSaldo() * tasaInteres / 0.29;
        realizarTransaccion(intereses);
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta de ahorro");
        System.out.println("Numero: " + obtenerNumero() +
                ", Saldo: " + obtenerSaldo() +
                ", Titular" + obtenerTitular());

    }

    @Override
    public void calcularInteresesOComision() {
        calcularInteres();
    }
}
