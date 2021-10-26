package com.revature.app;

import java.util.ArrayList;

import com.revature.model.Person;
import com.revature.service.PersonService;

public class Application {

	public static void main(String[] args) {

		// Let's imagine we recieve some data from an HTML form
		// POST request was sent from a user to our server
		// Our server received the request with some data
		// We extract the data from the form (form-data)

		// Imageine the following values are from this HTML FORM THAT WAS extracted
		// inside the controller layer of our application
		String firstName = "Damilare";
		String lastName = "Olaleye";
		int age = 22;
		String phoneNumber = "727-372-8897";

		// Use the Person Java Bean to package the aboove data into a single unit
		Person p1 = new Person();

		p1.setFirstName(firstName);
		p1.setLastName(lastName);
		p1.setAge(age);
		p1.setPhoneNumber(phoneNumber);

		System.out.println(p1.getfirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println(p1.getPhoneNumber());
		
		// We can then pass around all of this data by simply passing a reference to this Person Object anywhere in our application
		
		PersonService personService = new PersonService();
		personService.addPerson(p1);
		
		ArrayList<Person> people = personService.getAll();
		System.out.println(people);
		
		// Let's add a second person
		Person p2 = new Person();
		p2.setFirstName("Damola");
		p2.setLastName("Olalye");
		p2.setAge(18);
		p2.setPhoneNumber("419-302-6546");
		
		personService.addPerson(p2);
		
		System.out.println(personService.getAll());

	}

}
