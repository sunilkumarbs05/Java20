import java.util.HashSet;
import java.util.Set;

public class TestClass {
	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		System.out.println("LinkedList has cycle:" + TestClass.hasCycle(head));
		head.next.next.next.next.next.next = head.next.next;
		System.out.println("LinkedList has cycle:" + TestClass.hasCycle(head));
		head.next.next.next.next.next.next = head.next.next;
		System.out.println("LinkedList has cycle:" + TestClass.hasCycle(head));
	}

	public static Boolean hasCycle(Node head) {
		Set<Node> set = new HashSet<>();

		while (head != null) {

			if (set.contains(head)) {
				return Boolean.TRUE;
			}
			set.add(head);
			head = head.next;
		}

		return Boolean.FALSE;
	}
}

class Node {

	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}