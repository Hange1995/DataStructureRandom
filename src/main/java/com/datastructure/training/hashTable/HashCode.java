package com.datastructure.training.hashTable;

import java.util.Objects;

public class HashCode {
    private int id;
    private String name;
    public int hashCode(){
        //        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return Objects.hash(id,name);
    }
}
