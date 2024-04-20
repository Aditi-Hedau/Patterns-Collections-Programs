package org.example.in;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);
        map.put("Grapes", 15);

        String key = "Orange";

        Integer value = map.get(key);

        System.out.println("Value associated with key '" + key + "': " + value);
	    }
}
