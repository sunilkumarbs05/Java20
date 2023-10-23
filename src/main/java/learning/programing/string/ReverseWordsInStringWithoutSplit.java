package learning.programing.string;

//Input: Today is saturday
//Output: saturday is Today
public class ReverseWordsInStringWithoutSplit {
    public static void main(String[] args) {
        String value = "Hi Sunil Good morning";
        char arr[] = value.toCharArray();
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        reverse(arr, start, arr.length - 1);

        reverse(arr, 0, arr.length - 1);

        System.out.println(arr);

    }

    public static void reverse(char arr[], int start, int end) {
        char temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
