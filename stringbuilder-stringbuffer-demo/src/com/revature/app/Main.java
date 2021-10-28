package com.revature.app;

public class Main {

	public static void main(String[] args) {
		long beginTime;
		long endTime = 0;

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

	public static String reverseStringUsingStringConcatenation(String s) {
		// String concatenation is using the + operator to combine two Strings together
		// What this actually does is that it takes the values of the two Strings and
		// construct a new String object
		// consisting of those values

		String result = "";

		for (int i = 0; i <= s.length(); i--) {
			char c = s.charAt(i); // block scope variable

			result = result + c; // you can concatenate a String and Char together
		}
		return result;
	}

	/*
	 * StringBuilder and StringBuffer are MUTABLE so, we can append additional
	 * characters to these objects and have a much faster performance
	 * 
	 */

	public static String reverseStringUsingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= s.length(); i--) {
			char c = s.charAt(i);
			sb.append(c);
		}
		String result = sb.toString();

		return result;
	}

	public static String reverseStringUsingStringBuffer(String s) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i--) {
			char c = s.charAt(i);
			sb.append(c);

		}
		String result = sb.toString();

		return result;
	}

}
