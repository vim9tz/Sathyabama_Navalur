import java.util.Scanner;

/**
 * 08_sum_of_digits.java
 * Extracts digits from an integer using a while loop and calculates their sum.
 */
class _08_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int originalNum = num;

        int sum = 0;
        int temp = Math.abs(num); // Handle negative numbers safely

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits for " + originalNum + " is: " + sum);
        sc.close();
    }
}
