package org.example.in;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();

		 list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	       
	        System.out.println("Original ArrayList: " + list);

	        list.add(0, "Grapes");

	        System.out.println("ArrayList after insertion: " + list);

	}

}
