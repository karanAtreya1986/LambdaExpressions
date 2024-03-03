package com.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class HowTreeMapWorks {

	public static void main(String[] args) {

		TreeMap<Integer, String> t1 = new TreeMap<>();
		t1.put(1, "Karan");
		t1.put(1, "Karan");
		t1.put(1, "Giraffe");
		t1.put(0, "Tiger");
		t1.put(-1865, "Peacock");
		// t1.put(null, "Lion");
		// t1.put(null, "Lion");
		t1.put(-190, null);
		t1.put(-190, null);
		// t1.put(null, null);
		// t1.put(null, null);

		for (Map.Entry<Integer, String> m1 : t1.entrySet()) {
			Integer i1 = m1.getKey();
			System.out.println("Key is" + i1);
			String s1 = m1.getValue();
			System.out.println("Value is" + s1);
		}

	}

}
