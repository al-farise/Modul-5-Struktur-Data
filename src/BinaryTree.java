public class BinaryTree {
    private Node root;

    public void addNode(int data) {
        root = addNode(this.root, new Node(data));
    }

    private Node addNode(Node root, Node child) {
        if (root == null) {
            root = child;
            return root;
        }

        if (child.getData() < root.getData()) {
            root.setLeft(addNode(root.getLeft(), child));
        } else {
            root.setRight(addNode(root.getRight(), child));
        }

        return root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData() + " ");
        }
    }
}
