package com.datastructure.training.random;

public class TwoSum {
    public static void main(String[] args) {
        int [] num;
    }
    public int[] sumTwo(int[] a, int target){
        int[] res=new int[2];
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1; j<a.length;j++){
                if (a[i]+a[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        res[0]=-1;
        res[1]=-1;
        return res;
    }
}
