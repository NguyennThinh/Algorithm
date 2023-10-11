package BinaryTree;

public class Node {
    private Student data;

    private Node left;

    private Node right;

    public Node() {
    }

    public Node(Student data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
