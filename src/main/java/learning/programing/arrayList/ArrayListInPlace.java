package learning.programing.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInPlace {
    public static void main(String args[]) {
        List<String> listOfFood = new ArrayList<>();
        listOfFood.add("Beans");
        listOfFood.add("Soup");
        listOfFood.add("Dark Chocolate");
        listOfFood.add("Yogurt");
        listOfFood.add("Sausage");
        listOfFood.add("Pure Vegetables");
        listOfFood.add("Nuts");
        System.out.println("Original ArrayList: " + listOfFood);
        int size = listOfFood.size();
        for (int i = 0; i < size / 2; i++) {
            final String food = listOfFood.get(i);
            listOfFood.set(i, listOfFood.get(size - i - 1));
            listOfFood.set(size - i - 1, food);
        }
        System.out.println("Reversed ArrayList: " + listOfFood);
    }

}
