import java.util.Scanner;

/**
 * 12_star_pattern_generator.java
 * Generates right-angled triangle and isosceles pyramid star patterns using nested loops.
 */
class _12_star_pattern_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of pattern (H): ");
        int h = sc.nextInt();

        System.out.println("\n--- Pattern 1: Right-Angled Triangle ---");
        for (int row = 1; row <= h; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 2: Isosceles Pyramid ---");
        for (int row = 1; row <= h; row++) {
            // Print leading spaces
            for (int space = 1; space <= (h - row); space++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
