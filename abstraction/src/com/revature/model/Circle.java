package com.revature.model;

public class Circle extends Shape {
	
	private double radius;

	public Circle(String description, double radius) {
		super(description);
		this.radius = radius;
		
	}

	@Override
	public double getArea() {
	
		return radius * radius * Math.PI; // going back to fundamentals PI is a static variable that belongs to the Math Class
		// The math class is a built in class for the Java runtime Library that is contained inside the java.lang package
		// You don't need to import classes located inside the java.lang package. They are automatically available.
	}

}
