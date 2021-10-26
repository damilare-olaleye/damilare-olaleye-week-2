package com.revature.model;

import java.util.Objects;

// Here is where we are demonstrating encapsulation
// we want a way to wrap up data about a person inso a single unit
// Having a person blueprint in order to create Person objects that will store that data is a good idea

/*
 * Java Bean: a Java bean is a class that 
 *  1. Has a no-args constructor
 *  2. Has getters/setters for its properties
 *  3. Is serializable (however this is obsolete at this point), so we will consider the Java Bean to be just 2 
 */

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, int age, String phoneNumber) {
		super();
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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	
	
	/*
	 * Object class method override
	 */
}
