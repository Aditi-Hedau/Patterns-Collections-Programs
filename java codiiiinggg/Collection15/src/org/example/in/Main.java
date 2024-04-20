package org.example.in;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		  HashSet<String> hashSet = new HashSet<>();

	        // Add elements to the HashSet
	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");
	        hashSet.add("Grapes");

	        // Iterate through the HashSet using an Iterator
	        System.out.println("Iterating through HashSet:");
	        Iterator<String> iterator = hashSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	 }
}
