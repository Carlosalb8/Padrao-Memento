package Memento;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private DocumentoEstado estado;
    private List<DocumentoEstado> memento = new ArrayList<>();

    public Documento() {
    }

    public DocumentoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(DocumentoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice >= 0 && indice <= this.memento.size() - 1) {
            this.memento.subList(indice + 1, this.memento.size()).clear();
            this.estado = this.memento.get(indice);
        } else {
            throw new IllegalArgumentException("Índice inválido");
        }
    }

    public List<DocumentoEstado> getEstados() {
        return this.memento;
    }
}
