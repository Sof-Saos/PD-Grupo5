import java.util.Scanner;
public class Ensalada implements Comida {
    public static Scanner sc = new Scanner(System.in);
    private int tamano;
    private double adicion;
    public Ensalada(int tamano) {
        this.tamano = tamano;
        this.adicion = 0.0;
    }
    @Override
    public void mostrarDescripcion() {
        switch (tamano) {
            case 1:
                System.out.println("\033[0;1m" + "\uD83E\uDD57 Ensalada Pequeña" + "\u001B[0m");
                System.out.println("Por solo: 8.000 COP");
                System.out.println("Disfruta de una ensalada fresca y saludable, perfecta para una comida ligera.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Lechuga fresca");
                System.out.println("- Tomate cherry");
                System.out.println("- Pepino");
                System.out.println("- Zanahoria rallada");
                System.out.println("- Aderezo de tu elección");
                break;
            case 2:
                System.out.println("\033[0;1m" + " \uD83E\uDD57 Ensalada Mediana" + "\u001B[0m");
                System.out.println("Por solo: 16.000 COP ");
                System.out.println("Nuestra ensalada mediana es perfecta para compartir o como plato principal.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Lechuga fresca");
                System.out.println("- Tomate cherry");
                System.out.println("- Pepino");
                System.out.println("- Zanahoria rallada");
                System.out.println("- Aceitunas negras");
                System.out.println("- Queso feta");
                System.out.println("- Aderezo de tu elección");
                break;
            case 3:
                System.out.println("\033[0;1m" + "\uD83E\uDD57 Ensalada Grande" + "\u001B[0m");
                System.out.println("Por solo: 37.000 COP");
                System.out.println("Nuestra ensalada grande es ideal para una comida abundante y satisfactoria.");
                System.out.println("Ingredientes disponibles:");
                System.out.println("- Lechuga fresca");
                System.out.println("- Tomate cherry");
                System.out.println("- Pepino");
                System.out.println("- Zanahoria rallada");
                System.out.println("- Aceitunas negras");
                System.out.println("- Queso feta");
                System.out.println("- Pechuga de pollo a la parrilla");
                System.out.println("- Croutones de pan");
                System.out.println("- Aderezo de tu elección");
                break;
        }
        System.out.println();
    }
    @Override
    public double calcularPrecio() {
        double preciofinal = 0.0;
        switch (tamano) {
            case 1:
                preciofinal = (8000) + adicion;
                break;
            case 2:
                preciofinal = (16000) + adicion;
                break;
            case 3:
                preciofinal = (37000) + adicion;
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
        System.out.println("1. Tomate    | 2.000 COP");
        System.out.println("2. Cebolla   | 2.500 COP");
        System.out.println("3. Aguacate  | 1.000 COP");
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
