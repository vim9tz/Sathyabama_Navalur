import java.util.Scanner;

/**
 * 11_factorial_and_fibonacci.java
 * Calculates factorial of a number and generates the Fibonacci series up to N terms.
 */
class _11_factorial_and_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N for Factorial & Fibonacci: ");
        int n = sc.nextInt();

        // 1. Calculate Factorial
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " (" + n + "!): " + factorial);

        // 2. Generate Fibonacci Series
        System.out.print("Fibonacci Series (" + n + " terms): ");
        long first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + (i == n ? "" : ", "));
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
        sc.close();
    }
}
