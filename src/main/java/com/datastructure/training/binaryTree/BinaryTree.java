package com.datastructure.training.binaryTree;

public class BinaryTree {
    private Node root;
    private class Node{
        private int value;
        private Node leftNext;
        private Node rightNext;
        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node"+value;
        }

        public int getValue() {
            return value;
        }
    }
    public void insert(int number){
        Node node = new Node(number);
        Node node1= root;
        if (root==null) {
            root=node;
            return;
        }
        while(node1!=null){
            if (number>node1.value){
                if (node1.rightNext==null) {
                    node1.rightNext=node;
                    return;
                }
                node1=node1.rightNext;
            }
            if (number<node1.value){
                if (node1.leftNext==null) {
                    node1.leftNext=node;
                    return;
                }
                node1=node1.leftNext;
            }
        }
    }
    public boolean find(int number){
        Node node1=root;
        while(node1!=null){
            if (number>node1.value){
                node1=node1.rightNext;
            }else if (number<node1.value){
                node1=node1.leftNext;
            }else return true;
        }return false;
    }
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        if (root==null) return;
        System.out.println(root.value);
        traversePreOrder(root.leftNext);
        traversePreOrder(root.rightNext);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if (root==null) return;
        traverseInOrder(root.leftNext);
        System.out.println(root.value);
        traverseInOrder(root.rightNext);
    }
    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if (root==null) return;
        traversePostOrder(root.leftNext);
        traversePostOrder(root.rightNext);
        System.out.println(root.value);
    }
//    private boolean isLeaf(Node node){
//        if (node.leftNext==null){
//            if (node.rightNext==null) {
//                return true;
//            } return false;
//        }return false;
//    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
//        if (isLeaf(root)) return 0;
        if (root==null) return 0;
        return 1 + Math.max(height(root.rightNext),height(root.leftNext));
    }
    //if the binary tree is a bst than recursion to the leftest node.
    public int min(){
        return min(root);
    }

    private int min(Node root){
        if (root==null) throw new IllegalStateException();
        int left = min(root.leftNext);
        int right = min(root.rightNext);
        return Math.min(Math.min(left,right),root.value);
    }

    public boolean equals(BinaryTree binaryTree){
        return equals(root,binaryTree.root);

    }
    private boolean equals(Node first,Node second){
        if (first==null&&second==null){
            return true;
        }else if (first!=null && second !=null){
            return (first.value==second.value) && equals(first.leftNext,second.leftNext)
                    &&equals(first.rightNext,second.rightNext);
        }return false;
    }

}
