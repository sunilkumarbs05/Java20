package learning.clarification;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        if (s1 == s2) {
            System.out.println("Both references are equal");
        } else {
            System.out.println("Both references are not equal");
        }
        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
