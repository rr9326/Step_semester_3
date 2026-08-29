package week_1.class_problems;

import java.util.Scanner;

public class PalindromeChecker {
      // Approach 1: Iterative
    public static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    // Approach 2: Recursive
    public static boolean isPalindromeRecursive(String text) {

        // Base case
        if (text.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        // Check remaining substring
        return isPalindromeRecursive(
                text.substring(1, text.length() - 1)
        );
    }


    // Approach 3: Array Reversal
    public static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);

        return text.equals(reversed);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Make comparison case-insensitive
        text = text.toLowerCase();

        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text);
        boolean arrayReversal = isPalindromeArrayReversal(text);

        System.out.println("\nIterative Approach: " + iterative);
        System.out.println("Recursive Approach: " + recursive);
        System.out.println("Array Reversal Approach: " + arrayReversal);

        sc.close();
    }
}
