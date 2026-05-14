public class altrunatingSeries {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.print("+" + i);
            } else {
                sum -= i;
                System.out.print("-" + i);
            }
            if (i != n) System.out.print(" ");
        }
        System.out.println();
        System.out.println("Sum of series = " + sum);
    }
}
