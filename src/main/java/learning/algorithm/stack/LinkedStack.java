package learning.algorithm.stack;

import learning.practice.LinkedLIstStackPractice;

public class LinkedStack<T> {

    private class Node {

        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node top;

    public void push(T data) {
        top = new Node(data, top);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (top == null) {
            return null;
        } else {
            T value = top.data;
            top = top.next;
            return value;
        }
    }

    public T peek() {
        if (top == null)
            return null;
        else
            return top.data;
    }

    public int size() {
        int size = 0;
        Node temp = top;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack();
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Stack isEmpty : " + stack.isEmpty());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack display :");
        stack.display();
        System.out.println("Push 10");
        stack.push(10);
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Stack isEmpty : " + stack.isEmpty());
        System.out.println("Stack display :");
        stack.display();

        System.out.println("Push 20");
        stack.push(20);
        System.out.println("Stack display :");
        stack.display();
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
    }
}