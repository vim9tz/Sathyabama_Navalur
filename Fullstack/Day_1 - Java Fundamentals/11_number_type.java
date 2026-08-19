import java.util.Scanner;

/**
 * 11_number_type.java
 * Classifies an input number as Positive, Negative, or Zero.
 */
class _11_number_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
