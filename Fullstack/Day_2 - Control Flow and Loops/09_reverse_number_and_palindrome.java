import java.util.Scanner;

/**
 * 09_reverse_number_and_palindrome.java
 * Reverses an integer using a while loop and determines if it is a palindrome.
 */
class _09_reverse_number_and_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);

        if (original == reversed) {
            System.out.println("Result: " + original + " is a Palindrome.");
        } else {
            System.out.println("Result: " + original + " is NOT a Palindrome.");
        }
        sc.close();
    }
}
