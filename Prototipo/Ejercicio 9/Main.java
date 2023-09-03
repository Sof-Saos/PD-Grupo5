package BancoPrototype;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaAhorro = new CuentaAhorro(1, 1500, "Juancho", 3);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(2, 2000, "Fernando", 5);


        cuentaAhorro.calcularInteresesOComision();
        cuentaCorriente.calcularInteresesOComision();

        cuentaAhorro.mostrarInformacion();
        cuentaCorriente.mostrarInformacion();




    }
}
