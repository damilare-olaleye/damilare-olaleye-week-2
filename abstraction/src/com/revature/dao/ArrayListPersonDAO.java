package com.revature.dao;

import com.revature.model.Person;

// The purpose of this DAO is to stor person objects into an ArrayList
public class ArrayListPersonDAO implements PersonDAO {

	@Override
	public void add(Person p) {
		System.out.println("Adding Person to ArrrayListPersonDAO");
		
	}

}
