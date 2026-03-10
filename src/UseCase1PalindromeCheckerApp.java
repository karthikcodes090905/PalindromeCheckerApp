import java.util.Scanner;
import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for(int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // Pop characters from stack
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if(input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}