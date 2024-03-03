package com.lambdas;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class EnumerationWithHashTable {

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

		// enumeration

		// Enumeration<String> et1 = ht1.elements();
		// while (et1.hasMoreElements()) {
		// String s1 = et1.nextElement(); // this will get the values. returns string.
		// System.out.println(s1);
		// }
		//
		// System.out.println("===========================");
		//
		// Enumeration<String> et2 = ht1.elements();
		// while (et2.hasMoreElements()) {
		// System.out.println(et2.nextElement()); // this will get the values. returns
		// string.
		// }

		// System.out.println("===========================");
		//
		// Enumeration<String> et3 = ht1.elements();
		// Enumeration<Integer> it3=ht1.keys();
		// while (it3.hasMoreElements()) {
		// Integer st3=it3.nextElement();//returns key and its data type when we are
		// traversing keys.
		// System.out.println("Key is " + " " + st3 + " value is " + " " +
		// ht1.get(st3));
		// }
		//
		// keyset
		System.out.println("===========================");

		Enumeration<String> et3 = ht1.elements();
		Set<Integer> it3 = ht1.keySet();
		for (Integer st3 : it3) {
			System.out.println(st3);
		}

	}

}
