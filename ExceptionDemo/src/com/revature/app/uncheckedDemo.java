package com.revature.app;

public class uncheckedDemo {
	public static void demo() {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException n) {
			System.out.println("An arithmetic expression occurs. Message is '" + n.getMessage() + "'"); // Exception
																										// objects have
																										// a property
																										// called
																										// message.
		}
	}

}
