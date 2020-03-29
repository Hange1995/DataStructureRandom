package com.datastructure.training.queue;

import java.util.Arrays;

public class PriorityQueueInArray {
    private int i = 0;
    private int count =1;
    private int[] pq=new int[1];
    public void insert(int number){
        int i = count;
        int[] temp = pq;
        if (count==1) {
            pq[0]=number;
            temp=pq;
            count++;
            return;
        }
        if (pq.length<=count) {
            pq = new int[pq.length + 1];
        }
        for(int j=0;j<temp.length; j++){
            pq[j]=temp[j];
        }
        while( number < pq[i-2]){
            pq[i-1]=pq[i-2];
            i--;
            if (i<2) break;
        }
        pq[i-1]=number;
        count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(pq);
    }
}
