package Test;

import Memento.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DocumentoTest {

    @Test
    public void testDocumentoEstado() {
        Documento documento = new Documento();
        DocumentoEstadoCriado estadoCriado = DocumentoEstadoCriado.getInstance();
        DocumentoEstadoEditado estadoEditado = DocumentoEstadoEditado.getInstance();

        assertNull(documento.getEstado());

        documento.setEstado(estadoCriado);
        assertEquals(estadoCriado, documento.getEstado());

        documento.setEstado(estadoEditado);
        assertEquals(estadoEditado, documento.getEstado());

        documento.restauraEstado(0);
        assertEquals(estadoCriado, documento.getEstado());
    }

    @Test
    public void testDocumentoMemento() {
        // Cria um documento
        Documento documento = new Documento();

        // Define estados para o documento
        DocumentoEstadoCriado estadoCriado = DocumentoEstadoCriado.getInstance();
        DocumentoEstadoEditado estadoEditado = DocumentoEstadoEditado.getInstance();
        DocumentoEstadoAprovado estadoAprovado = DocumentoEstadoAprovado.getInstance();

        documento.setEstado(estadoCriado);
        documento.setEstado(estadoEditado);
        documento.setEstado(estadoAprovado);

        // Obtém a lista de estados do documento
        List<DocumentoEstado> estados = documento.getEstados();
        assertEquals(3, estados.size());
        assertEquals(estadoCriado, estados.get(0));
        assertEquals(estadoEditado, estados.get(1));
        assertEquals(estadoAprovado, estados.get(2));

        // Restaura um estado anterior
        documento.restauraEstado(1);
        DocumentoEstado estadoRestaurado = documento.getEstado();
        assertEquals(estadoEditado, estadoRestaurado);
    }
}



