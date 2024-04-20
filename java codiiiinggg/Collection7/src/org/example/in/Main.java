package org.example.in;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Elements of the ArrayList using positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + list.get(i));
        }
        }

}
