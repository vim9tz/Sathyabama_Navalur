import java.util.Scanner;

/**
 * 12_placement_eligibility.java
 * Evaluates placement eligibility using nested if checks for CGPA and Arrears.
 */
class _12_placement_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        if (cgpa >= 7.0) {
            System.out.print("Enter number of arrears: ");
            int arrears = sc.nextInt();
            if (arrears == 0) {
                System.out.println("You are eligible for placement.");
            } else {
                System.out.println("Not Eligible - clear arrears.");
            }
        } else {
            System.out.println("Not Eligible - low CGPA.");
        }

        sc.close();
    }
}
