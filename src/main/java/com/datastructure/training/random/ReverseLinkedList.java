package com.datastructure.training.random;

import org.w3c.dom.Node;

import javax.xml.stream.events.NotationDeclaration;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void reverse(){
        if (first==null) System.out.println("No element in the LinkedList");
        Node previous = first;
        Node current= first.next;
        while (current!=null){
            Node nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        last=first;
        last.next=null;
        first=previous;
    }
}
