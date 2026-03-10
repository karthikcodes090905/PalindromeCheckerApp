import java.util.Scanner;

class PalindromePerformance {

    public boolean checkUsingReverse(String text) {
        String processed = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        return processed.equals(reversed);
    }

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
        PalindromePerformance checker = new PalindromePerformance();

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");
        System.out.println(" UC13: Performance Comparison");
        System.out.println("===================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long startTime1 = System.nanoTime();
        boolean result1 = checker.checkUsingReverse(input);
        long endTime1 = System.nanoTime();
        long reverseTime = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        boolean result2 = checker.checkUsingCharArray(input);
        long endTime2 = System.nanoTime();
        long charArrayTime = endTime2 - startTime2;

        long startTime3 = System.nanoTime();
        boolean result3 = checker.checkUsingRecursion(input);
        long endTime3 = System.nanoTime();
        long recursionTime = endTime3 - startTime3;

        System.out.println("\nPerformance Comparison:");
        System.out.println("1. Reverse String Method       : " + result1 + " | Time = " + reverseTime + " ns");
        System.out.println("2. Character Array Comparison  : " + result2 + " | Time = " + charArrayTime + " ns");
        System.out.println("3. Recursion Method            : " + result3 + " | Time = " + recursionTime + " ns");

        System.out.println("\nObservation:");
        System.out.println("Character Array Comparison is usually faster because it avoids creating extra strings.");
        System.out.println("Reverse String method may be slower due to repeated string concatenation.");
        System.out.println("Recursion is elegant but may use extra function-call overhead.");

        scanner.close();
    }
}