package com.datastructure.training.array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;

public class ArrayDemo {
    private int[] array;
    private int count;
    private int index;

    public ArrayDemo(int length){
        array = new int[length];
    }
    public void insert(int number){
        if (array.length==count){
            int [] newArray = new int [count*2];
            for (int i = 0 ; i <count ;i++){
                newArray[i]=array[i];
            }array=newArray;
        }array[count++]=number;
    }
    public void deleteOf(int index){
        if (index<0 ||index>count ){
            System.out.println("error input");
        }
        for(int i = index;i<count; i++){
            array[i]=array[i+1];
        }
        count--;

    }
    public int indexOf(int number){
        for (int i = 0 ; i < count;i++) {
            if (array[i] == number)
                System.out.println(number);
        }
        return -1;
    }


    public void show(){
        for (int i =0;i < count ;i++){
            System.out.println(array[i]);
        }
        System.out.println("length = "+array.length);
    }

}
