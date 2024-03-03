package com.lambdas;

@FunctionalInterface
interface Circle {
	public double getRadius(double radius);
}

public class BigProgramUsingLambda {

	public static void main(String[] args) {
		Circle area = r -> {
			return Math.PI * r * r;
		};
		Circle cimcumference = r -> {
			return 2 * Math.PI * r;
		};

		BigProgramUsingLambda b = new BigProgramUsingLambda();
		// double d1 = b.circleTimePass(2, area);
		// System.out.println(d1);
		// double d2 = b.circleTimePass(4, cimcumference);
		// System.out.println(d2);

		b.circleTimePass(20, area);
		b.circleTimePass(49, cimcumference);

	}

	// public double circleTimePass(double rad, Circle c) {
	// return c.getRadius(rad);
	// }

	public void circleTimePass(double rad, Circle c) {
		System.out.println(rad); // this returns radius we passed.
		double d3 = c.getRadius(rad); // this will get the radius and calculate area and circumference because its
		// implementation is mentioned.
		System.out.println(d3); // prints the calculated value
	}

}
