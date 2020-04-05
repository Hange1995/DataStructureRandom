package com.datastructure.training.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeat {
    private Map<Character, Integer> findFirstMap = new HashMap<Character, Integer>();
    public Character firstNonRep(String string){
        char[] ch = string.toCharArray();
        for (char a : ch){
            int count = findFirstMap.containsKey(a) ?findFirstMap.get(a) : 0;
            findFirstMap.put(a,count+1);
        }
        for (char sch :ch){
            if (findFirstMap.get(sch)==1){
                return sch;
            }
        }
        return Character.MIN_VALUE;
    }
}
