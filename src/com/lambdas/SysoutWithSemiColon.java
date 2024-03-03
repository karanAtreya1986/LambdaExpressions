package com.lambdas;

@FunctionalInterface
interface sysOutWithSemiColonCheck {
	public void checkOK(String s1);
}

public class SysoutWithSemiColon {

	public static void main(String[] args) {
		sysOutWithSemiColonCheck vt1 = co1 -> {
			System.out.println("Hello with curly brackets and no return type" + " " + co1);
		};
		vt1.checkOK("Check if Lamda is easy to write");
	}

}
