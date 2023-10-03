package learning.programing.arrayList;

public class SmallestLargestInList {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 5, 4, 3};
        int smallest = array[0], largest = array[0];
        for (int value : array) {
            if (smallest > value) {
                smallest = value;
            }

            if (largest < value) {
                largest = value;
            }
        }
        System.out.println("The smallest element is " + smallest);
        System.out.println("The largest element is  " + largest);
    }
}
