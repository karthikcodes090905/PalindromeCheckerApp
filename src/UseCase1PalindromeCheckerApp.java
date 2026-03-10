import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack for LIFO
        Stack<Character> stack = new Stack<>();

        // Queue for FIFO
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        String lifoResult = "";
        String fifoResult = "";

        // LIFO using Stack
        while (!stack.isEmpty()) {
            lifoResult = lifoResult + stack.pop();
        }

        // FIFO using Queue
        while (!queue.isEmpty()) {
            fifoResult = fifoResult + queue.remove();
        }

        System.out.println("Original String : " + input);
        System.out.println("LIFO (Stack)    : " + lifoResult);
        System.out.println("FIFO (Queue)    : " + fifoResult);

        scanner.close();
    }
}