package com.datastructure.training.queue;

import java.util.Arrays;

public class PriorityQueueInArray {
    private int i = 0;
    private int count =1;
    private int[] pq=new int[1];
    public void insert(int number){
        int i = count;

        if (count==1) {
            pq[0]=number;
            count++;
            return;
        }

        if (pq.length<=count) {
            pq = lengthPlusOne();
        }
        int x= shiftAndFindPosition(number,i);
        pq[x-1]=number;
        count++;

    }
    public void remove(){
        if (count==0) throw new IllegalStateException();
        int[] result = new int[pq.length-1];
        for (int i=0;i<result.length;i++){
            result[i]=pq[i];
        }
        pq=result;
        count--;
    }
    public int shiftAndFindPosition(int number, int i){
        while (number<pq[i-2]){
            pq[i-1]=pq[i-2];
            i--;
            if (i<2) break;
        }return i;
    }

    public int[] lengthPlusOne(){
        int [] temp=pq;
        pq=new  int[pq.length+1];
        for (int i=0;i<temp.length;i++ ){
            pq[i]=temp[i];
        }return pq;
    }


    @Override
    public String toString() {
        return Arrays.toString(pq);
    }

    public static void main(String[] args) {
        PriorityQueueInArray priorityQueueInArray=new PriorityQueueInArray();
        priorityQueueInArray.insert(30);
        priorityQueueInArray.insert(20);
        priorityQueueInArray.insert(10);
        priorityQueueInArray.remove();
        System.out.println(priorityQueueInArray);
    }
}
