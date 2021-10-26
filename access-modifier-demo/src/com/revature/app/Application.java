package com.revature.app;

import com.revature.model.Person;

public class Application {

	public static void main(String[] args) {
		System.out.println(Person.numOfInstances); // static scoped variables, as a refresher, do not need to be access
													// from an instance
		// object because they are not scoped to instances, they are scoped to the class
		// itself.
		// We can access the numOfInstances variable from the Application class, because
		// the variable is public
		// public = anywhere inside of our project

		Person p1 = new Person("Damilare", "Olaleye", 24, "704232323");
		System.out.println(p1.firstName); // we can access firstName because it is public

//		Application a1 = new Application(); // Although, it doesnt make sense to have Application inherit from Person, this Application 
		// child object would now have access to lastName because lastName is protected.
//		System.out.println(a1.lastName);

		System.out.println(p1.getPhoneNumber());
	}

}
