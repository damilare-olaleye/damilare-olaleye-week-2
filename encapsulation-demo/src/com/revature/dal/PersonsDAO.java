package com.revature.dal;

import java.util.ArrayList;

import com.revature.model.Person;

// This class is a blueprint for a Data Access Object
// The purpose of a DAO within the data access layer is to perform actions on some database
// Ex. adding, deleting, retrieving, or updating data that exists on a database
// Right now, we dont have enough knowlege to interface with a real database (such as a SQL database)
// So, in place of an actual database, we will just creat an ArrayList inside of this DAO that will store our Person objects
// we will cover about the Collection API ( which contains ArrayList) tomorrow
public class PersonsDAO {
	private ArrayList<Person> people;;
	
	public PersonsDAO() {
		this.people = new ArrayList<>();
	}
	
	public void add(Person per) {
		this.people.add(per); // lists have an add method that can be used to add elements to it.
	}
	
	public ArrayList<Person> getAll() {
		return this.people;
	}

}
