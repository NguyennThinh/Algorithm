package BinaryTree;

public class MainClass {
    public static void main(String[] args) {
        Tree binaryTree = new Tree();

        binaryTree.insert(new Node(new Student(5, "Thinh", 19)));
        binaryTree.insert(new Node(new Student(10, "Linh", 19)));
        binaryTree.insert(new Node(new Student(4, "Nguyễn", 16)));
        binaryTree.insert(new Node(new Student(8, "Hà", 20)));






      //  System.out.println(binaryTree.search(10).getData().getFullName());;


        binaryTree.delete(4);
        binaryTree.printPreOrder();

    }
}
