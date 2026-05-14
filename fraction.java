public class fraction {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0.0;
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
            System.out.print(i + "/" + (i + 1));
            if (i != n) System.out.print(" + ");
        }
        System.out.println();
        System.out.printf("Sum = %.4f%n", sum);
    }
}
