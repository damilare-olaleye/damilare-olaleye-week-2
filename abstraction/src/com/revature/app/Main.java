package com.revature.app;

import com.revature.model.Circle;
import com.revature.model.Rectangle;
import com.revature.model.Shape;
import com.revature.model.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Shape a; // Abstraction: the idea of representing abstract ideas as types in Java
				// hence, we have the ability to create a Shape variable. This Shape variable can then reference any type of Shape (Rectangle, Circle, Triangle)
		
		a = new Rectangle("This rectangle is modelling the top of my desk", 20, 50);
		System.out.println(a.getArea());
		
		// Remember that a is a reference variable of the type Shape
		a = new Circle("This circle is modelling my beverage coster", 2.5);
		System.out.println(a.getArea());
		
		a = new Triangle("This is modelling my pizza slice", 8, 20);
		System.out.println(a.getArea());
		
		// We are demonstrating not only Abstraction, but also Polymorphism here
		// Shapes have many forms. We have getArea method that is being overridden in each specific subclass of shape
		// Ex. if a is pointing to a Rectangle, then use the formula for a rectangle's area ...
	}

}
