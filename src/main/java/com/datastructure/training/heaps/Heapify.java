package com.datastructure.training.heaps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Heapify {
    public static void heapify(int[] nums){
        int lastParentIndex = nums.length / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--)
            heapify(nums, i);
    }

    private static void heapify(int[] nums,int index){
        int largerIndex=index;
        int leftIndex=(2*index)+1;
        int rightIndex=(2*index)+2;
        if (leftIndex<nums.length && nums[largerIndex]<nums[leftIndex]){
            largerIndex=leftIndex;
        }
        if (rightIndex<nums.length && nums[largerIndex]<nums[rightIndex]){
            largerIndex=rightIndex;
        }

        if (index!=largerIndex) {
            swap(nums, index, largerIndex);
            heapify(nums, largerIndex);
        }
    }
    public static void swap(int[] nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static int getKthLargestNumber(int[] nums, int k){
        if (k<1||k>nums.length) throw new IllegalStateException();
        heapify(nums);
        for (int i =0;i<k;i++){
            int[]b = new int[nums.length-1];
            for (int j=1;j<b.length;j++){
                b[j-1]=nums[j];
            }
            heapify(b);
            nums=b;
        }return nums[0];
    }

    public static void main(String[] args) {
        int [] a = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
//        Heapify.heapify(a);
//        System.out.println(Arrays.toString(a));
        System.out.println(Heapify.getKthLargestNumber(a,3));
    }

}
