package com.lambdas;

@FunctionalInterface
interface comparingValues {
	public boolean compareValuesAndShowResult(int a1, int a2);
}

public class ComparingValuesUsingLamda {

	public static void main(String[] args) {

		comparingValues cv1 = (b1, b2) -> {
			return b1 > b2;
		};
		boolean b3 = cv1.compareValuesAndShowResult(9, -1987);
		System.out.println(b3);

	}
}
