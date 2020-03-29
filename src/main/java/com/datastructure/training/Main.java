package com.datastructure.training;

import com.datastructure.training.queue.PriorityQueueInArray;
import com.datastructure.training.queue.QueueinArray;

public class Main {
    public static void main(String[] args) {
        PriorityQueueInArray priorityQueueInArray=new PriorityQueueInArray();
        priorityQueueInArray.insert(2);
        priorityQueueInArray.insert(1);
        priorityQueueInArray.insert(3);
        priorityQueueInArray.insert(5);
        priorityQueueInArray.insert(9);
        System.out.println(priorityQueueInArray);

    }
}
