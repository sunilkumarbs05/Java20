package learning.practice;

import java.util.Stack;

public class PracticeGround {


    public static void main(String[] args) {

        String value = "(){}]";

        if (areBracketsBalanced(value))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

    }

    private static boolean areBracketsBalanced(String value) {
        char arr[] = value.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char temp;
            switch (arr[i]) {
                case ')':
                    temp = stack.pop();
                    if (temp != '(')
                        return false;
                    break;
                case ']':
                    temp = stack.pop();
                    if (temp != '[')
                        return false;
                    break;
                case '}':
                    temp = stack.pop();
                    if (temp != '{')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();
    }

}
