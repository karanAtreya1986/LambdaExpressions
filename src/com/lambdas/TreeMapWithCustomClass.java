package com.lambdas;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithCustomClass {

	public static void main(String[] args) {

		TreeMap<Integer, CustomClassBook> t1 = new TreeMap<>();

		CustomClassBook cb1 = new CustomClassBook(1, "Gerald", "Butler", "Penguin", 1987);
		CustomClassBook cb2 = new CustomClassBook(1, "Gerald", "Butler", "Penguin", 1987);
		CustomClassBook cb3 = new CustomClassBook(1, "Tommy", "Butler", "Penguin", 1987);
		CustomClassBook cb4 = new CustomClassBook(0, "Gerald", "Butler", "Penguin", 1987);
		CustomClassBook cb5 = new CustomClassBook(0, "Gerald", "Bommy", "Penguin", 1987);
		CustomClassBook cb6 = new CustomClassBook(-12456, "King", "Kong", "America", 1987);
		CustomClassBook cb7 = new CustomClassBook(-345435345, "Godzilla", "Dinosaur", "Britain", 1987);

		t1.put(1, cb7);
		t1.put(1, cb6);
		// t1.put(null, cb5);
		// t1.put(null, cb4);
		t1.put(-2387234, cb3);
		t1.put(-3476234, cb2);
		t1.put(24234234, cb1);
		t1.put(435435435, cb1);
		// t1.put(2143234324, null);
		// t1.put(-234324234, null);

		for (Map.Entry<Integer, CustomClassBook> m1 : t1.entrySet()) {
			Integer i1 = m1.getKey();
			System.out.println("Key is " + i1);
			CustomClassBook cb11 = m1.getValue();
			System.out.println(
					cb11.author + " " + cb11.id + " " + cb11.name + " " + cb11.publisher + " " + cb11.quantity);
		}
	}

}
