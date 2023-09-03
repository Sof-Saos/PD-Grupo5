package JuegoPrototype;

public class Arquero implements Unidad {
    private int ataque;
    private int defensa;

    public Arquero() {
        ataque = 8;
        defensa = 3;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Arquero con de ataque " + ataque + " y una defensa de " + defensa);
    }

    @Override
    public void atacar() {
        System.out.println("El arquero esta atacado");
    }

    @Override
    public void defender() {
        System.out.println("El arquero se esta defiende");
    }

    @Override
    public Unidad clone() {
        Arquero arqueroClonado = new Arquero();
        arqueroClonado.modificarAtaque(this.ataque);
        arqueroClonado.modificarDefensa(this.defensa);
        return arqueroClonado;
    }

    public void modificarAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void modificarDefensa(int nuevaDefensa) {
        this.defensa = nuevaDefensa;
    }
}
