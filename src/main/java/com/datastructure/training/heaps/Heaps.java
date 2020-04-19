package com.datastructure.training.heaps;

public class Heaps {
    private int[] nums =new int[10];
    private int size;
    public int[] insert(int val){
        if (size==nums.length) throw new IllegalStateException();
        nums[size++]=val;
        bubbleUp();
        return nums;
    }
    public int remove(){
        if (isEmpty()) throw new  IllegalStateException();
        int result=nums[0];
        nums[0]=nums[size-1];
        size--;
        int index=0;
        while (index<=size && !isVaild(index)){
            int largerChildIndex= largerChindIndex(index);
            swap(nums[index],nums[largerChildIndex]);
            index=largerChildIndex;
        }return result;
    }

    private boolean hasLeftChild(int index){
        return leftChildIndex(index)<=size;
    }
    private boolean hasRightChild(int index){
        return rightChildIndex(index)<=size;
    }
    private int largerChindIndex(int index){
        if (!hasLeftChild(index)) return index;
        if (!hasRightChild(index)) return leftChildIndex(index);
        return nums[leftChildIndex(index)]>nums[rightChildIndex(index)] ? leftChildIndex(index) :rightChildIndex(index);
    }
    private boolean isVaild(int index){
        if (!hasLeftChild(index)) return true;
        if (!hasRightChild(index)) return nums[index]>=nums[leftChildIndex(index)];
        return nums[index]>=nums[leftChildIndex(index)] && nums[index]>= nums[rightChildIndex(index)];
    }

    private void bubbleUp(){
        int index= size-1;
        //if child > parent switch to the parent.
        while (index>0 && nums[index]>nums[parentIndex(index)]){
            swap(index,parentIndex(index));
            index=parentIndex(index);
        }
    }

    private int parentIndex(int index){
        index=(index-1)/2;
        return index;
    }
    private int leftChildIndex(int index){
        return index*2+1;
    }
    private int rightChildIndex(int index){
        return index*2+2;
    }
    public boolean isEmpty(){
        if (size==0) return true;
        return false;
    }

    private void swap(int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
