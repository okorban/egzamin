package it.camp.comarch.egzamin;

public class Tree {
    private Node node;

    //add
    private void addToTree(Node node, int value) {
        if(value > node.getValue() && node.getRight() == null){
            node.setRight(new Node(value));
        } else if(value < node.getValue() && node.getLeft() == null){
            node.setLeft(new Node(value));
        } else if(value > node.getValue() && node.getRight() != null){
            addToTree(node.getRight(),value);
        } else if(value < node.getValue() && node.getLeft() != null){
            addToTree(node.getLeft(), value);
        } else return;
    }

    public void add(int value){
        if(this.node == null){
            this.node = new Node(value);
        }
        addToTree(this.node, value);
    }

    //contains
    private boolean containsInTree(Node node, int value){
        if(node == null){
            return false;
        } else if(node.getValue() == value){
            return true;
        } else if(value > node.getValue()){
            return containsInTree(node.getRight(), value);
        } else return containsInTree(node.getLeft(), value);
    }

    public boolean contains(int value){
        return containsInTree(this.node, value);
    }

    //max
    private int treeMax(Node node){
        if(node == null){
            System.out.println("Tree is empty!");
        }
        if(node.getRight() == null){
            return node.getValue();
        } else return treeMax(node.getRight());
    }

    public int max(){
        return treeMax(this.node);
    }

    //min
    private int treeMin(Node node){
        if(node == null){
            System.out.println("Tree is empty!");
        }
        if(node.getLeft() == null){
            return node.getValue();
        } else return treeMin(node.getLeft());
    }

    public int min(){
        return treeMin(this.node);
    }

}