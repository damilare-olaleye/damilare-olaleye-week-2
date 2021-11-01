package com.revature.app;

public class Application {

	public static void main(String[] args) {
	
	
		
		System.out.println("This line runs");
		
		// Code that we are trying to execute goes inside the try {} block
		// If an exception is encountered with the code inside the try block, we will skip straight to the catch block for that particular exception
		try {
			System.out.println(10 / 0); // We encountered the arithmetic expression here, which will disrupt the flow of the method, such that no subsequent lines
			// of code will execute in that method
		} catch (ArithmeticException e) { // e is a refrence variable to an exception object, in this case. It is a refreence variable of the type ArithmeticException
			System.out.println("Cannot divide by 0");
		} catch (ClassCastException e) {
			// You can have multiple catch blocks
		}
		
		System.out.println("This line DOES RUN");
		
		/*
		 * 
		 * As long as we handle exceptions in our program, the program will not crash due to that exception
		 * 
		 * But, if we leave an exception unhandled, then the program will terminate.
		 * 
		 * Exception v Error (in Java)
		 * 
		 * 
		 * 
		 * 
		 * Throwable Hierachy: 
		 * 	In Java, there is a class called Throwable, which has two subclasses: Error and Exception
		   
		 * Error: something that YOU can catch, but probably shouldn't, because an error is reserved for something that you cannot recover from
		 * 	- Ex. StackOverflowError
		 *  - Ex. OutOfMemoryError
		 *  
		 *  
		 *  Exception: the class that all exception subclasses inherit from 
		 *  	- If a class inherits directly from the Exception class, it is known as a CHECKED exception
		 *  
		 *  
		 *  RuntimeException: a class that extends the Exception class
		 *  	- Any subclasses of RuntimeException are known as UNCHECKED exception 
		 *  
		 */
	
		/*
		 * Two types of Exceptions:
		 * 	- Checked exception
		 * 	- Unchecked exception
		 * 
		 * CUSTOM EXCEPTIONS: 
		 * 	- To create a custom checked exception, we need to create a class that extends the Exception class
		 *  - To create a custom unchecked exception, we need to create a class that extends the RuntimeException class
		 *  
		 *  Despite the name of Exception and RuntimeException, ALL exception occur at RUNTIME
		 *   - ALL 
		 */

	}

}
