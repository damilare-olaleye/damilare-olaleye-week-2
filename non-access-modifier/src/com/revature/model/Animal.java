package com.revature.model;

import java.util.Objects;

// Lets make it a Java Bean
public class Animal {

	private String name;
	
	// no-args constructor
	public Animal() {
		super();
	}
	
	// Parameterized / all-args constructor
	public Animal(String name) {
		this.name = name;
	}
	
	// Behaviour
	public final void makeNoise() {
		System.out.println("**GEneric animal noise");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	
}
