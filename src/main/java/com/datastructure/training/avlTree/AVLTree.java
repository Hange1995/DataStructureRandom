//package com.datastructure.training.avlTree;
//
//public class AVLTree {
//    private AVLNode root;
//
//    public void insert(int value){
//        root= insert(root,value);
//    }
//
//    public AVLNode insert(AVLNode avlNode,int value){
//        if (root==null) return new AVLNode(value);
//        if (avlNode.value>root.value){
//            root.right= insert(root.right,value);
//        } else if (avlNode.value<root.value){
//            root.left= insert(root.left,value);
//        }
//        return root;
//    }
//}
