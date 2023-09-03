package DocumentoPrototype;

public class DocumentoTexto extends Documento{

    public DocumentoTexto(String contenido, String formato) {
        super(contenido, formato);

    }

    @Override
    public Documento clone() {
        return new DocumentoTexto(this.contenido, this.formato);
    }
}
