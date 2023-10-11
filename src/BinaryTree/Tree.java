package BinaryTree;

public class Tree {

    private int size;

    private Node root;

    public Tree() {
    }

    public Tree(Node root) {
        this.size = 0;
        this.root = root;
    }


    public void insert(Node node){
        this.root = insertNode(this.root,node);

    }
    private  Node insertNode(Node oldRoot,Node newNode){
        if (oldRoot == null){
            this.size++;
            return  newNode;

        }
        if (newNode.lessOrEqual(oldRoot.getData().getId())){

            oldRoot.setLeft(insertNode(oldRoot.getLeft(),newNode));

        }else {

            oldRoot.setRight(insertNode(oldRoot.getRight(),newNode));
        }
        return  oldRoot;
    }


    public Node search(int dataId){


        return searchNode(this.root, dataId);
    }

    private Node searchNode(Node root, int dataId) {

        if (root == null){
            return null;
        }
        if (root.hasData(dataId)){
            return root;
        }

        if (root.lessOrEqual(dataId)){
            root = searchNode(root.getRight(), dataId);
        }else {
            root = searchNode(root.getLeft(), dataId);

        }
return root;
    }


    public void delete(int dataId){

        this.root = deleteNode(this.root, dataId);
    }

    private Node deleteNode(Node root, int dataId) {

        if (root == null){
            return null;
        }
        if (root.hasData(dataId)){
            this.size--;

            if (root.getLeft() ==null){
                return root.getRight();
            }
            Node maxLeft = root.getLeft();
            Node preMax =null;

            while (maxLeft.getRight() != null){
                //root = 10
                preMax = maxLeft;//7
                maxLeft = maxLeft.getRight();//8
            }

            maxLeft.setRight(root.getRight());
            maxLeft.setLeft(preMax);
            if (maxLeft.getLeft() == null){

                preMax.setRight(null);
            }else {
                maxLeft.setLeft(preMax);
            }


            return maxLeft;



        }

        if (root.lessOrEqual(dataId)){
            root .setRight(deleteNode(root.getRight(), dataId));
        }else {
            root.setLeft( deleteNode(root.getLeft(), dataId));
        }

        return root;
    }

    public void printPreOrder(){
            printPreOrder(this.root);
    }

    private void printPreOrder(Node node){

        if (node ==null){
            return;
        }


        printPreOrder(node.getLeft());
        node.printData();
        printPreOrder(node.getRight());
    }
}
