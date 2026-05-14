public class nthSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = 5; 
        int sum = 0;
        System.out.print("First " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Sum of first " + n + " elements = " + sum);
    }
}
