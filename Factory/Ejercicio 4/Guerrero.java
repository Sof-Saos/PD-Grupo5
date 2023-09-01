public class Guerrero extends Personaje{
    Habilidad habilidad;

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
        habilidad = new AtaqueEspada();
    }
}
