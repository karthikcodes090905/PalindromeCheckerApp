import java.util.Scanner;

class PalindromeAlgorithms {

    // Algorithm 1: Reverse String
    public boolean checkUsingReverse(String text) {
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        return processed.equals(reversed);
    }

    // Algorithm 2: Character Array Comparison
    public boolean checkUsingCharArray(String text) {
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        char[] chars = processed.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Algorithm 3: Recursion
    public boolean checkUsingRecursion(String text) {
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(processed, 0, processed.length() - 1);
    }

    private boolean recursiveCheck(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursiveCheck(str, start + 1, end - 1);
    }
}

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeAlgorithms checker = new PalindromeAlgorithms();

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Palindrome Algorithm:");
        System.out.println("1. Reverse String Method");
        System.out.println("2. Character Array Comparison");
        System.out.println("3. Recursion");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        boolean result = false;

        switch (choice) {
            case 1:
                result = checker.checkUsingReverse(input);
                System.out.println("Algorithm Selected: Reverse String Method");
                break;

            case 2:
                result = checker.checkUsingCharArray(input);
                System.out.println("Algorithm Selected: Character Array Comparison");
                break;

            case 3:
                result = checker.checkUsingRecursion(input);
                System.out.println("Algorithm Selected: Recursion");
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
                scanner.close();
                return;
        }

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}