package com.revature.service;

import java.util.ArrayList;

import com.revature.dal.PersonsDAO;
import com.revature.model.Person;

public class PersonService {

	private PersonsDAO personDAO;

	// constructor
	public PersonService() {
		 this.personDAO = new PersonsDAO();
	 }

	// The purpose of the service layer is to contain the business logic of our
	// application
	// In this area, we will use it to first validate whether the information that
	// was sent by the user is valid or not
	// we an then proceed to add this data to our database

	// Validate the data inside of the person object
	public void addPerson(Person person) {
		// Check #1: see if the age is positive
		if (person.getAge() < 0) {
			System.out.println("ERROR: WE CANNOT ADD this person object to the database because the age is negative");

			return; // for a void a method, immediately end the method right then and there
		}

		// Check #2: see if they have the valid phone number entered or not
		// (XXX-XXX-XXXX)
		// What we are going to do here is utilize a method from the String class that
		// takes in what is known as regular expression
		// pattern
		// If our String does not match with pattern, print our an error message
		if (!person.getPhoneNumber().matches("\\d{3}-\\d{3}-\\d{4}")) {
			System.out.println(
					"Error: We cannot add this person object to the database because the phoneNumber does not match xxx-xxx-xxxx");
			return;
		}
		this.personDAO.add(person);

	}
	
	public ArrayList<Person> getAll() {
		return this.personDAO.getAll();
	}
}
