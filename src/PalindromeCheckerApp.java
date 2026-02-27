<<<<<<< HEAD
import java.util.Scanner;
=======
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Application");
    }
>>>>>>> feature/UC1

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Application");
    }

    public static void main(String[] args) {

        // UC1: Welcome message
        System.out.println("Welcome to Palindrome Checker Application");

        // UC3: Palindrome check using user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Case-insensitive palindrome check
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        scanner.close();
    }
}