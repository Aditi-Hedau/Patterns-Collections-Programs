package org.example.in;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);

        System.out.println("Original PriorityQueue: " + priorityQueue);

        priorityQueue.clear();

        System.out.println("PriorityQueue after removing all elements: " + priorityQueue);
	    }
}
