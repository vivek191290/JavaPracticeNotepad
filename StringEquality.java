public class StringEquality {
    public static void main(String[] args) {
        String str1 = "Hello, world!";
        String str2 = "hello, World!";

        
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

    }
}