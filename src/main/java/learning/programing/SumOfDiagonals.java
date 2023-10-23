package learning.programing;

public class SumOfDiagonals {

    public static void main(String[] args) {
        // Input integer array
        // Custom entries in an array
        int[][] b = {{8, 2, 13, 4},
                {9, 16, 17, 8},
                {1, 22, 3, 14},
                {15, 6, 17, 8}};

        // Passing the array as an argument to the
        // function defined above
        Sum_of_Diagonals(b, 4);
    }

    private static void Sum_of_Diagonals(int[][] b, int n) {
        int pd = 0;
        int sd = 0;

        for (int i = 0; i < n; i++) {
            pd += b[i][i];
            sd += b[i][n - (i + 1)];
        }
        System.out.println("Sum of diagonal first:%d second:%d".formatted(pd, sd));
    }
}
