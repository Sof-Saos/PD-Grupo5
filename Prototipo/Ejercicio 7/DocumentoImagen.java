package DocumentoPrototype;

public class DocumentoImagen extends Documento {
    public DocumentoImagen(String contenido, String formato) {
        super(contenido, formato);
    }

    @Override
    public DocumentoImagen clone() {
        return new DocumentoImagen(this.contenido, this.formato);
    }


}
