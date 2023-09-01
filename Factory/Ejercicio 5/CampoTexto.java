public class CampoTexto implements Widget{
    public void dibujar() {
        System.out.println("\u001B[31m" + "Dibujando un campo de texto.");
    }

    @Override
    public void clic() {
        System.out.println("\u001B[31m" + "Campo de Texto clickeado.");
    }

    @Override
    public void hover() {
        System.out.println("\u001B[31m" + "Pasando el cursor por el campo de texto.");
    }
}
