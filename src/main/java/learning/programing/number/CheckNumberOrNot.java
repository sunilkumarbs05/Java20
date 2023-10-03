package learning.programing.number;

public class CheckNumberOrNot {

    public static void main(String[] args) {
        String value = "1,000";
        if (isNumber(value)) {
            System.out.println("It's number");
        } else {
            System.out.println("It's not number");
        }
    }

    static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

}
