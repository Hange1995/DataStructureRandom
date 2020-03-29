package com.datastructure.training.Stack;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackInArray {
    private int count;
    private int[] array;


    public void push(int number){
        array[count++]=number;
    }
    public int pop(){
        int a = array[--count];
        return a;
    }
    public int peek(){
        if (count==0) throw new IllegalStateException();
        int a = array[count-1];
        return a;
    }
    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
