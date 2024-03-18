import java.util.*;

class BinaryTree<E extends Comparable<E>> {
    private static class Node<E> {
        E data;
        Node<E> left;
        Node<E> right;

        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(E data) {
        root = insertRec(root, data);
    }

    private Node<E> insertRec(Node<E> root, E data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(Node<E> root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.right);
        }
    }
}

class Dictionary {
    private BinaryTree<String> tree;

    public Dictionary() {
        tree = new BinaryTree<>();
    }

    public void buildDictionary(List<String> associations) {
        for (String association : associations) {
            String[] parts = association.split(",");
            String word = parts[0].trim().toLowerCase();
            String translation = parts[1].trim().toLowerCase();
            tree.insert("(" + word + ", " + translation + ")");
        }
    }

    public String translate(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String translation = findTranslation(cleanedWord);
            if (translation.isEmpty()) {
                result.append("*").append(word).append("* ");
            } else {
                result.append(translation).append(" ");
            }
        }
        return result.toString();
    }

    private String findTranslation(String word) {
        // TODO: de búsqueda en el árbol binario hacer después :)
        return "";
    }
}
