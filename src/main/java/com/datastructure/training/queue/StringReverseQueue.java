package com.datastructure.training.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StringReverseQueue {
    public void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty()){
            int a = queue.remove();
            stack.add(a);
        }
        while (!stack.empty()){
            int b = stack.pop();
            queue.add(b);
        }
        System.out.println(queue);
    }
}
