package Memento;

public class DocumentoEstadoEditado implements DocumentoEstado {
    private static DocumentoEstadoEditado instance = new DocumentoEstadoEditado();

    private DocumentoEstadoEditado() {
    }

    public static DocumentoEstadoEditado getInstance() {
        return instance;
    }

    public String getDescricaoEstado() {
        return "Editado";
    }
}
