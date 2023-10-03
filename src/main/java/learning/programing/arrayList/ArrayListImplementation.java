package learning.programing.arrayList;

import java.util.Arrays;

public class   ArrayListImplementation {

    public static void main(String[] args) {
        ArrayListImp arrayListImp = new ArrayListImp();
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

class ArrayListImp {
    private Object store[];
    private int size;

    public ArrayListImp() {
        this.store = new Object[5];
        this.size = 0;
    }

    public Object get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return store[index];
    }

    public boolean add(Object object) {
        if (size >= store.length - 2) {
            resize();
            System.out.println("Resize happen : now size is" + store.length);
        }
        store[size++] = object;
        return true;
    }

    public Object remove(int index) {

        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        Object temp = store[index];
        while (index < size) {
            store[index] = store[++index];
            store[index] = null;
        }
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (Object object : store) {
            System.out.print(object + " ");
        }
    }

    private void resize() {
        store = Arrays.copyOf(store,store.length + store.length / 2);
    }
}

