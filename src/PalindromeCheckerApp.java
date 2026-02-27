import java.util.Stack;
import java.util.Scanner;

public class PalindromeStack {

    public static boolean isPalindromeUC5(String input) {
        if (input == null || input.isEmpty()) return false;

        // Optional: Normalize to lowercase for better accuracy
        String cleanInput = input.toLowerCase();

        // Step 1: Initialize the Stack
        Stack<Character> stack = new Stack<>();

        // Step 2: Push all characters onto the stack
        for (int i = 0; i < cleanInput.length(); i++) {
            stack.push(cleanInput.charAt(i));
        }

        // Step 3: Pop and compare with the original string
        for (int i = 0; i < cleanInput.length(); i++) {
            // The stack pops in reverse order (LIFO)
            if (cleanInput.charAt(i) != stack.pop()) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC5 - Stack): ");
        String userInput = scanner.nextLine();

        if (isPalindromeUC5(userInput)) {
            System.out.println("Result: '" + userInput + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + userInput + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}