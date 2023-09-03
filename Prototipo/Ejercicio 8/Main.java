package JuegoPrototype;
public class Main {
    public static void Main (String[] args) {

        Unidad soldadoOriginal = new Soldado();
        Unidad arqueroOriginal = new Arquero();

        Unidad soldadoClonado = soldadoOriginal.clone();
        ((Soldado) soldadoClonado).modificarAtaque(12);

        Unidad arqueroClonado = arqueroOriginal.clone();
        ((Arquero) arqueroClonado).modificarDefensa(5);

        System.out.println("Unidad original - Soldado:");
        soldadoOriginal.mostrarDescripcion();
        System.out.println("Unidad clonada - Soldado:");
        soldadoClonado.mostrarDescripcion();

        System.out.println("\nUnidad original - Arquero:");
        arqueroOriginal.mostrarDescripcion();
        System.out.println("Unidad clonada - Arquero:");
        arqueroClonado.mostrarDescripcion();


    }
}
