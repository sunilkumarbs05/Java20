package learning;

public class Stack {
    int arr[];
    int length;
    int index = 0;

    public Stack() {
        arr = new int[10];
        length = 10;
    }

    public void push(int value) {
        if (index == length) {
            resize();
        }
        arr[index++] = value;
    }

    public int pop() {
        if (index - 1 == 0) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        int value = arr[--index];
        arr[index] = 0;
        return value;
    }

    public void resize() {
        int temp[] = new int[length + length];
        System.arraycopy(arr, 0, temp, 0, length);
        length = length + length;
    }

    public int size() {
        return index;
    }
    public void display() {

    }



}
