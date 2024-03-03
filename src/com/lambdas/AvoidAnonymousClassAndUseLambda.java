package com.lambdas;

@FunctionalInterface
interface voidTesting {
	public void checkOK(String s1);
}

public class AvoidAnonymousClassAndUseLambda {

	public static void main(String[] args) {
		voidTesting vt1 = co1 -> System.out.println("Hello without curly brackets and no return type" + " " + co1);
		vt1.checkOK("Check if Lamda is easy to write");
	}

}
