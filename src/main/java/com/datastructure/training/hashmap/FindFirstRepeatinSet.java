package com.datastructure.training.hashmap;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatinSet {
    private Set<Character> set = new HashSet<Character>();
    public char findFirstRepeat (String string){
        char[] chars = string.toCharArray();
        for (char c: chars){
            if (set.contains(c)){
                return c;
            }set.add(c);
        }return Character.MIN_VALUE;
    }
}
