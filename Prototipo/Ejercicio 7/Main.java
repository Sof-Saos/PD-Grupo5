package DocumentoPrototype;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de documentos
        DocumentoTexto juanDocumentoTexto = new DocumentoTexto("Número de Juan: 12345", "Texto");
        DocumentoTexto cristianDocumentoTexto = new DocumentoTexto("Número de Cristian: 67890", "Texto");
        DocumentoImagen camilaDocumentoImagen = new DocumentoImagen("Imagen de Camila", "JPG");
        DocumentoImagen mariaDocumentoImagen = new DocumentoImagen("Imagen de Maria", "PNG");

        // Clonar y mostrar documentos
        Documento clonedJuanTexto = juanDocumentoTexto.clone();
        Documento clonedCristianTexto = cristianDocumentoTexto.clone();
        Documento clonedCamilaImagen = camilaDocumentoImagen.clone();
        Documento clonedMariaImagen = mariaDocumentoImagen.clone();

        clonedJuanTexto.mostrarContenido();
        clonedJuanTexto.obtenerFormato();

        clonedCristianTexto.mostrarContenido();
        clonedCristianTexto.obtenerFormato();

        clonedCamilaImagen.mostrarContenido();
        clonedCamilaImagen.obtenerFormato();

        clonedMariaImagen.mostrarContenido();
        clonedMariaImagen.obtenerFormato();

    }
}
