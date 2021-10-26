package com.revature.model;

// Here is where we are demonstrating encapsulation
// we want a way to wrap up data about a person inso a single unit
// Having a person blueprint in order to create Person objects that will store that data is a good idea

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	
	public Person(String firstName, String lastName, int age, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * GGetters / Setters
	 * 
	 * Getters: Used to retrieve the values of the properties of an object
	 * Setters: Used to change the values of the properties of an object
	 * 
	 * 
	 */
	public String getfirstName() { // example of a Getter
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
