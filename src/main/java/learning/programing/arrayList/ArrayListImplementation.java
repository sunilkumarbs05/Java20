package learning.programing.arrayList;

import java.util.Arrays;

public class ArrayListImplementation {

    public static void main(String[] args) {
        ArrayListImp<Integer> arrayListImp = new ArrayListImp<>();
        arrayListImp.add(10);
        arrayListImp.add(20);
        arrayListImp.add(30);
        arrayListImp.add(40);
        arrayListImp.add(50);
        arrayListImp.add(60);
        System.out.println("Size: " + arrayListImp.size());
        arrayListImp.display();

        arrayListImp.remove(4);
        System.out.println("Size: " + arrayListImp.size());
        arrayListImp.display();

        arrayListImp.remove(4);
        System.out.println("Size: " + arrayListImp.size());
        arrayListImp.display();
    }

}

class ArrayListImp<E> {
    private Object store[];
    private int size;

    public ArrayListImp() {
        this.store = new Object[5];
        this.size = 0;
    }

    public E get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return (E) store[index];
    }

    public boolean add(E object) {
        if (size == store.length - 1) {
            resize();
            System.out.println("Resize happen : now size is " + store.length);
        }
        store[size++] = object;
        return true;
    }

    public E remove(int index) {

        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        Object temp = store[index];
        while (index < size) {
            store[index] = store[++index];
        }
        store[index] = null;
        size--;
        return (E) temp;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i =0; i<size; i++) {
            System.out.print(store[i] + " ");
        }
        System.out.println("");
    }

    private void resize() {
        store = Arrays.copyOf(store, store.length + store.length / 2);
    }
}

