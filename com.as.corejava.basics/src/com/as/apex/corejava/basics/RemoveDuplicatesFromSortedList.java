package com.as.apex.corejava.basics;


//Java Program to remove duplicates
//from a sorted linked list
public class RemoveDuplicatesFromSortedList {

/* Link list node */
static class Node
{
	int data;
	Node next;
};

//The function removes duplicates
//from a sorted list
static Node removeDuplicates(Node head)
{
	/* do nothing if the list is empty */
	if (head == null)
		return null;

	/* Traverse the list till last node */
	if (head.next != null)
	{
		
		/* Compare head node with next node */
		if (head.data == head.next.data)
		{
			head.next = head.next.next;
			removeDuplicates(head);
		}
		
		/* This is tricky: only advance if no deletion */
		else
		{
			removeDuplicates(head.next);
		}
	}
	return head;
}

/* UTILITY FUNCTIONS */
/* Function to insert a node at the beginning
of the linked list */
static Node push(Node head_ref,
				int new_data)
{
	/* allocate node */
	Node new_node = new Node();
			
	/* put in the data */
	new_node.data = new_data;
				
	/* link the old list off the new node */
	new_node.next = (head_ref);	
		
	/* move the head to point to the new node */
	(head_ref) = new_node;
	return head_ref;
}

/* Function to print nodes in a given linked list */
static void printList(Node node)
{
	while (node != null)
	{
		System.out.print(" " + node.data);
		node = node.next;
	}
}

/* Driver code*/
public static void main(String args[])
{
	/* Start with the empty list */
	Node head = null;
	
	/* Let us create a sorted linked list
	to test the functions
	Created linked list will be 11.11.11.13.13.20 */
	head = push(head, 20);
	head = push(head, 13);
	head = push(head, 13);
	head = push(head, 11);
	head = push(head, 11);
	head = push(head, 11);									

	System.out.println("Linked list before" +
			" duplicate removal ");
	printList(head);

	/* Remove duplicates from linked list */
	head = removeDuplicates(head);

	System.out.println("\nLinked list after" +
					" duplicate removal ");	
	printList(head);			
}
}
