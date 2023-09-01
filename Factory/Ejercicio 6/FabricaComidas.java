import java.util.Scanner;
public class FabricaComidas {
    public static Scanner sc = new Scanner(System.in);

    int opcionHamburguesa;
    int opcionPizza;
    int opcionEnsalada;
    int opcionPerrito;


    public Comida crearComidas(String tipo) {
        switch (tipo) {
            case "Hamburguesa":
                System.out.println("1. Hamburguesa mini (niños) | 4.000 COP ");
                System.out.println("2. Hamburguesa clásica | 6.000 COP ");
                System.out.println("3. Hamburguesa Heisenberg | 8.000 COP ");
                System.out.println("4. Hamburguesa " + "\u001B[31m"+ " rompe arterias" + "\u001B[0m" + " | 10.000 COP ");
                System.out.print("Seleccione una opción: ");
                opcionHamburguesa = sc.nextInt();
                System.out.println();
                return new Hamburguesa(opcionHamburguesa);
            case "Pizza":
                System.out.println("1. Pizza pequeña | 14.000 COP");
                System.out.println("2. Pizza Mediana | 26.000 COP ");
                System.out.println("3. Pizza Grande  | 40.000 COP ");
                System.out.print("Seleccione una opción: ");
                opcionPizza = sc.nextInt();
                System.out.println();
                return new Pizza(opcionPizza);
            case "Ensalada":
                System.out.println("1. Ensalada pequeña | 8.000 COP");
                System.out.println("2. Ensalada Mediana | 16.000 COP ");
                System.out.println("3. Ensalada Grande  | 37.000 COP ");
                System.out.print("Seleccione una opción: ");
                opcionEnsalada = sc.nextInt();
                System.out.println();
                return new Ensalada(opcionEnsalada);
            case "Perrito":
                System.out.println("1. Perro pequeño | 4.000 COP");
                System.out.println("2. Perro normal  | 10.000 COP ");
                System.out.println("3. Perro Grande  | 17.000 COP ");
                System.out.print("Seleccione una opción: ");
                opcionPerrito = sc.nextInt();
                System.out.println();
                return new Perrito(opcionPerrito);
            default:
                throw new IllegalArgumentException("Tipo de comida no válido: " + tipo);
        }
    }

}
