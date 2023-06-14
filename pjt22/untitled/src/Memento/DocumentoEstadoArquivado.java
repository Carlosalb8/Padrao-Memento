package Memento;

public class DocumentoEstadoArquivado implements DocumentoEstado {
    private static DocumentoEstadoArquivado instance = new DocumentoEstadoArquivado();

    private DocumentoEstadoArquivado() {
    }

    public static DocumentoEstadoArquivado getInstance() {
        return instance;
    }

    public String getDescricaoEstado() {
        return "Arquivado";
    }
}