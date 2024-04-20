package org.example.in;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();

	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Grapes");

	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
        }

}
