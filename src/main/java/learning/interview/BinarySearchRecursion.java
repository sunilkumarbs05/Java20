package learning.interview;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length - 1;
        int search = 50;
        boolean flag = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == search) {
                flag = true;
                System.out.println("Element found in " + mid);
                break;
            }
            if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }
}
