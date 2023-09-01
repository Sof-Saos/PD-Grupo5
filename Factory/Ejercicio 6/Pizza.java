import java.util.Scanner;
public class Pizza implements Comida {
    public static Scanner sc = new Scanner(System.in);
    private int tamano;
    private double adicion;

    public Pizza(int tamano){
        this.tamano = tamano;
        this.adicion = 0.0;
    }

    @Override
    public void mostrarDescripcion() {
        switch (tamano) {
            case 1:
                System.out.println("\033[0;1m" +  " \uD83C\uDF55 Pizza Personal/Pequeña" + "\u001B[0m");
                System.out.println("Por solo: 14.000 COP");
                System.out.println("Disfruta de una pizza personal perfecta para ti. Deliciosa y llena de sabor.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Queso mozzarella");
                System.out.println("- Salsa de tomate");
                System.out.println("- Pepperoni");
                System.out.println("- Champiñones");
                System.out.println("- Jamón");
                break;
            case 2:
                System.out.println("\033[0;1m" + "\uD83C\uDF55 Pizza Mediana" + "\u001B[0m");
                System.out.println("Por solo: 26.000 COP ");
                System.out.println("Nuestra pizza mediana es perfecta para compartir con amigos o familiares. Elige tus ingredientes favoritos.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Queso mozzarella");
                System.out.println("- Salsa de tomate");
                System.out.println("- Pepperoni");
                System.out.println("- Champiñones");
                System.out.println("- Jamón");
                System.out.println("- Pimientos");
                System.out.println("- Cebolla");
                break;
            case 3:
                System.out.println("\033[0;1m" + "\uD83C\uDF55 Pizza Familiar/Grande" + "\u001B[0m");
                System.out.println("Por solo: 40.000 COP");
                System.out.println("La pizza familiar es ideal para grandes reuniones. Personaliza tu pizza con tus ingredientes favoritos.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Queso mozzarella");
                System.out.println("- Salsa de tomate");
                System.out.println("- Pepperoni");
                System.out.println("- Champiñones");
                System.out.println("- Jamón");
                System.out.println("- Pimientos");
                System.out.println("- Cebolla");
                System.out.println("- Aceitunas");
                System.out.println("- Anchoas");
                break;
        }
        System.out.println();
    }

    @Override
    public double calcularPrecio() {
        double preciofinal = 0.0;
        switch (tamano) {
            case 1:
                preciofinal = (14000) + adicion;
                break;
            case 2:
                preciofinal = (26000) + adicion;
                break;
            case 3:
                preciofinal = (40000) + adicion;
                break;
        }
        System.out.println("El precio de su pizza es: " + preciofinal);
        System.out.println();
        return preciofinal;
    }

    @Override
    public void agregarIngrediente() {
        double adicionI = 0.0;
        System.out.println("Qué ingrediente desea adicionar?");
        System.out.println("1. Bacon            | 4.000 COP");
        System.out.println("2. Queso            | 2.500 COP");
        System.out.println("3. Pollo desmechado | 3.000 COP");
        System.out.println("4. Aceitunas        | 4.000 COP");
        System.out.println("5. Cancelar");
        System.out.print("Seleccione una opción: ");
        int ingrediente = sc.nextInt();

        switch (ingrediente) {
            case 1:
                adicionI = 4000;
                break;
            case 2:
                adicionI = 2500;
                break;
            case 3:
                adicionI = 3000;
                break;
            case 4:
                adicionI = 4000;
                break;
            case 5:
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
