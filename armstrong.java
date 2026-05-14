public class armstrong {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println("Number          : " + number);
        System.out.println("Number of digits: " + digits);
        System.out.println("Armstrong sum   : " + sum);
        if (number == sum) {
            System.out.println(number + " is an ARMSTRONG number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
