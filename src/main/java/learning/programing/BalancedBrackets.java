package learning.programing;

import java.util.Stack;

public class BalancedBrackets {

    static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    if (stack.pop() != '(')
                        return false;
                    break;

                case '}':
                    if (stack.pop() != '{')
                        return false;
                    break;

                case ']':
                    if (stack.pop() != '[')
                        return false;
                    break;
            }
        }/**/

        // Check Empty Stack
        return stack.isEmpty();
    }

    // Driver code
    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}
