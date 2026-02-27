import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence to check: ");
        String input = scanner.nextLine();

        // Clean input: remove non-alphanumeric characters & lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // ---------- UC7: Deque-Based Palindrome Check ----------
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : cleaned.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome (Deque Optimized)!");
        } else {
            System.out.println("It is NOT a Palindrome (Deque Optimized)!");
        }

        scanner.close();
    }
}