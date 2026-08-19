import java.util.Scanner;

/**
 * 07_swap_using_temporary_variable.java
 * Swaps two numbers using an auxiliary temporary variable.
 */
class _07_swap_using_temporary_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
