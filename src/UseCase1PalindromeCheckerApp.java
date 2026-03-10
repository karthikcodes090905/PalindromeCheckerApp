public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("===================================");

        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");

        // UC2 Hardcoded String
        String original = "madam";
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}