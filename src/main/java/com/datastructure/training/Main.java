package com.datastructure.training;

import com.datastructure.training.binaryTree.BinaryTree;
import com.datastructure.training.hashTable.HashTable;
import com.datastructure.training.queue.PriorityQueueInArray;
import com.datastructure.training.queue.QueueinArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(7);
        binaryTree.insert(4);
        binaryTree.insert(9);
        binaryTree.insert(1);
        binaryTree.insert(6);
        binaryTree.insert(8);
        binaryTree.insert(10);
        binaryTree.insert(3);
        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.insert(7);
        binaryTree2.insert(4);
        binaryTree2.insert(9);
        binaryTree2.insert(1);
        binaryTree2.insert(6);
        binaryTree2.insert(8);
        binaryTree2.insert(10);
        binaryTree2.insert(3);
        System.out.println(binaryTree.equals(binaryTree2));

    }
}
