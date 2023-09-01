public class Main {
    public static void main(String[] args) {
        FabricaComidas fabricaComidas = new FabricaComidas();

        Comida burger = fabricaComidas.crearComidas("Hamburguesa");
        burger.mostrarDescripcion();
        burger.calcularPrecio();
        burger.agregarIngrediente();
        burger.calcularPrecio();
        burger.confirmarPedido();
        burger.cancelarPedido();


        System.out.println();
        Comida pizza = fabricaComidas.crearComidas("Pizza");
        pizza.mostrarDescripcion();
        pizza.agregarIngrediente();
        pizza.calcularPrecio();
        pizza.confirmarPedido();

        System.out.println();
        Comida ensalada = fabricaComidas.crearComidas("Ensalada");
        ensalada.mostrarDescripcion();
        ensalada.calcularPrecio();
        ensalada.confirmarPedido();

        System.out.println();
        Comida perrito = fabricaComidas.crearComidas("Perrito");
        perrito.mostrarDescripcion();
        perrito.agregarIngrediente();
        perrito.calcularPrecio();
        perrito.cancelarPedido();
        }
    }

