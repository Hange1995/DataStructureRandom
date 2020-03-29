package com.datastructure.training.linkedlist;

import apple.laf.JRSUIConstants;
import sun.tools.tree.NewArrayExpression;

import java.util.NoSuchElementException;

public class LinkedListsDemo {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    private boolean isEmpty() {
        if (first == null) {
            return true;
        } else return false;
    }

    public void addLast(int item) {
        Node nodeLast = new Node(item);
        if (isEmpty()) {
            first = last = nodeLast;
            count++;
        } else {
            last.next = nodeLast;
            last = nodeLast;
            count++;
        }
    }

    public void addFirst(int item) {
        Node nodeFirst = new Node(item);
        if (isEmpty()) {
            first = last = nodeFirst;
            count++;
        } else {
            nodeFirst.next = first;
            first = nodeFirst;
            count++;
        }
    }

    public int indexOf(int item) {
        Node node = first;
        int i = 1;
        while (node != null) {
            if (node.value!=item){
                node=node.next;
                i++;
            }else return i;
        } return i;
    }
    public boolean contains(int item){
        Node node = first;
        while(node!=null){
            if (node.value == item){return true; }else {
                node=node.next;
            }
        }return false;
    }
    public void deleteFirst(){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if (first==last){
            first=last=null;
            return;
        }
        Node node= first.next;
        first.next=null;
        first=node.next;
        count--;

    }
    public Node getPrevious(Node node){
        Node current = first;
        while (current!=null){
            if (current.next==node) return current;
            current=current.next;
        }return null;

    }
    public void deleteLast(){
        if (isEmpty()){
            throw  new NoSuchElementException();
        }
        if (first==last){
            first=last=null;
            return;
        }
        Node previous= getPrevious(last);
        last=previous;
        last.next=null;
        count--;
    }
    public int size(){
        return count;
    }
    public int[] toArray(){
        int [] array=new int[count];
        Node current = first;
        int index=0;
        while (current != null){
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }
    public void addIndexof(int index,int item){
        if (index<0||index>count){
            throw new IllegalStateException("wrong size");
        }
        Node node = new Node(item);
        Node before= first;
        Node after = first;
        for (int i =1; i < index;i++){
            before=before.next;
        }
        for(int i = 0; i<index;i++){
            after=after.next;
        }
        before.next=node;
        node.next=after;
        count++;
    }

    public void reverse(){
        if (isEmpty()){
            throw new IllegalStateException("No elements in LinkedLists");
        }
        Node preivous = first;
        Node current = first.next;
        while(current!=null){
            Node nextone = current.next;
            current.next=preivous;
            preivous=current;
            current= nextone;
        }
        last=first;
        last.next=null;
        first=preivous;
    }
    public Node getKthFromTheEnd(int k){
        if (k<=0||k>count||isEmpty()) throw new IllegalStateException("k cant be negative or greater than the size");
        Node firstnode = first;
        Node secondnode = firstnode;
        for (int i = 0; i <k; i++){
            secondnode=secondnode.next;
            if (secondnode==null){
                throw new IllegalStateException("K is greater than size");
            }
        }
        while (secondnode!=null){
            firstnode=firstnode.next;
            secondnode=secondnode.next;
        }
        System.out.println(firstnode.value);
        return firstnode;

    }
    public void  getMiddle(){
        Node a = first;
        Node b = first;
        while(b!=last && b.next!=last){
            a = a.next;
            b = b.next.next;
        }
        if (b==last){
            System.out.println(a.value);;
        }else{
            System.out.println(a.value+","+a.next.value);
        }
    }
    public void checkLoop(){
        Node a=first;
        Node b=first;
        while(a.next!=b.next.next){
            if (b.next.next!=null){
                b=b.next.next;
                a=a.next;
            }else {
                System.out.println("There is no loop");
                return;
            }
        }
        System.out.println("There is loop in the LinkedList");
    }




}
