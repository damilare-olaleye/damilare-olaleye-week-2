package com.revature.model;

public class Person {
	
	// Access modifiers are a different concept from variable scope
	// Variable Scopes:
	// 1. Class scope (static) : is the variable belong to the class itself?
	// 2. Method scope: was the variable decleared directly inside of a method, but outside of a block?
	// 3. Instance scope : does the variable belong to individual instances (objects)
	// 4. method scope: was the variable declared directly inside of a method, but outside of a block?
	
	// fields with different access modifier levels
	public String firstName; // instance scoped variable w/ the public access modifier
	protected String lastName; // instance scooped variable with the protected access modifer
	double age; // instance scooped variable with the protected access modifer
	private String phoneNumber;
	
	// static fields
	public static int numOfInstances;
	
	// instance method
	public String getPhoneNumber() {
		return this.phoneNumber; // This method can access the private variable phoneNumber because it is inside the same class
	}
	
	public Person(String firstName, String lastName, double age, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		
		numOfInstances++;
				
	}

}
