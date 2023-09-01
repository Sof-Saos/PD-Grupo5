import java.util.Scanner;
public class Hamburguesa implements Comida {
    public static Scanner sc = new Scanner(System.in);
    private int tamano;
    private double adicion;

    public Hamburguesa(int tamano) {
        this.tamano = tamano;
        this.adicion = 0.0;
    }


    @Override
    public void mostrarDescripcion() {
        switch (tamano) {
            case 1:
                System.out.println("\033[0;1m" + "\uD83C\uDF54 Hamburgesa Mini" + "\u001B[0m");
                System.out.println("Por solo: 4.000 COP");
                System.out.println("Una deliciosa hamburguesa en tamaño mini, perfecta para los más pequeños. Con carne jugosa, queso derretido y los condimentos clásicos.");
                System.out.println("Ingredientes:");
                System.out.println("- Carne de res");
                System.out.println("- Pan de hamburguesa pequeño");
                System.out.println("- Queso americano");
                System.out.println("- Lechuga");
                System.out.println("- Tomate");
                System.out.println("- Ketchup");
                break;
            case 2:
                System.out.println("\033[0;1m" + "\uD83C\uDF54 Hamburgesa clásica" + "\u001B[0m");
                System.out.println("Por solo: 6.000 COP ");
                System.out.println("Nuestra hamburguesa clásica es un favorito atemporal. Carne jugosa, queso cheddar derretido y los ingredientes frescos que amas.");
                System.out.println("Ingredientes:");
                System.out.println("- Carne de res");
                System.out.println("- Pan de hamburguesa");
                System.out.println("- Queso cheddar");
                System.out.println("- Lechuga");
                System.out.println("- Cebolla");
                System.out.println("- Tomate");
                System.out.println("- Mayonesa");
                System.out.println("- Mostaza");
                break;
            case 3:
                System.out.println("\033[0;1m" + "\uD83C\uDF54 Hamburgesa Heisenberg " + "\u001B[0m");
                System.out.println("Por solo: 8.000 COP");
                System.out.println("Inspirada en el famoso personaje de Breaking Bad, esta hamburguesa es única. Carne sazonada, cebolla caramelizada, bacon crujiente y un toque de queso azul.");
                System.out.println("Ingredientes:");
                System.out.println("- Carne de res sazonada");
                System.out.println("- Bacon");
                System.out.println("- Pan artesanal");
                System.out.println("- Queso azul");
                System.out.println("- Cebolla caramelizada");
                System.out.println("- Tomate");
                System.out.println("- Mayonesa de ajo");
                System.out.println("- Mostaza");
                break;
            case 4:
                System.out.println("\033[0;1m" + "\uD83C\uDF54 Hamburgesa ROMPE ARTERIAS " + "\u001B[0m");
                System.out.println("Por solo: 10.0000 COP");
                System.out.println("Esta hamburguesa es para los amantes de las hamburguesas grandes. Doble carne, doble queso, bacon crujiente y un huevo frito encima, todo acompañado de lechuga fresca y tomate.");
                System.out.println("Ingredientes:");
                System.out.println("- Doble carne de res");
                System.out.println("- Bacon");
                System.out.println("- Pan artesanal");
                System.out.println("- Doble queso cheddar");
                System.out.println("- Cebolla caramelizada");
                System.out.println("- Huevo frito");
                System.out.println("- Lechuga");
                System.out.println("- Mayonesa especial");
                System.out.println("- Salsas de la casa");
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
                preciofinal = (6000) + adicion;
                break;
            case 3:
                preciofinal = (8000) + adicion;
                break;
            case 4:
                preciofinal = (10000) + adicion;
                break;
        }
        System.out.println("El precio de su hamburguesa es: " + preciofinal);
        System.out.println();
        return preciofinal;
    }


    @Override
    public void agregarIngrediente() {
        double adicionI = 0.0;
        System.out.println("Qué ingrediente desea adicionar?");
        System.out.println("1. Bacon             | 2.000 COP");
        System.out.println("2. Queso             | 2.500 COP");
        System.out.println("3. Huevo de cordoniz | 1.000 COP");
        System.out.println("4. Cancelar");
        System.out.print("Seleccione una opción: ");
        int ingrediente = sc.nextInt();

        switch (ingrediente) {
            case 1:
                adicionI = 2000;
                break;
            case 2:
                adicionI = 2500;
                break;
            case 3:
                adicionI = 1000;
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
