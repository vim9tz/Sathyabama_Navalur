import java.util.Scanner;

/**
 * 06_multiplication_table.java
 * Generates a multiplication table for a given number up to a specified limit using a for loop.
 */
class _06_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int num = sc.nextInt();
        System.out.print("Enter limit (e.g., 10): ");
        int limit = sc.nextInt();

        System.out.println("--- Multiplication Table of " + num + " ---");
        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d x %2d = %d\n", num, i, (num * i));
        }
        sc.close();
    }
}
