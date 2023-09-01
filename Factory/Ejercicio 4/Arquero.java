public class Arquero extends Personaje {
     Habilidad habilidad;

    public Arquero(String nombre, int nivel) {
        super(nombre, nivel);
        habilidad = new DispararFlecha();
    }
}
