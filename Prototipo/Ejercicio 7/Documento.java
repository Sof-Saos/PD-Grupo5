package DocumentoPrototype;

public abstract class Documento implements Cloneable {

    String contenido;
    String formato;

    public Documento(String contenido, String formato) {
        this.contenido = contenido;
        this.formato = formato;
    }

    public abstract Documento clone();

    public void mostrarContenido() {
        System.out.println("Contenido: " + contenido);
    }

    public void obtenerFormato() {
        System.out.println("Formato: " + formato);
    }
}


