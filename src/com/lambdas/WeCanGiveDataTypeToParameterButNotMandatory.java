package com.lambdas;

@FunctionalInterface
interface checkDataTypeToParameter {
	public String getMessage(String passMessage);
}

public class WeCanGiveDataTypeToParameterButNotMandatory {

	public static void main(String[] args) {
		checkDataTypeToParameter obj1 = (String name) -> {
			return "Lamba name is " + name;
		};

		String message = obj1.getMessage("Hello Lambda");
		System.out.println(message);

	}

}
