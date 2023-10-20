package learning.algorithm.stack;

public class Stack {
    int arr[];
    int length;
    int index = -1;

    public Stack() {
        arr = new int[10];
        length = 10;
    }

    public void push(int value) {
        if (index == length) {
            resize();
        }
        arr[++index] = value;
    }

    public int pop() {
        if (index == -1) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        int value = arr[index];
        arr[index] = 0;
        index--;
        return value;
    }

    public void resize() {
        int temp[] = new int[length + length];
        System.arraycopy(arr, 0, temp, 0, length);
        length = length + length;
    }

    public int size() {
        return index+1;
    }

    public void display() {
        for (int i =0; i<=index;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
//        System.out.println("Stack size is"+stack.size());
//        stack.push(10);
//        System.out.println("Stack size after push 10 is "+stack.size());
//        stack.display();
//
//        stack.push(20);
////        System.out.println(stack.pop());
//        System.out.println("Stack size pop"+stack.size());
//        stack.push(30);

//        stack.display();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("\n pop "+stack.pop());
        stack.display();
    }

}
