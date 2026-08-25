import java.util.Scanner;

/**
 * 10_prime_number_check.java
 * Optimized prime number checker using for loop and break statement.
 */
class _10_prime_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (> 1): ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Early loop exit upon finding a divisor
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
        sc.close();
    }
}
