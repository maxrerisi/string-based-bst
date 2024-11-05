// TEMPLATE FILE, DON'T EDIT

public class BinarySearchTreeInt {
    class Node {
        int key;
        Node left, right;
        int data;

        public Node(int item, int data) {
            key = item;
            left = right = null;
            this.data = data;
        }
        public int getData() {
            return data;
        }
    }

    Node root;

    BinarySearchTreeInt() {
        root = null;
    }

    void insert(int key, int data) {
        root = insertRec(root, key, data);
    }

    Node insertRec(Node root, int key, int data) {
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

    int search(int key) {
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
