package com.revature.model;

public class Cat extends Animal {

	// Default constructor looks like the below
		public Cat(String name) { // whenever we construct a Dog object, we pass in an argument with its name, which we can then pass
			// over to the parent constructor 
			super(name); // this will call the constructor in the parent constructor 
		}
		
		public void makeNoise() {
			System.out.println("meow!!");
		}
}
