public class Main {
    public static void main(String[] args) {
        FabricaWidgets fabricaWidgets = new FabricaWidgets();

        Widget boton = fabricaWidgets.crearWidget("Boton");
        boton.dibujar();
        boton.clic();

        System.out.println();
        Widget campoDeTexto = fabricaWidgets.crearWidget("Campo de texto");
        campoDeTexto.dibujar();
        campoDeTexto.clic();
        campoDeTexto.hover();

        System.out.println();
        Widget panel = fabricaWidgets.crearWidget("Panel");
        panel.dibujar();
        panel.hover();
        panel.clic();

        System.out.println(); //La siguiente prueba arrojará una exception
        Widget nofuncional = fabricaWidgets.crearWidget("Tamagotchi"); //Este no debe de funcionar dado que no es un tipo contemplado en el switch
        nofuncional.dibujar();
        nofuncional.clic();
        nofuncional.hover();
    }
}
