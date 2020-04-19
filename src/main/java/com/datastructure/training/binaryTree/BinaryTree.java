package com.datastructure.training.binaryTree;

import java.util.ArrayList;
import java.util.List;

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
        if (root==null) return Integer.MAX_VALUE;
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

    public boolean btsOrNot(){
        return btsOrNoe(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean btsOrNoe(Node root,int min, int max) {
        if (root == null) return true;
        if (root.value < min || root.value > max) return false;
        return btsOrNoe(root.leftNext, min, root.value-1)
                && btsOrNoe(root.rightNext,root.value+1,max);
    }

    public ArrayList<Integer> atKDistance(int distance){
        ArrayList<Integer> list1=new ArrayList<Integer>();
        atKDistance(root,distance,list1);
        return list1;
    }
    private void atKDistance(Node root,int distance,ArrayList<Integer> list){
        if (root==null) return;
        if (distance==0) {
            list.add(root.value);
            return;
        }
        atKDistance(root.leftNext,distance-1,list);
        atKDistance(root.rightNext,distance-1,list);
    }

    public void traversalLevelOrder(){
        for (int i=0;i<=height();i++) {
            List<Integer> list = atKDistance(i);
            for (Integer integer:list){
                System.out.println(integer);
            }
        }
    }

    public int getSize(){
        return getSize(root);
    }
    private int getSize(Node root){
        if (root==null) return 0;
        return 1+getSize(root.leftNext)+getSize(root.rightNext);
    }

    private boolean isLeaf(Node node){
        if (node.leftNext==null){
            if (node.rightNext==null) {
                return true;
            } return false;
        }return false;
    }

    public int countLeaves(){
        return countLeaves(root);
    }
    private int countLeaves(Node root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftNext)+countLeaves(root.rightNext);
    }

    public int max(){
        return max(root);
    }
    private int max(Node root){
        if (root==null) return Integer.MIN_VALUE;
        int left=max(root.leftNext);
        int right= max(root.rightNext);
        return Math.max(Math.max(left,right),root.value);
    }

    public boolean contain(int item){
        return contain(root,item);
    }
    private boolean contain(Node root,int item){
        if (root==null) return false;
        if (root.value==item) return true;
        return contain(root.leftNext,item)||contain(root.rightNext,item);
    }

    public boolean areSibling(int n, int m){
        return areSibling(root,n,m);
    }
    private boolean areSibling(Node root, int n, int m){
        if (root==null) return false;
        if (root.leftNext==null ||root.rightNext==null) return false;
        if (root.leftNext.value==n && root.rightNext.value==m) return true;
        if (root.rightNext.value==n && root.leftNext.value==m) return true;
        return areSibling(root.leftNext,n,m) || areSibling(root.rightNext,n,m);
    }

    public List<Integer> getAncestors(int n){
        List<Integer> list =new ArrayList<Integer>();
        getAncestors(root,n,list);
        return list;
    }
    private boolean getAncestors(Node root,int n,List<Integer> list){
        if (root==null) return false;
        if (root.value==n) return true;
        if (getAncestors(root.leftNext,n,list)|| getAncestors(root.rightNext,n,list)){
            list.add(root.value);
            return true;
        }
        return false;

    }





}


