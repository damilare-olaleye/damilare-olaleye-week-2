package com.revature.dao;

import java.util.ArrayList;

import com.revature.model.Person;

// The purpose of an interface is to define a contract on what a particular type should have the behaviors for

public interface PersonDAO {
	int someVariable = 10; // implicity 'public static final int someVariable'
	
	// Properties of an interface
	// 1. All methods declared inside of an interface are implicityly abstract (unless they are static)
	// 2. Interfaces cannot contain instance variables
			// - All variables delcared in an interface are implicitly public, static, and final.
	
	void add(Person p); // implicityly 'public abstract void add(Person p)'
	
	
	// In our scenario, this interface did not have the getAll() method originallyy. It only drined the add method that was required
	// implemented. So, developers went ahead and utilized this interface and implement the add functionality that was required
	default ArrayList<Person>getAll(){
		System.out.println("Default implementation for getAll()");
		return null;
	}
	
	// In Hava 8, the default keyword was added for instance mehtods
	// This allows us to actually provide a default implementation without having to make the instance method abstract
	// The reasons for the additon of the default keyword is that you are always required to provide an implemtntion in your implementing classes
	// Whatever class implements the interface must actually provide the code for that interfcae
	// The problem is that is a developer wants to make a change to an interface (add new methods), this would've broken exisiting code that was
	// Written before the addition of this new method. 
	
	default void defaultIMplementionExample() {
		System.out.println("This is an example of an instance method with an actual body inside of an interface");
	}
	
	// Interface CAN have static methods. These static methods must have an implementation, because the idea of abstract methods really only applies
	// to instance (non-static) methods.
	public static void someStaticMehtod(){
		System.out.println("This is a static method contained inside the interface");
	}
}
