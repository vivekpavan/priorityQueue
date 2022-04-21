package com.priorityQueue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        com.priorityQueue.PriorityQueue queue = new PriorityQueue(5);
        queue.insert(80);
        queue.insert(2);
        queue.insert(5);
        queue.insert(28);
        queue.remove();
        queue.insert(18);
//        queue.remove();
//        queue.insert(6);
        System.out.println(queue.toString());

    }
}
