import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Clase principal que realiza la traducción de oraciones de inglés a español utilizando un árbol binario.
 */
public class Main {
    /**
     * Método principal que construye el árbol de búsqueda a partir de un archivo de asociaciones,
     * traduce una oración en inglés y la imprime en español.
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Construir el árbol binario de búsqueda a partir del archivo de asociaciones
        BinaryTree dictionaryTree = buildDictionaryTree("diccionario.txt");

        // Oración en inglés a traducir
        String englishSentence = "Enter your English sentence here.";

        // Traducir la oración
        String spanishSentence = translateSentence(dictionaryTree, englishSentence);

        // Imprimir la oración traducida
        System.out.println("Spanish Translation: " + spanishSentence);
    }

    /**
     * Método para construir un árbol binario de búsqueda a partir de un archivo de asociaciones.
     * @param filename Nombre del archivo que contiene las asociaciones.
     * @return El árbol binario de búsqueda construido.
     */
    private static BinaryTree buildDictionaryTree(String filename) {
        BinaryTree dictionaryTree = new BinaryTree();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea en palabras en inglés y español
                String[] parts = line.split(",");
                String englishWord = parts[0].trim();
                String spanishWord = parts[1].trim();

                // Crear una nueva asociación y agregarla al árbol binario
                Association association = new Association(englishWord.toLowerCase(Locale.ROOT), spanishWord);
                dictionaryTree.insert(association);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dictionaryTree;
    }

    /**
     * Método para traducir una oración de inglés a español utilizando el árbol binario de búsqueda.
     * @param dictionaryTree El árbol binario de búsqueda que contiene las asociaciones de palabras.
     * @param englishSentence La oración en inglés que se va a traducir.
     * @return La oración traducida en español.
     */
    private static String translateSentence(BinaryTree dictionaryTree, String englishSentence) {
        StringBuilder translatedSentence = new StringBuilder();

        // Dividir la oración en palabras
        String[] words = englishSentence.split("\\s+");

        // Traducir cada palabra
        for (String word : words) {
            // Buscar la palabra en el árbol binario
            String translation = dictionaryTree.search(word.toLowerCase(Locale.ROOT));

            // Si se encuentra la traducción, agregarla al resultado, de lo contrario, agregar la palabra original
            if (translation != null) {
                translatedSentence.append(translation).append(" ");
            } else {
                translatedSentence.append(word).append(" ");
            }
        }

        return translatedSentence.toString().trim();
    }
}
