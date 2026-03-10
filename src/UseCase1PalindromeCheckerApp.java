import java.util.Scanner;

class PalindromeChecker {

    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    public boolean isPalindrome() {

        String processed = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;

        while (start < end) {

            if (processed.charAt(start) != processed.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);

        if (checker.isPalindrome()) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}