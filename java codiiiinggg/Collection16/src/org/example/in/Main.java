package org.example.in;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		  HashSet<String> hashSet = new HashSet<>();

	        // Add elements to the HashSet
	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");
	        hashSet.add("Grapes");

	        System.out.println("Original HashSet: " + hashSet);

	        hashSet.clear();

	        System.out.println("HashSet after emptying: " + hashSet);
	        }
}
