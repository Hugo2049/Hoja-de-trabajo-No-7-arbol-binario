import org.junit.Test;
import static org.junit.Assert.*;

public class Prueba {

    @Test
    public void testInsertAndSearch() {
        // Crear un árbol binario
        BinaryTree dictionaryTree = new BinaryTree();

        // Insertar algunas asociaciones
        dictionaryTree.insert(new Association("apple", "manzana"));
        dictionaryTree.insert(new Association("banana", "plátano"));
        dictionaryTree.insert(new Association("orange", "naranja"));
        dictionaryTree.insert(new Association("grape", "uva"));

        // Buscar asociaciones existentes
        assertEquals("manzana", dictionaryTree.search("apple"));
        assertEquals("plátano", dictionaryTree.search("banana"));
        assertEquals("naranja", dictionaryTree.search("orange"));
        assertEquals("uva", dictionaryTree.search("grape"));

        // Buscar una asociación inexistente
        assertNull(dictionaryTree.search("pineapple"));
    }
}

