package learning;

public class Application {
    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node currentNode) {
        // For first node, previousNode will be null
     Node reverse = null;
     Node temp;
        while (currentNode != null) {
            temp = currentNode;
            currentNode = currentNode.next;
            temp.next = reverse;
            reverse = temp;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Application list = new Application();
        // Creating a linked list
        Node head = new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList(head);
        //Reversing LinkedList
        Node reverseHead = reverseLinkedList(head);
        System.out.println("After reversing");
        list.printList(reverseHead);

    }
}

