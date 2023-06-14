package Memento;

public class DocumentoEstadoAprovado implements DocumentoEstado {
    private static DocumentoEstadoAprovado instance = new DocumentoEstadoAprovado();

    private DocumentoEstadoAprovado() {
    }

    public static DocumentoEstadoAprovado getInstance() {
        return instance;
    }

    public String getDescricaoEstado() {
        return "Aprovado";
    }
}