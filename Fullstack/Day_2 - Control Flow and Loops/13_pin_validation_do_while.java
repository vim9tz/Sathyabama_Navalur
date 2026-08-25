import java.util.Scanner;

/**
 * 13_pin_validation_do_while.java
 * ATM PIN verification retry system utilizing a do-while loop.
 */
class _13_pin_validation_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CORRECT_PIN = 9876;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean accessGranted = false;

        do {
            attempts++;
            System.out.print("Enter 4-digit PIN (Attempt " + attempts + "/" + MAX_ATTEMPTS + "): ");
            int enteredPin = sc.nextInt();

            if (enteredPin == CORRECT_PIN) {
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect PIN.");
            }
        } while (attempts < MAX_ATTEMPTS);

        System.out.println("\n--- SECURITY STATUS ---");
        if (accessGranted) {
            System.out.println("Access Granted! Welcome to your Account.");
        } else {
            System.out.println("Card Blocked! Maximum retry attempts exceeded.");
        }
        sc.close();
    }
}
