public class primeRange {
    public static void main(String[] args) {
        int n = 10;
        int k = 50;
        System.out.println("Prime numbers between " + n + " and " + k + ":");
        for (int num = n; num <= k; num++) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
