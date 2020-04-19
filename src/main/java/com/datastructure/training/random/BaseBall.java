package com.datastructure.training.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseBall {
    public int calPoints(String[] ops) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (String string:ops) {
            int i=list.size();
            if (string.equals("D")) {
                result=result+2*list.get(i - 1);
                list.add(2 * list.get(i - 1));
            }else if (string.equals("+")) {
                result=result+list.get(i - 2) + list.get(i - 1);
                list.add(list.get(i - 2) + list.get(i - 1));
            }else if (string.equals("C")) {
                result = result-list.get(i - 1);
                list.remove(i - 1);
            }else {
                result = result + Integer.parseInt(string);
                list.add(Integer.parseInt(string));
            }
        }return result;
    }

    public int calWithStack(String[] ops){
        Stack<Integer> a = new Stack<>();
        int result =0;
        for(String string:ops){
            if (string.equals("D")){
                a.push(2*a.peek());
            }else if (string.equals("C")){
                a.pop();
            }else if (string.equals("+")) {
                int c=a.pop();
                int d = a.peek();
                a.push(c);
                a.push(c+d);
            }else{
                a.push(Integer.valueOf(string));
            }
        }for(Integer integer:a){
            result=result+integer;
        }return result;
    }

    public static void main(String[] args) {
        String[]a ={"5","-2","4","C","D","9","+","+"};
        BaseBall baseBall=new BaseBall();
        System.out.println( baseBall.calPoints(a));
    }
}