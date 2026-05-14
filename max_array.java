public class max_array {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 90, 23, 56};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Array   : ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        System.out.println("Maximum : " + max);
    }
}
