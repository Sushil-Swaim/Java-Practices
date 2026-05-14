import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isAnagram = Arrays.equals(arr1, arr2);
        }
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }
    }
}
