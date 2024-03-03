package com.lambdas;

@FunctionalInterface
interface checkInterfaceCreation {
	public String getMessage(String passMessage);
}

public class AnotherWayToWriteFunctionalInterfaces {

	public static void main(String[] args) {
		checkInterfaceCreation obj1 = (name) -> {
			return "Lamba name is " + name;
		};

		String message = obj1.getMessage("Hello Lambda");
		System.out.println(message);

	}

}
