public class palendrome {
    public static void main(String[] args) {
        int number = 121;
        int temp = number;
        int reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Number   : " + number);
        System.out.println("Reversed : " + reversed);
        if (number == reversed) {
            System.out.println(number + " is a PALINDROME.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}
