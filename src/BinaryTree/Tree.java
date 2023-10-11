package BinaryTree;

public class Tree {

    private int size;

    private Node node;

    public Tree( Node node) {
        this.node = node;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}
