package com.revature.demos;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void demo() {
		// A Queue is just like in real life
		// The order that elements enter the queue is the order they come out
		// FIFO (FIRST IN FIRST OUT)
		// List<String> linkedList = new LinkedList<>();
		
		Queue<String> linkedListQueue = new LinkedList<>();
		
		linkedListQueue.add("1st Person");
		linkedListQueue.add("2nd Person");
		linkedListQueue.add("3rd Person");
		linkedListQueue.add("4th Person");
		
		// We could use poll or remove to retrieve elements from the queue
		// poll returns null if the queue is emply
		// remove will throw an exception if the queue is empty
		
		String element = linkedListQueue.poll();
		System.out.println(element);
		
		System.out.println(linkedListQueue.poll());
		System.out.println(linkedListQueue.poll());
		System.out.println(linkedListQueue.poll());
		System.out.println(linkedListQueue.poll());
		
	}
}
