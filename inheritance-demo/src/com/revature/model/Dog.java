package com.revature.model;

public class Dog extends Animal {

	// Default constructor looks like the below
	public Dog(String name) {
		super(name); // this will call the constructor in the parent class 
	}
	
	// Method overriding
	// Remember that method overloading, which we already covered in week 1, is one way of defining multiple methods with the same name
	// Method overloading requires us to either have a different number of parameters and/or different types of parameters to distinguish
	// between the different methods that have been defined inside the SAVE CLASS
	
	// Method overriding is different
	// Method overriding requires you to have the exact same number of type of parameters
	// The method you want to override is located in a parent class
	// The overriding method is a method defined 
	
	public void makeNoise() {
		System.out.println("BARkkkkk!");
	}
	
	// We are defining a method specific to dogs
	// Animal does not have a play method defined
	// so, this is not overriding anything from Animal
	// We are just being MORE specific (adding something in addition to what was defined in the Animal class)
	// We do have 2 overloaded methods here. One takes in no arguments, and the other takes in one String argument.
	public void play() {
		System.out.println(super.name + "is playing");
	}
	
	public void play(String name) {
		System.out.println(super.name + "is playing");
	}
	
	
}
