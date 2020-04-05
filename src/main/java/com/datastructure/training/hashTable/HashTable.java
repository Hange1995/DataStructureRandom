package com.datastructure.training.hashTable;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int k;
        private String v;
        public Entry(int k, String v) {
            this.k = k;
            this.v = v;
        }

    }
    private int hash(int key ){
        return key%entries.length;
    }
    private LinkedList<Entry>[] entries = new LinkedList[5];
    public void input(int key , String value){
        int index=hash(key);
        if (entries[index]==null){
            entries[index]=new LinkedList<Entry>();
        }
        LinkedList<Entry> bucket = entries[index];
        for (Entry entry : bucket){
            if (entry.k==key){
                entry.v=value;
                return;
            }
        }
        Entry entry = new Entry(key,value);
        entries[index].addLast(entry);
    }
    public String get(int key){
        int index = hash(key);
        LinkedList<Entry> bucket =entries[index];
        if (bucket!=null) {
            for (Entry entry : bucket) {
                if (entry.k == key) {
                    return entry.v;
                }
            }
        }return null;
    }

    public void remove(int key){
        int index = hash(key);
        LinkedList<Entry> bucket =entries[index];
        for (Entry entry:bucket){
            if (entry.k==key){
                bucket.remove(entry);
                return;
            }
        }throw new IllegalStateException("No such key in the list");
    }


}
