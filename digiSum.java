public class digiSum {
    public static void main(String[] args) {
        int number = 1234;
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Number        : " + number);
        System.out.println("Sum of Digits : " + sum);
    }
}
