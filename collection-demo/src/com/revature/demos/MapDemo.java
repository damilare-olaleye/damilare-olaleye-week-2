package com.revature.demos;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;



public class MapDemo {
	public static void demo() {
		// Maps: a data structure comprised of key-value pairs
		// 1. The key is used to retrieve the associated value.
		// 2. The retrieval of the value occurs in 0(1) time. 
		// 3. The keys are unique
		// 4. Values DO NOT have to be unique
		
		String myString = "sdfsadgeweafsdfadfadf;asdfasdgewewreasdcadfareraeaef{]famdflapwoewomvdavavad";
		
		// Object: count up the frequeney of characters in this long string
		// A good data structure to use is a map
		
		
		// Notice we are using the wrapper classes, Character and Integer
		// That is because Collections CANNOT store primitives directly
		// The can only store objects
		// This is why we need wrapper objects if we still want to work with "primitive" types within Collections
		
		Map<Character, Integer> characterFrequency = new HashMap<>();
		
		// Iterate 
		for(int i = 0; i <= myString.length() -1; i++) {
			char c = myString.charAt(i);
			
			// Check to see if this is the first time we have encountered this character
			if (characterFrequency.get(c) == null) { // if the character is not inside the Map yet
				characterFrequency.put(c, 1); // this is the first time, so we put in a value of 1, since we have so far only encountered 1 of these character
			} else {
				characterFrequency.put(c, characterFrequency.get(c) + 1);
			}
		}
		
		// Iterating over the keys
		Set<Character> uniqueCharacters = characterFrequency.keySet();
		
		for (Character c : uniqueCharacters) {
			System.out.println(c);
		}
		
		// Iterate over both keys and values
		
		// A set of Entry elements consisting of the Character type for the key and Integer type for the value
		Set<Entry<Character, Long>> keyValuePairs = characterFrequency.entrySet();
		
		for (Entry<Character, Integer> keyValuePair : keyValuePairs) {
			System.out.println(keyValuePair.getKey() + " : value = " + keyValuePair.getValue());
		}
		
		/*
		 *  The important takeaway is that to solve certain problems, you will require certain data structures to use
		 *  For example, a great way to count up all of the charactes encounterd in a String is using a Map
		 */
		
		System.out.println("number of o's: " + characterFrequency.get("o"));
	}
}
