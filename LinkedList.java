package LinkedList;

public class LinkedList {
	
	// instance variable
	LinkedNode head;
	
	public LinkedList() {
		// what is the value of head?
		// null
	}
	
	// write a method called size that returns the number of nodes in this list
	
	/**
	 create a count variable to keep track
	 while I am not at the end of the list
	 	add 1 to the count
	 	move to the next node
	 return count
	 
	 */
	public int size() {
		int count = 0;
		
		// create a local variable currentNode to keep track of where we are
		// currentNode should always start from the head
		LinkedNode currentNode = this.head; // while step 1
		// where are you if currentNode.next is null?
		// last node in the list -> length-1
		// where are you if currentNode is null?
		// one position outside of the list -> length
		
		// always while loop in linked stuff
		// 1. initialization; 2. test the condition;  3. change the variable
		while (currentNode != null) { // while step 2
			
			count++;
			currentNode = currentNode.next; // while step 3
		}
		return count;
	}
	
	// write a method called insert that take an integer value as parameter
	// add a new LinkedNode with the given value to the end of the list
	
	/**
	 When the list is empty
	 	assign the new node as the head of the list
	 when the list is not empty
	 	find the tail of the list
	 	update the tail.next reference to the new node
	 */
	public void insert( int value) {
		
		// create a new node with the value
		LinkedNode newNode = new LinkedNode(value);
		// if the head is null -> the list is empty
		if (this.head == null) {
			this.head = newNode;
		}
		else {
			LinkedNode currentNode = this.head;
			// find the tail
			while (currentNode.next != null) {
				// move to the next until I am at the last node (tail)
				currentNode = currentNode.next;
			}
			
			// where are you right now in the list when you are out of this while loop?
			// on the last node
			currentNode.next = newNode;
		}
	}
	
	
	
	// write a method called remove that takes a value as parameter
	// removes the first node that has the value from the list
	public void remove (int value) {
		// de-reference the node with the value from the list
		
		// special cases/ base cases/ edge cases
		// 1. what if I remove the head?
		//  reassign the head to point to head.next
		
		// 2. what if I remove the tail?
		//  find the second to the last node, assign that node.next = null
		
		// 3. what if I remove something in between?
		//  find the node before the one you want to delete
		//  reassign the reference so that currentNode.next = currentNode.next.next
		
		// 2 and 3 can be combined into 1
		
		// 1 edge case -> removing the head
		// 1 general case -> find the node before the one you want to delete
							// currentNode.next = currentNode.next.next		
	}
	
	
	// write a toString method that returns a string representation of this list
	// 1 -> 2 -> 3 -> 4
	
	/**
	 * use a local variable currentNode
	 * while currentNode is not null
	 * 	print the value at the current node
	 * 	move to the next node
	 * 	if I am not at the last node
	 * 		add -> after the value
	 * 	otherwise
	 * 		don't need to add
	 */
	
	public String toString() { //  method that eveyr object inherit from an abstract class
		// print a string representation of an object
		
		
		String str = "";
		
		LinkedNode currentNode = this.head;
		// if you need to access every single node
		// you probably will need to go until currentNode becomes null
		// if you only need to find the last node
		// you probably will only need to go until currentNode.next becomes null
		
		while (currentNode != null) {
			if (currentNode.next != null) {
				str += currentNode.value + " -> ";
			}
			else {
				str += currentNode.value;
			}
			
			currentNode = currentNode.next;
		}
		return str;
	}
	
	

}
