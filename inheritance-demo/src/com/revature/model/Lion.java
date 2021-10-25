package com.revature.model;

public class Lion extends Cat {
	// Default constructor looks like the below
		public Lion(String name) {
			super(name); // this will call the constructor in the parent class 
		}
		
		// You can have multiple levels of overriding 
		// For example, cat is already overridiing the makeNoise method from Animal
		
		public void makeNoise() {
			System.out.println("ROARRRRR!");
		}
}
