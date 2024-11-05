public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50, "a");
        tree.insert(30, "b");
        tree.insert(20, "c");
        tree.insert(40, "d");
        tree.insert(70, "e");
        tree.insert(60, "f");
        System.out.println(tree.search(50));
    }
}