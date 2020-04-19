package com.datastructure.training.random;

public class CheckBST {
    private Node root;
    class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value) {
            this.value = value;
        }
    }

    public boolean checkBst(){
        return checkBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean checkBst(Node root,int min,int max){
        if (root==null) return true;
        if (root.value<min||root.value>max){
            return false;
        }
        return checkBst(root.leftChild,min,root.value)&&checkBst(root.rightChild,root.value,max);
    }
}
