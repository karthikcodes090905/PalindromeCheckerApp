import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the processed string
        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        if (processed.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}