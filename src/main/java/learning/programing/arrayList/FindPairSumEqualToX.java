package learning.programing.arrayList;

public class FindPairSumEqualToX {

    public static void main(String[] args) {
        int arr[] = {-40, -5, 1, 3, 6, 7, 8, 20};
        int x = 15;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
                if (tempSum == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
