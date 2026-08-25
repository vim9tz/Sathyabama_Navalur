import java.util.Scanner;

/**
 * 07_sum_and_count_even_numbers.java
 * Uses counter and accumulator loop patterns to count and sum even numbers in a user-defined range.
 */
class _07_sum_and_count_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("--- Results ---");
        System.out.println("Total Even Numbers Found: " + count);
        System.out.println("Sum of Even Numbers: " + sum);
        sc.close();
    }
}
