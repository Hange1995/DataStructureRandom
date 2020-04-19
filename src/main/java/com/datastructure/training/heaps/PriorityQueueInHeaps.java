package com.datastructure.training.heaps;

public class PriorityQueueInHeaps {
    private Heaps heaps=new Heaps();
    public void enqueue(int number){
        heaps.insert(number);
    }
    public int dequeue(){
        return heaps.remove();
    }
    public boolean isEmpty(){
        return heaps.isEmpty();
    }
}
