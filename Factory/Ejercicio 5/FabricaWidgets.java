public class FabricaWidgets {
    public Widget crearWidget(String tipo) {
        switch (tipo) {
            case "Boton":
                return new Boton();
            case "Campo de texto":
                return new CampoTexto();
            case "Panel":
                return new Panel();
            default:
                throw new IllegalArgumentException("Tipo de widget no válido: " + tipo);
        }
    }
}
