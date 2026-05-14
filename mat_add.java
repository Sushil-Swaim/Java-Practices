public class mat_add {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
