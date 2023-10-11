package BinaryTree;

public class Node {
    private Student data;

    private Node left;

    private Node right;

    public Node() {
    }

    public Node(Student data) {
        this.data = data;
        this.left = null;
        this.right = null;
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

    public boolean lessOrEqual(int dataId){

        return this.data.getId() <= dataId;
    }

    public boolean hasData(int dataId){
        return this.data.getId() == dataId;
    }
    public void printData(){
        this.data.printInfo();
    }
}
