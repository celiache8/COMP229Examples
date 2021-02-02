package LinkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList();
		// l1.head -> null
		System.out.println(l1.size());
		
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		
		System.out.println(l1.size());
		System.out.println(l1); // l1.toString by default, java calls the toString method when printing objects
								// if you dont have a toString method, it will print the address
								
	}

}
