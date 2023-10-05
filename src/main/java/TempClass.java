//Keep whitspace same as input text and print the characters in reverse way
//Input: MY NAME IS ABC
//Output: CB ASIE MA NYM

// Array 1, 2, 2, 3, 3, 3, 4

// Return last index of given element x 3
public class TempClass {

    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 3, 3, 4};
        int number = 2;
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        int position = -1;

        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == number) {
                position = mid;
                break;
            }
            if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (position == -1) {
            System.out.println(" Element not found");
        } else {
            System.out.println("Element found at " + position);
        }
    }
}
