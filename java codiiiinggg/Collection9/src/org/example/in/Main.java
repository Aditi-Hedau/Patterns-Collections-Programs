package org.example.in;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(8);

        System.out.println("Original LinkedList: " + list);

        list.add(1, 10);

        System.out.println("LinkedList is: " + list);
        }

}
