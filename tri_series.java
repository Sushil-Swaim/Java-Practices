public class tri_series {
    public static void main(String[] args) {
        int n = 8; 
        int term = 0;
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            term += i;
            System.out.print(term);
            if (i != n) System.out.print(", ");
        }
        System.out.println();
    }
}
