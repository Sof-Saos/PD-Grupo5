public class Boton implements Widget {
    @Override
    public void dibujar() {
        System.out.println("\u001B[33m" + "Dibujando un botón.");
    }

    @Override
    public void clic() {
        System.out.println("\u001B[33m" + "Botón clickeado.");
    }

    @Override
    public void hover() {
        System.out.println("\u001B[33m" + "Pasando el cursor por el botón.");
    }
}
