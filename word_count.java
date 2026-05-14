public class word_count {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        if (str == null || str.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }
        String[] words = str.trim().split("\\s+");
        System.out.println("String    : " + str);
        System.out.println("Word count: " + words.length);
    }
}
