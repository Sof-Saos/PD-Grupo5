package JuegoPrototype;

public interface Unidad extends Cloneable {
    void mostrarDescripcion();
    void atacar();
    void defender ();
    Unidad clone ();


}
