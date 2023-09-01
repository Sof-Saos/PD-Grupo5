public class Panel implements Widget{
    @Override
    public void dibujar() {
        System.out.println("\u001B[36m" + "Dibujando un panel.");
    }

    @Override
    public void clic() {
        System.out.println("\u001B[36m" + "Panel clickeado.");
    }

    @Override
    public void hover() {
        System.out.println("\u001B[36m" + "Pasando el cursor por el panel.");
    }
}
