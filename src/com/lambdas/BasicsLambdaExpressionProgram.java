package com.lambdas;

interface newInterfaceCreated {
	public String getMessage(String passMessage);
}

public class BasicsLambdaExpressionProgram {

	public static void main(String[] args) {
		newInterfaceCreated obj1 = (name) -> {
			return "Lamba name is " + name;
		};

		String message = obj1.getMessage("Hello Lambda");
		System.out.println(message);

	}

}
