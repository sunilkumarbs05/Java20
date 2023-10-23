package learning.algorithm.queue;

public class GenricQueue<T> {

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public GenricQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(T data) {

        Node temp = new Node(data);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;

    }

    public T dequeue() {

        if (front == null)
            return null;

        T data = front.data;
        front = front.next;

        return data;
    }

    public void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        GenricQueue<Integer> queue = new GenricQueue<>();
        System.out.println("Display elements");
        queue.display();
        System.out.println("Push 10");
        queue.enqueue(10);
        System.out.println("-----------------");
        queue.display();
        System.out.println("\n Push 20, 30 ,40");
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Display elements");
        queue.display();
        System.out.println("Pop elements " + queue.dequeue());
        System.out.println("Display elements");
        queue.display();
    }


}
