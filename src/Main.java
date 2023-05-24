public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(20);
        tree.addNode(2);
        tree.addNode(25);
        tree.addNode(37);
        tree.addNode(16);

        System.out.println("In-Order: ");
        tree.inOrder(tree.getRoot());
        System.out.println("Pre-Order: ");
        tree.preOrder(tree.getRoot());
        System.out.println("Post-Order: ");
        tree.postOrder(tree.getRoot());
    }
}
