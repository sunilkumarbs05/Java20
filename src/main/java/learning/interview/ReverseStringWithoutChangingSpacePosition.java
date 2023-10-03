package learning.interview;

public class ReverseStringWithoutChangingSpacePosition {
    public static void main(String[] args) {
        String input = "MY NAME IS ABC";

        char array[] = input.toCharArray();
        int leftIndex = 0, rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            if (array[leftIndex] != ' ' && array[rightIndex] != ' ') {
                char temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            } else if (array[leftIndex] == ' ') {
                leftIndex++;
            } else if (array[rightIndex] == ' ') {
                rightIndex--;
            }
        }
        System.out.println(String.valueOf(array));
    }
}
