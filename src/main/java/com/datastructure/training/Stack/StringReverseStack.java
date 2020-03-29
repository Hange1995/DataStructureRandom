package com.datastructure.training.Stack;

import java.util.Stack;

public class StringReverseStack {
    public String reverse(String input){
        if (input==null)
            throw new IllegalStateException();
        Stack<Character> stack = new Stack<Character>();
        for(char a:input.toCharArray()){
            stack.push(a);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
