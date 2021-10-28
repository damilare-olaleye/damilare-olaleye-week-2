package com.revature.demos;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void demo() {
		// Sets
		// 1. DO NOT have an index
		// 2. Can only contain unique elements
		
		// Two Implementations of Set to be aware of:
		// 1. Hashset: no ordering of elements
		// 2. TreeSet: ordering of elements
		
		// Change between Hashset and TreeSet
		
	//	Set<String> mySet = new HashSet<>();
		Set<String> mySet = new HashSet<>();
		// Using the Set Interface type as our reference variable
		// referring to a HashSet object (constructed from the HashSet class)
		
		mySet.add("Peache");
		mySet.add("Avocado");
		mySet.add("Orange");
		mySet.add("Peache");
		mySet.add("Apple");
		mySet.add("PineApple");
		mySet.add("Lemon");
		
		System.out.println("myHashSet: " + mySet); // no order if it a Hashset, but there is an order if it is TreeSet
		
		for (String c : mySet) {
			System.out.println(c);
		}
		
		// Sets come in handy if you need to check if you have already encountered some value
		// Some algoorithms that you write might have to utilize this type of strategy
		
	}
}
