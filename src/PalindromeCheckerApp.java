import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeQueueStack {

    public static boolean isPalindromeUC6(String input) {
        if (input == null || input.isEmpty()) return false;

        // Normalize input (ignore case)
        String cleanInput = input.toLowerCase();

        // Step 1: Initialize Data Structures
        Queue<Character> queue = new LinkedList<>(); // Queue (FIFO)
        Stack<Character> stack = new Stack<>();      // Stack (LIFO)

        // Step 2: Fill both structures
        for (char c : cleanInput.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // Step 3: Compare Dequeue (Original) vs Pop (Reverse)
        while (!stack.isEmpty()) {
            // dequeue() gets the first char, pop() gets the last char
            if (!queue.remove().equals(stack.pop())) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched symmetrically
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string (UC6 - Queue + Stack): ");
        String userInput = scanner.nextLine();

        boolean result = isPalindromeUC6(userInput);
        System.out.println("Is Palindrome: " + result);

        scanner.close();
    }
}