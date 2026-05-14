public class sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Before Sorting: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("After Sorting : ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
