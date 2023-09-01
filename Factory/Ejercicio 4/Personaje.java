public class Personaje {
    private String nombre;
    private int nivel;
    private Habilidad habilidad;

    public Personaje(String nombre, int nivel, Habilidad habilidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.habilidad = habilidad;
    }

    public void presentarse() {
        System.out.println( "\u001B[35m" + "Soy " + nombre + "!");
        System.out.println("Y con mi nivel " + nivel + " te castigaré en nombre de la justicia!" + "\u001B[0m");
    }
    public void usarHabilidad() {
        habilidad.lanzarAtaque();
    }
}
