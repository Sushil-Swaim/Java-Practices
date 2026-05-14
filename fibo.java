public class fibo {
    public static void main(String[] args) {
        int n = 10; 
        int first = 0, second = 1;
        System.out.print("Fibonacci Series (" + n + " terms): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            if (i != n) System.out.print(", ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
