package learning.programing.string;

public class LengthOfString {
    public static void main(String args[]) {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfStringWithCharArray(helloWorld));
        System.out.println("length of helloWorld string :" + getLengthOfString(helloWorld));
    }

    public static int getLengthOfStringWithCharArray(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }

    public static int getLengthOfString(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } catch (Exception e) {
        }
        return i;
    }
}
