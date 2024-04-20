package org.example.in;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

        // Add some elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        String elementToFind = "Banana";

        boolean exists = list.contains(elementToFind);

        if (exists) {
            System.out.println("The element '" + elementToFind + "' exists in the LinkedList.");
        } else {
            System.out.println("The element '" + elementToFind + "' does not exist in the LinkedList.");
        }
	 }
}
