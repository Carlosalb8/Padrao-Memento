package Memento;

public class DocumentoEstadoCriado implements DocumentoEstado {
    private static DocumentoEstadoCriado instance = new DocumentoEstadoCriado();

    private DocumentoEstadoCriado() {
    }

    public static DocumentoEstadoCriado getInstance() {
        return instance;
    }

    public String getDescricaoEstado() {
        return "Criado";
    }
}

