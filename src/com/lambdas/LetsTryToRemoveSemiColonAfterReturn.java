package com.lambdas;

interface removeSemiColonAndCheck {
	public String getMessage(String passMessage);
}

public class LetsTryToRemoveSemiColonAfterReturn {

	public static void main(String[] args) {
		removeSemiColonAndCheck obj1 = (name) -> {
			return "Lamba name is " + name;
		};

		String message = obj1.getMessage("Hello Lambda");
		System.out.println(message);

	}

}
