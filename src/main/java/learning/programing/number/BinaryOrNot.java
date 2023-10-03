package learning.programing.number;

public class BinaryOrNot {
    static void isBinaryOrNot(int number) {
        boolean isBinary = true;

        int copyOfNumber = number;

        while (copyOfNumber != 0) {
            int temp = Math.abs(copyOfNumber % 10); //Gives last digit of the number

            if (temp == 1 || temp == 0) {
                //Removes last digit from the number
                copyOfNumber = copyOfNumber / 10;
            } else {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }

    public static void main(String[] args) {
        isBinaryOrNot(-128956);
        isBinaryOrNot((101110));
        isBinaryOrNot((42578));
        isBinaryOrNot((-10110101));
    }

}
