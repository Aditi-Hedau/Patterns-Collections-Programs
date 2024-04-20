package org.example.in;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		  HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");
	        hashSet.add("Grapes");

	        System.out.println("Original HashSet: " + hashSet);

	        String[] array = new String[hashSet.size()];
	        hashSet.toArray(array);

	        System.out.println("Array after conversion:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	        }
}
