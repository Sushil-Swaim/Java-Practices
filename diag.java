public class diag {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sumPrimary = 0;
        int sumSecondary = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sumPrimary += matrix[i][i];
            sumSecondary += matrix[i][n - 1 - i];
        }
        System.out.println("Sum of Primary Diagonal   : " + sumPrimary);
        System.out.println("Sum of Secondary Diagonal : " + sumSecondary);
    }
}
