package com.priorityQueue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] array;
    private int index;
    private int capacity;
    public PriorityQueue(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
    }
    public void insert(int item) {
        if(isFull()){
            int[] array1 = new int[capacity + 1];
            for(var i = 0;i < array.length;i++){
                array1[i] = array[i];
            }
            array = array1;
        }
        if (isEmpty()) {
            array[index] = item;
        } else {
            for (var i = index -1; i >= 0; i--){
                if(item > array[i]) {
                    array[i + 1] = item;
                    break;
                }
                else{
                    array[i + 1] = array[i];
                    if(i == 0){
                        array[i] = item;
                    }
                }
            }
        }
        index++;
    }

    //THIS remove()  LOGIC WORKS

    public int remove(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        var item = array[0];
        array[0] = 0;
        for(var i = 1;i < index;i++){
            array[i-1] = array[i];
            array[i] = 0;
        }
        index--;
        return item;
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public boolean isFull(){
        return index == capacity;
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
