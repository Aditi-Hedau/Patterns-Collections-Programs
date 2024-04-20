package org.example.in;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(2);
        list.add(8);

        System.out.println("Original LinkedList: " + list);

        list.addFirst(5);

        System.out.println("LinkedList after inserting at the first position: " + list);

        list.addLast(10);

        System.out.println("LinkedList after inserting at the last position: " + list);

        }

}
