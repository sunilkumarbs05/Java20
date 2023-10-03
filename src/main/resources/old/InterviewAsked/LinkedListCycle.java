package InterviewAsked;

import java.util.HashSet;

public class LinkedListCycle {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

		head.next.next.next.next.next.next = head.next.next;
		System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

		head.next.next.next.next.next.next = head.next.next.next;
		System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
	}
	
	static boolean hasCycle(Node h)
	 {
	     HashSet<Node> s = new HashSet<Node>();
	     while (h != null) {
	         // If we have already has this node
	         // in hashmap it means their is a cycle
	         // (Because you we encountering the
	         // node second time).
	         if (s.contains(h))
	             return true;

	         // If we are seeing the node for
	         // the first time, insert it in hash
	         s.add(h);

	         h = h.next;
	     }

	     return false;
	 }

}

 class Node {
	int value = 0;
	Node next;

	Node(int value) {
		this.value = value;
	}
	}
 
 
 