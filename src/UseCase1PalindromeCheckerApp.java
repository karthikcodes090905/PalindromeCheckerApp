import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        // Compare characters from both ends
        while(start < end) {
            if(characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}