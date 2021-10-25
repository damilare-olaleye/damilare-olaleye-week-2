package com.revature.model;

import java.util.Objects;

//Inheritance. The point of inheritance is to have classes inherit the properties and behaviour of another class
// It allows us to prevent code duplication when multiple classes use the same properties and methods
// For example, there are properties and behaviours universal to all types of Animal
// Instead of defining the exact same properties and behaviours over and over again for each specific type of Animal, 
// we can just inherit it from the base class Animal. 

// Terminologies:
	// Superclass/base-class/parent class = A class higher in the hierarchy (Animal)
	// Subclass/Child class = A class lower in the hierarchy (Dog and Cat)

// Phrases:
	// Lion is a subclass of cat
	// Dog and Cat are subclasses of Animal
	// Animal is a subclass of Object

// Upcasting/downcasting (revisited)
	// Whenever we create classes, we also create types associated with those classes
	// For example: Animal, Dog, Cat, and Lion are now variable types (in addition to being types of objects)

// Upcasting and downcasting are all about converting from one type of variable to another
// Upcasting (implicit): going from a more specfic type to a less specific type (going from Dog to Animal, we are going up the hierchy,
// which is also being less specific).
// Downcasting (explicit): going from a less specfic type to a more specific type (Lion is more specific than Cat, we are going down the hierarchy).


// Because this is the parent-most class of all other Animal types
// we want to define properties and behavoiurs that are universal to all Animals here
public class Animal {
	
	// Properties
	public double energyLevel;
	public String name;
	
	// Constructor 
	public Animal(String name) {
		this.name = name;
		this.energyLevel = 1000;
	}
	
	// Behaviours
	public void makeNoise() {
		System.out.println("**GENERIC ANIMAL NOISES**");
	}
	
	public void eat(Food food) {
		this.energyLevel += food.norishmentValue;
		System.out.println(this.name + " ate " + food.foodName +
				" and increased its energy level by " + this.energyLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(energyLevel, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Double.doubleToLongBits(energyLevel) == Double.doubleToLongBits(other.energyLevel)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [energyLevel=" + energyLevel + ", name=" + name + "]";
	}
	
	
}
