package com.lambdas;

@FunctionalInterface
interface tester {
	public void checkTesting(String a1);
}

public class AnonymousClassAndOlderWayOfImplementingInterfaces {

	public static void main(String[] args) {
		tester t1 = new tester() {

			@Override
			public void checkTesting(String a1) {
				System.out.println("Using anonymous class to print" + " " + a1);
			}
		};
		t1.checkTesting("Karan");
	}

}
