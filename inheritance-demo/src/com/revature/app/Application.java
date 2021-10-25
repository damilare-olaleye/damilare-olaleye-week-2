package com.revature.app;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Food;
import com.revature.model.Lion;

public class Application {

	public static void main(String[] args) {
		Food steak = new Food("Filet Mignon", 50);
		Animal a1 = new Dog("Fido");
		
		// A dog object can make use of all of the different properties and behaviours defined in its parent class, Anila
		a1.eat(steak);
		a1.makeNoise(); // **GENERIC ANIMAL NOISES ** or Bark! ????
		// Regardless of the fact that dog1 is an Animal refernece variable, invoking makeNoise will print Bark! because the dog1 reference
		// Variable 
		
		Food fish = new Food("Tilapia", 25);
		a1 = new Cat("whiskers");
		
		a1.eat(fish);
		a1.makeNoise();
		
		a1 = new Lion("Simba");
		a1.makeNoise();
		
		// Create a second Dog object
		
		Food boneMarrow = new Food("Bone Marrow", 10);
		Animal a1000 = new Dog("Sparky");
		a1 = new Dog("Sparky");
		a1.eat(boneMarrow);
		a1.makeNoise();
		
		//a1000.play(); // a1000 is pointing to a Dog object, which in the Dog class has a behaviour defined called play()
		// However, this here DOES NOT work
		// That is because the Animal type does not have play specifically defined for it
		// we can use downcasting to solve this
		
		if(a1000 instanceof Dog) { // check to see if a1000 is actually pointing to a Dog object
			Dog dog = (Dog) a1000;
			
			dog.play();
			dog.play("Fetch");
		}
		
		/**
		 * Object class methods
		 * .equals()
		 * .toString()
		 * .hasCode()
		 */
		
		// equals()
		String s1 = "hello"; // String pool
		String s2 = new String("hello"); // regular part of heap
		System.out.println("s1 == s2" + (s1 == s2)); // false because s1 and s2 point to different objects
		System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true, because the equals method here is comparing the characters
		// inside each string object and whether they have exactly the same characters or not
		// the equals method is an example of method overriding. The string class overrides the equals method in the object class
		
		// We are creating two different animal objects with the same name (and arguments)
		// What if we want a way to compare Dog objects that have the same name and energyLevel
		// We cannot use == because all that does is compare what objects the variables are pointing to
		
		Animal aAnimal = new Dog("Fido");
		Animal a10001 = new Dog("Fido");
		
		System.out.println(aAnimal.equals(a10001)); // Prints true because even though they are different objects from each other.
		// they have the same name and energyLevel
		// we overrode the equals method in the Object class to compare the property values instead of object locations
		
		System.out.println(aAnimal); // by default, printing out an oject give you something like this
		// com.revature.model.Dog@d17a2c6f
		// It is the type of object followed by the memory location of the object (in particular, the hashed memory location of the object
		
		

	}

}
