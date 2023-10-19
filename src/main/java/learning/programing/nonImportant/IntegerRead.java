package learning.programing.nonImportant;

import java.util.Scanner;

public class IntegerRead {
    public static void main(String[] args) {
        System.out.println("Enter a integer value");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        Integer value1 = scanner.nextInt();
        System.out.println("Entered value  :"+value+" "+value1);
    }
}
