public class FabricaPersonajes {
    public Personaje crearPersonaje(String tipo, String nombre, int nivel) {
        switch (tipo) {
            case "Guerrero":
                return new Guerrero(nombre, nivel);
            case "Mago":
                return new Mago(nombre, nivel);
            case "Arquero":
                return new Arquero(nombre, nivel);
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
    }
}
