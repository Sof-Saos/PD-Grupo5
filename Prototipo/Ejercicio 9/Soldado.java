package JuegoPrototype;

public class Soldado implements Unidad {
    private int ataque;
    private int defensa;

    public Soldado () {
        ataque = 10;
        defensa = 5;

    }
    @Override
    public void mostrarDescripcion() {
        System.out.println("Soldado con ataque de " + ataque + "y una defensa de " + defensa );
    }

    @Override
    public void atacar() {
        System.out.println("El soldado esta atacando");

    }

    @Override
    public void defender() {
        System.out.println("El soldado se esta defendiendo");

    }

    public void modificarAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void modificarDefensa(int nuevaDefensa) {
        this.defensa = nuevaDefensa;
    }

    @Override
    public Unidad clone() {
        Soldado soldadoClonado = new Soldado();
        soldadoClonado.modificarAtaque(this.ataque);
        soldadoClonado.modificarDefensa(this.defensa);
        return soldadoClonado;
    }


}
