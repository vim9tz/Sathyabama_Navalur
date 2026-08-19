import java.util.Scanner;

/**
 * 10_pass_or_fail.java
 * Evaluates pass or fail condition based on marks (marks >= 50).
 */
class _10_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
