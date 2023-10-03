package learning.programing;

public class Pyramid {
    public static void main(String[] args) {
        int row = 5;
        for (int j = 1; j <= row; j++) {
            print(row - j, " ");
            print(j, j + " ");
            System.out.println("");
        }

    }

    public static void print(int times, String value) {
        for (int i = 0; i < times; i++) {
            System.out.print(value);
        }
    }
}
