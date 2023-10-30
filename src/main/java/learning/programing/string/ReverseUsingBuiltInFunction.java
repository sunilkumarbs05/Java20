package learning.programing.string;

public class ReverseUsingBuiltInFunction {

    public static void main(String[] args) {
        System.out.println(reverseString_1("my name is Sunil"));
        System.out.println(reverseString_2("I am sonoo jaiswal"));
    }

    public static String reverseString_1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseString_2(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}
