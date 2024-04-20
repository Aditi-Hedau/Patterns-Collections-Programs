package org.example.in;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Original Set 1: " + set1);
        System.out.println("Original Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("Set after retaining common elements: " + set1);
	        }
}
