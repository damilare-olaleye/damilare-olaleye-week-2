package com.revature.dao;

import com.revature.model.Person;

// The purpose of this DAO is to store/retrieve information from the Database
public class SQLPersonDAO implements PersonDAO {

	@Override
	public void add(Person p) {
		System.out.println("Adding Person to Database");
		
	} // implements is used to inherit from an interface 

}
