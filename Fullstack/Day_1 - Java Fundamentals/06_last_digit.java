import java.util.Scanner;

/**
 * 06_last_digit.java
 * Extracts the last digit of an integer using modulo 10 arithmetic.
 */
class _06_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is: " + lastDigit);

        sc.close();
    }
}
