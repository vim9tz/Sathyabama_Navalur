import java.util.Scanner;

/**
 * 01_number_sign_check.java
 * Program to check whether a number is positive, negative, or zero.
 */
class _01_number_sign_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
        sc.close();
    }
}
