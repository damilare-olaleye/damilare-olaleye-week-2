package com.revature.app;

public class Main {

	public static void main(String[] args) {

		long beginTime;
		long endTime;

		// reverse string using StringConcatenation
		beginTime = System.nanoTime(); // get the time in nanoseconds right before we run the below method
		System.out.println(reverseStringUsingStringConcatenation("hello world" + (endTime - beginTime) + "ns"));
		endTime = System.nanoTime();

		// reverseStringUsingStringBuilder
		beginTime = System.nanoTime(); // get the time in nanoseconds right before we run the below method
		System.out.println(reverseStringUsingStringBuilder("hello world" + (endTime - beginTime) + "ns"));
		endTime = System.nanoTime();

		// reverseStringUsingStringBuffer
		beginTime = System.nanoTime(); // get the time in nanoseconds right before we run the below method
		System.out.println(reverseStringUsingStringBuffer("hello world" + (endTime - beginTime) + "ns"));
		endTime = System.nanoTime();

	}

	public static reverseStringUsingStringConcatenation(String s) {
		// String concatenation is using the + operator to combine two Stings together
		// What this actually does is takes the values of the two Strings and construct a new String object consisiting of those values
		
		String result = ""; // method scope variable
		
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i); // block scope variable
			
			result = result + c; // you can concatenate a String and char together
		}
		
		return result;
		
	}

	/*
	 * StringBuilder and StringBuffer are MUTABLE so, we can append additional
	 * characters to these objects and have a much faster performance
	 * 
	 */

public static reverseStringUsingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length() - 1; i >=0; i--) {
			char c = s.charAt(i);
			
			sb.append(c);
		}
		
		String result = sb.toString();

	return result;

}

public static reverseStringUsingStringBuffer(String s) {
	StringBuffer sb = new StringBuffer();
	
	for(int i = s.length() - 1; i >=0; i--) {
		char c = s.charAt(i);
		
		sb.append(c);
	}
	
	String result = sb.toString();

return result;
}

}
