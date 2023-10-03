package learning;

public class FirstLastIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5};
        int firstIndex = -1, lastIndex = -1;
        int left = 0, right = arr.length - 1;
        int find = 2;


        while (left <= right && (firstIndex == -1 || lastIndex == -1)) {
            if (arr[left] == find && firstIndex == -1) {
                firstIndex = left;
            } else {
                left++;
            }

            if (arr[right] == find && lastIndex == -1) {
                lastIndex = right;
            } else {
                right--;
            }
        }

        System.out.println("2 found in the firstIndex:%d and lastIndex:%d".formatted(firstIndex + 1, lastIndex + 1));
    }
}
