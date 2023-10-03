package learning.programing.string;

public class RemoveLowerCaseString {
    public static void main(String[] args) {
        String input = "abc ABC 123 abc";
        String output = input.replaceAll("([a-z])", "");
        System.out.println("Input : " + input);
        System.out.println("Output :" + output);
    }
}
