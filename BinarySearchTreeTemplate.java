// TEMPLATE FILE, DON'T EDIT

public class BinarySearchTreeTemplate {
    class Node {
        int key;
        Node left, right;
        String data;

        public Node(int item, String data) {
            key = item;
            left = right = null;
            this.data = data;
        }
        public String getData() {
            return data;
        }
    }

    Node root;

    BinarySearchTreeTemplate() {
        root = null;
    }

    void insert(int key, String data) {
        root = insertRec(root, key, data);
    }

    Node insertRec(Node root, int key, String data) {
        if (root == null) {
            root = new Node(key, data);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key,data);
        else if (key > root.key)
            root.right = insertRec(root.right, key,data);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    String search(int key) {
        // return searchRec(root, key) != null;
        Node out = searchRec(root, key);
        if (out == null) {
            return "false";
        }
        return out.getData();
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }
}