public class Main {
    public static void main(String[] args) {
        FabricaPersonajes fabricaPersonajes = new FabricaPersonajes();

        Personaje guerrera = fabricaPersonajes.crearPersonaje("Guerrero", "Juana de Arco", 14);
        guerrera.presentarse();
        guerrera.usarHabilidad();

        System.out.println();
        Personaje brujo = fabricaPersonajes.crearPersonaje("Mago", "Merlín", 59);
        brujo.presentarse();
        brujo.usarHabilidad();

        System.out.println();
        Personaje arquero = fabricaPersonajes.crearPersonaje("Arquero", "Robin Hood", 10);
        arquero.presentarse();
        arquero.usarHabilidad();
    }
}
