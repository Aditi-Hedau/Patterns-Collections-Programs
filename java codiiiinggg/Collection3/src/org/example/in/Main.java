package org.example.in;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();

		 	list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        list.add("Grapes");

	        System.out.println("Original ArrayList: " + list);

	        int index = 2;

	        if (index >= 0 && index < list.size()) {
	            String element = list.get(index);
	            System.out.println("Element at index " + index + ": " + element);
	        } else {
	            System.out.println("Invalid index");
	        }
	}

}
