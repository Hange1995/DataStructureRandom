package com.datastructure.training.queue;

import java.util.Arrays;

public class QueueinArray {
    private int[] array = new int[5];
    private int front=0;
    private int end = 0;
    private int count = 0;
    public void enqueue(int number){
        if (count==array.length) throw new IllegalStateException();
        array[end]=number;
        end = (end+1)%array.length;
        count++;
    }
    public int dequeue(){
        int b = array[front];
        array[front]=0;
        front = (front+1)%array.length;
        count--;
        return b;
    }
    public void peek(){
        int b = array[front];
    }
    private boolean isEmpty(){
        if (front==end) return true;
        return false;
    }
    public boolean isFull(){
        if (count==5) return true;
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
