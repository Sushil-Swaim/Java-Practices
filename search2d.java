public class search2d {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target = 50;
        boolean found = false;
        System.out.println("Searching for " + target + " in the matrix...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("Element not found in the matrix.");
        }
    }
}
