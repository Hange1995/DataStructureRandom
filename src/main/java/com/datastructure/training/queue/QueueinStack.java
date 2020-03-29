package com.datastructure.training.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueinStack {
    //it's A solution which will return all the result in one Stack
    private Stack<Integer> stackA = new Stack<Integer>();
    private Stack<Integer> stackB = new Stack<Integer>();
//    public Stack<Integer> enqueueA(int number){
//        Stack<Integer> stackC = new Stack<Integer>();
//        stackA.push(number);
//        stackB.push(number);
//        while (!stackA.empty())
//            stackC.push(stackA.pop());
//        stackA= stackB;
//        return stackC;
//    }
//    public Stack<Integer> dequeueA(){
//        Stack<Integer> stackC = new Stack<Integer>();
//        while (!stackA.empty())
//            stackC.push(stackA.pop());
//        stackC.pop();
//        stackB=stackC;
//        while (!stackB.empty())
//            stackA.push(stackB.pop());
//        stackB=stackA;
//        return stackC;
//    }
    // It's B solution which store the result in two Stacks
    public void enqueueB(int number){
        stackA.push(number);
    }
    public int dequeueB(){
        if (stackA==null&&stackB==null) throw new IllegalStateException();
        if (stackB==null){
            stackB.push(stackA.pop());
        }
        return stackB.pop();
    }

}
