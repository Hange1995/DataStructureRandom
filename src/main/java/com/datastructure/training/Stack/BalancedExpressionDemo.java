package com.datastructure.training.Stack;

import java.util.Stack;

public class BalancedExpressionDemo {
    public void checkbalance(String input){
        if (input==null) throw new IllegalStateException();
        Stack<Character> stack = new Stack<Character>();
        for (char a:input.toCharArray()) {
            if (a == '(')
                stack.push(')');
            if (a == '[')
                stack.push(']');
            if (a =='{')
                stack.push('}');
            if (a == '<')
                stack.push('>');
            if (a ==stack.peek()) {
                if (stack.empty()) {return;}
                stack.pop();
            }
        }
        if (stack.empty())
            System.out.println("it's a balanced string");
        else System.out.println("it's not a balanced string");
    }
}
