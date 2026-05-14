public class sum1 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("n   = " + n);
        System.out.println("Sum = 1 + 2 + 3 + ... + " + n + " = " + sum);
        int formula = n * (n + 1) / 2;
        System.out.println("Formula check (n*(n+1)/2) = " + formula);
    }
}
