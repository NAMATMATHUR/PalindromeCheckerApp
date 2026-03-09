import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeUC6(String input) {
        if (input == null || input.isEmpty()) return false;

        String cleanInput = input.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : cleanInput.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker Application");

        System.out.print("Enter string (UC6 - Queue + Stack): ");
        String userInput = scanner.nextLine();

        boolean result = isPalindromeUC6(userInput);

        System.out.println("Is Palindrome: " + result);

        scanner.close();
    }
}