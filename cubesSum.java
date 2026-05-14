public class cubesSum {
    public static void main(String[] args) {
        int number = 123;
        int temp = number;
        int sumOfCubes = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sumOfCubes += digit * digit * digit;
            temp /= 10;
        }
        System.out.println("Number           : " + number);
        System.out.println("Sum of Cubes     : " + sumOfCubes);
    }
}
