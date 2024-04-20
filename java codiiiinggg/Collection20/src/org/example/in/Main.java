package org.example.in;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(5);

        TreeSet<Integer> numbersLessThan7 = new TreeSet<>();
        for (Integer num : treeSet) {
            if (num < 7) {
                numbersLessThan7.add(num);
            }
        }

        System.out.println("Numbers less than 7 in the TreeSet: " + numbersLessThan7);
	        }
}
