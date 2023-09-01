public class Mago extends Personaje {
    Habilidad habilidad;

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
        habilidad = new LanzarHechizo();
    }
}
