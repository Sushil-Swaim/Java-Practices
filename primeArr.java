public class primeArr {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 13, 17, 20, 23, 25, 29, 30};
        int count = 0;
        System.out.print("Array : ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        System.out.print("Primes: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of Prime Numbers : " + count);
    }
}
