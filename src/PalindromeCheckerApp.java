public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome message
        System.out.println("Welcome to Palindrome Checker Application");

        // UC2: Hardcoded palindrome
        String word = "madam";  // Hardcoded input
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}