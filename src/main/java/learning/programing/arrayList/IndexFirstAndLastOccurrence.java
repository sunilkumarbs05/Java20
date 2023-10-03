package learning.programing.arrayList;

public class IndexFirstAndLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5};
        int input = 2;
        int left = 0, right = arr.length - 1;
        int firstIndex = -1, lastIndex = -1;

        while (left < right && (firstIndex == -1 || lastIndex == -1)) {

            if (arr[left] == input) {
                firstIndex = left;
            } else {
                left++;
            }

            if (arr[right] == input) {
                lastIndex = right;
            } else {
                right--;
            }

        }

        System.out.println("%d found in the firstIndex:%d and lastIndex:%d".formatted(input, firstIndex + 1, lastIndex + 1));

    }
}
