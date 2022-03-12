package com.as.apex.corejava.basics;

//Java program to demonstrate the
//working of PriorityQueue
import java.util.*;

class PriorityQueueDemo {
	
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
		
		 PriorityQueue<String> pq = new PriorityQueue<>();
		  
	        pq.add("I");
	        pq.add("LOVE");
	        pq.add("INDIA");
	  
	        System.out.println("Initial PriorityQueue " + pq);
	  
	          // using the method
	        pq.remove("I");
	  
	        System.out.println("After Remove - " + pq);
	        
	     // Using the peek() method
	        String element = pq.peek();
	        System.out.println("Accessed Element: " + element);
	  
	        System.out.println("Poll Method - " + pq.poll());
	  
	        System.out.println("Final PriorityQueue - " + pq);
	}
}
