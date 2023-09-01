public class FabricaPersonajes {
    public Personaje crearPersonaje(String tipo, String nombre, int nivel) {
        Habilidad habilidad = null;
        switch (tipo) {
            case "Guerrero":
                habilidad = new AtaqueEspada();
                break;
            case "Mago":
                habilidad = new LanzarHechizo();
                break;
            case "Arquero":
                habilidad = new DispararFlecha();
                break;
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
        return new Personaje(nombre, nivel, habilidad);
    }
}
