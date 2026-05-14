public class Q12_EvenSeriesToN {
    public static void main(String[] args) {
        int n = 10; 
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i);
            if (i != n) System.out.print(", ");
        }
        System.out.println();
    }
}
