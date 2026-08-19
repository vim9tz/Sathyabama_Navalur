import java.util.Scanner;

/**
 * 08_swap_without_temporary_variable.java
 * Swaps two numbers using arithmetic addition and subtraction.
 */
class _08_swap_without_temporary_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
