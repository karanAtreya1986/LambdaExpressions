package com.lambdas;

import java.util.Hashtable;
import java.util.Map;

public class HowHashTableWorks {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht1 = new Hashtable<>();
		ht1.put(1, "Tiger");
		ht1.put(1, "Tiger");
		ht1.put(1, "Giraffe");
		ht1.put(0, "Lion");
		ht1.put(0, "Lion");
		ht1.put(0, "Tomato");
		// ht1.put(null, null);
		// ht1.put(null, null);
		// ht1.put(null, "Hen");
		// ht1.put(null, "hen");
		// ht1.put(null, "Chicken");
		// ht1.put(-324324, null);
		// ht1.put(-324324, null);
		ht1.put(-324324, "Awesome");
		ht1.put(23432432, "Godzilla");
		ht1.put(345345345, "Anaconda");

		for (Map.Entry<Integer, String> m1 : ht1.entrySet()) {
			Integer i1 = m1.getKey();
			System.out.println(i1);
			String s1 = m1.getValue();
			System.out.println(s1);
		}

	}

}
