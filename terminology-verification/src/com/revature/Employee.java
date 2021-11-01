package com.revature;

// A blueprint for Employee objects (insatances)
public class Employee {
	
	/*
	 * 
	 * Instance related properties and behaviors + constructors
	 */

	// Properties of Employee objects
	// This are non-static field
	public int age; // primitive field
	public String name; // refrence field
	public int salary; // primitive field
	
	// Constructors are scoped to the instance being created
	// Therefore, it has direct access to the instance variables
	public Employee(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	// Behavior of Employee objects
	// non-static methods
	public void changeSalary(int s) {
		salary = s;
	}
	
	 // Main method
	// is static 
	public static void main(String[] args) {
		changeCeo("Dammy", 14);
		System.out.println(Employee.ceoName); // static variable
		
		
		// You need to create an instance to actually invoke methods or access instance variables
		// BECASUE these methods and variables belong to individual objects created from the blueprint
		Employee e1 = new Employee(23, "John", 34343);
		Employee e2 = new Employee(23, "DAm", 34343);
		Employee e3 = new Employee(23, "Dammy", 34343);
		
		/*
		 * We have 3 instances, each instance has its own instance variables
		 * 
		 * 1. age
		 * 2. name
		 * 3. salary
		 * 
		 */
		
		// We can invoke the behaviors (instance methods) of each instance to do anything we want with those instance's variables
		e1.changeSalary(10000);
		e1.changeSalary(100000);
		e1.changeSalary(100000);
		e1.changeSalary(10000000);
		
		// Change the CEO
		Employee.ceoName  = "Bob";
		
		
	}
	
	/*
	 * 
	 *  static (class) related properties and behaviors
	 */
	
	// Properties of the Emplyee class
		// static fields
		public static String ceoName;
		public static int ceoSalary;
	
	// Behavior of the Employee class
	// static methods
	public static void changeCeo(String name, int ceoSalary) {
		Employee.ceoName = name;
		Employee.ceoSalary = ceoSalary;
	}

	
	/*
	 * Object class methods to override toString, hashCode() equal
	 */
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
