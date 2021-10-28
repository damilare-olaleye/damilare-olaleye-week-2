package com.revature.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void demo() {
		// Lists maintain order of elements. Elements in a List are indexed, meaning we
		// can access individual elements starting from index 0
		// (similar to Arrays)
		// The order of elements is maintained by the order in which they are added

		// ArrayLists are the typical go-to implmentation when working with a list. You
		// should use LinkedLists only if you see a performance
		// benefits for some advanced use-cases.

		/*
		 * 
		 * Compare Arrays v. Lists
		 * 
		 * 1. BOTH are indexed (starting from 0) 2. Arrays are fixed in size 3. Lists
		 * are NOT fixed in size 4. You can obtain the number of elements in an Array
		 * using .length 5. For Lists, you use a method called .size() 6. To access
		 * individual elements in an array, you use this syntax myIntArray[5] <- access
		 * the 6th element 7. To access indiviual elements in a List, you use .get(int
		 * index) 8. BOTH arrays and lists can have duplicate element values
		 */

		// Let's create our first ArrayList to store Strings
		List<String> listOfStrings0 = new ArrayList<String>(); // <String> is used to specify what type of object you
																// would like for the Collection
		// to store.
		// <String> is an example of a generic. Generics can be a pretty advanced topic,
		// but for our purposes, we can think of it as a "parametized type.

		List<String> listOfStrings = new ArrayList<>(); // normally, programmers leave off the type on the right side if
														// they are assignening a Collection to
		// a reference variable. This is because it can automatically infer that they
		// ArrayList being constructed is supposed to store Strings

		listOfStrings.add("Mango");
		listOfStrings.add("Peach");
		listOfStrings.add("banana");
		listOfStrings.add("Banana");
		listOfStrings.add("Banana");
		listOfStrings.add("plum");
		listOfStrings.add("Orange");
		listOfStrings.add("Longan");

		System.out.println("listOfStrings: " + listOfStrings); // printing out the listOfStrings will print out all of
																// the elemments inside it
		// This is becuase of how ArrayList overrides the toString() method

		System.out.println("NUmber of elements inside listOfStrings: " + listOfStrings.size());

		listOfStrings.remove(new String("Peach")); // remove will only remove the first sequence

		System.out.println(listOfStrings);

		// Traversing a List
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println("index: " + i + ": " + listOfStrings.get(i));
		}

		// Tranverse using an enhanced for loop
		for (String s : listOfStrings) {
			System.out.println(s);
		}

		// Let's try to remove all occureences of Bannana
		// The best way to do that is by using what is known as an iterator object
		// This iterator object is connected with our ArrayList object
		// And will allow us to tranvverse through the List and also remove elements
		// that we specify
		Iterator<String> iter = listOfStrings.iterator();
		while (iter.hasNext()) { // While there's still more elements we want to go ahead and iterate to the next
									// element
			String nextElement = iter.next();
			if (nextElement.equals("Banana")) {
				iter.remove(); // remove the element at the current position of the cursor (iter.net())
			}
		}

		System.out.println("All Bananas are gone: " + listOfStrings);

		/*
		 * The idea of an iterator is actually really important, becuase that is
		 * actually how enhanced for loops really works
		 */
		// Tranverse using an enhanced for loop
		for (String s : listOfStrings) {
			System.out.println(s);
		}
		
		System.out.println("+========+");
		
		// Same as
		Iterator<String> myIter = listOfStrings.iterator();
		while(myIter.hasNext()) {
			System.out.println(myIter.next());
		}
		
		/*
		 * Collection v. Collections
		 * 
		 * Collection: an interface that is part of the Collections API hierrachy
		 * Collection: a class that NOTHING else inherits. It is simply a utility class that we can use
		 * 
		 * Utility class: A class that is NOT used as a blueprint for objects, but instead contains static methods that might be useful to use
		 * 
		 */
		
		Collections.reverse(listOfStrings); // reverse is a STATIC method. STATIC means that it belongs to the class itself.
		// So, we can access the reverse method not from an object of the class, but directly from the class.
		// Collection reverse <-
		
		System.out.println("reversed list: " + listOfStrings);
		
		Collections.sort(listOfStrings);
		
		System.out.println(listOfStrings);
		
		Collections.shuffle(listOfStrings);
		
		System.out.println("shuffled lists: " + listOfStrings);
		

	}

}
