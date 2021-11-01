package com.revature.app;

import com.revature.exceptions.DivideByZeroException;

public class checkedDemo {
	public static void demo()  {
		try {
			divide(10,8);
		} catch(DivideByZeroException e) {
//			e.printStackTrace(); // should always be used for debugging only, remove when deploying application. not for production
			System.out.println(e.getMessage());
		}catch(ClassCastException | ArithmeticException e) {
			//...
		}catch (Exception e) {
			// this catch block will catch ALL EXCEPTIONs. Consider the hierrachy of exceptions. The exception call is always 
			// the least specific
			
			// You should always have more specific catch block first, less specific ones later
		}
		finally {
			// the code in this block will ALWAYS execute no mater what (unless your computer  crashes or you purposefully terminate the application)
			System.out.println("I am inside the finally block. I will always be executed whether an exception occurs or not");
		}
		
		/*
		 * 	Principles behind declaring and handling exceptions:
		 * 	Checked exceptions require you to either declare or handle the exception, otherwise the program will not compile
		 * 
		 * 1. Declare: using the 'throws' keyword in the method signmature to say that the method you are trying to invoke has to potential to be 
		 * 		thowing that particular checked exception. (Also known as 'ducking' the exception, because you are not handling the exception in that 
		 * 		immediate method. You are passing the responsibility to the method that calls that method)
		 * 2. Handling: using a try block that contains the code that might have an exception thrown from it, and defining the catch blocks that will then catch 
		 * 		those exceptions and excute code to handle those particular exceptions.
		 * 
		 * 
		 * Handling
		 * 	1. try-catch
		 * 	2. multiple catch blocks
		 * 	3. try-catch-finally
		 *  4. try-catch-catch ... finally
		 *  
		 *  finally block: 
		 *  	The purpose of the finally block is to ensure that you have code that is ALWAYS executed, regardless of whether an exception is caught or not
		 *  
		 *  	Might be useful to clean up reources that are be used. 
		 */
	}
	
	public static double divide(double d1, double d2) throws DivideByZeroException {
		// If d2 == 0, throw an exception
		// In this case, we will create our own custom checked exception called DivideByZeroException
		if(d2 == 0) {
			throw new DivideByZeroException("Tried to divide " + d1 + "by " + d2);
		}
		
		return d1/d2;
	}
}
