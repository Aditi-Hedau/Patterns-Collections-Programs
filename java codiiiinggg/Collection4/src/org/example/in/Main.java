package org.example.in;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(6);

        System.out.println("Original ArrayList: " + list);

        Collections.sort(list);

        System.out.println("Sorted ArrayList: " + list);	}

}
