// Clase para representar un nodo en un árbol binario
class TreeNode<E> {
    E data;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Clase para representar un árbol binario de búsqueda
class BinaryTree {
    private TreeNode<Association> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(Association data) {
        root = insertRec(root, data);
    }

    private TreeNode<Association> insertRec(TreeNode<Association> root, Association data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return root;
        }

        if (data.getKey().compareTo(root.data.getKey()) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.getKey().compareTo(root.data.getKey()) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public String search(String data) {
        return searchRec(root, data);
    }

    private String searchRec(TreeNode<Association> root, String data) {
        if (root == null || root.data.getKey().equals(data)) {
            return (root != null) ? root.data.getValue() : null;
        }

        if (data.compareTo(root.data.getKey()) < 0) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }
}
