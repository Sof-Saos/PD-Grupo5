import java.util.Scanner;
public class Perrito implements Comida {
    public static Scanner sc = new Scanner(System.in);
    private int tamano;
    private double adicion;
    public Perrito(int tamano){
        this.tamano = tamano;
        this.adicion = 0.0;
    }

    @Override
    public void mostrarDescripcion() {
        switch (tamano) {
            case 1:
                System.out.println("\033[0;1m" + "\uD83C\uDF2D Perro Pequeño" + "\u001B[0m");
                System.out.println("Por solo: 4.000 COP");
                System.out.println("Disfruta de un delicioso perro caliente en tamaño pequeño, ideal para un snack rápido.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Salchicha");
                System.out.println("- Pan de hot dog pequeño");
                System.out.println("- Ketchup");
                System.out.println("- Mostaza");
                System.out.println("- Cebolla picada");
                break;
            case 2:
                System.out.println("\033[0;1m" + "\uD83C\uDF2D Perro Normal" + "\u001B[0m");
                System.out.println("Por solo: 10.000 COP ");
                System.out.println("Nuestro perro caliente normal es perfecto para satisfacer tu apetito.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Salchicha");
                System.out.println("- Pan de hot dog normal");
                System.out.println("- Ketchup");
                System.out.println("- Mostaza");
                System.out.println("- Cebolla picada");
                System.out.println("- Pepinillos");
                break;
            case 3:
                System.out.println("\033[0;1m" + "\uD83C\uDF2D Perro Grande" + "\u001B[0m");
                System.out.println("Por solo: 17.000 COP");
                System.out.println("Nuestro perro caliente grande es una deliciosa comida completa.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Salchicha extra grande");
                System.out.println("- Pan de hot dog grande");
                System.out.println("- Ketchup");
                System.out.println("- Mostaza");
                System.out.println("- Cebolla picada");
                System.out.println("- Pepinillos");
                System.out.println("- Tomate en rodajas");
                System.out.println("- Queso derretido");
                break;
        }
        System.out.println();
    }


    @Override
    public double calcularPrecio() {
        double preciofinal = 0.0;
        switch (tamano) {
            case 1:
                preciofinal = (4000) + adicion;
                break;
            case 2:
                preciofinal = (10000) + adicion;
                break;
            case 3:
                preciofinal = (17000) + adicion;
                break;
        }
        System.out.println("El precio de su perro caliente es: " + preciofinal);
        System.out.println();
        return preciofinal;
    }

    @Override
    public void agregarIngrediente() {
        double adicionI = 0.0;
        System.out.println("Qué ingrediente desea adicionar?");
        System.out.println("1. Ripio de papas    | 1.000 COP");
        System.out.println("2. Cebolla           | 2.500 COP");
        System.out.println("3. Guasacaca         | 5.000 COP");
        System.out.println("4. Cancelar");
        System.out.print("Seleccione una opción: ");
        int ingrediente = sc.nextInt();

        switch (ingrediente) {
            case 1:
                adicionI = 1000;
                break;
            case 2:
                adicionI = 2500;
                break;
            case 3:
                adicionI = 5000;
                break;
            case 4:
                adicionI = 0.0;
                break;
        }

        adicion += adicionI;
    }


    @Override
    public boolean confirmarPedido() {
        System.out.println("¿Desea confirmar su pedido? (S/N)");
        String respuesta = sc.next().toUpperCase();

        if (respuesta.equals("S")) {
            System.out.println("Pedido confirmado exitosamente.");
            return true;
        } else {
            System.out.println("Pedido no confirmado.");
            return false;
        }
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido cancelado.");
    }
}
