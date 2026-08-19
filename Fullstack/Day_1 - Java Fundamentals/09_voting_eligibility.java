import java.util.Scanner;

/**
 * 09_voting_eligibility.java
 * Evaluates voting eligibility based on age (age >= 18).
 */
class _09_voting_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        sc.close();
    }
}
