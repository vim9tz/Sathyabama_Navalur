import java.util.Scanner;

/**
 * 13_login_validation.java
 * Multi-level login system with username/password validation, retry, and reset menus.
 */
class _13_login_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String validUsername = "admin";
        String validPassword = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.equals(validUsername)) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals(validPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid password.");
                System.out.println("1. Retry Password");
                System.out.println("2. Reset Password");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Clear leftover newline

                       if (choice == 1) {
                    System.out.print("Enter password again: ");
                    String retryPassword = sc.nextLine();
                    if (retryPassword.equals(validPassword)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid password again.");
                    }
                } else if (choice == 2) {
                    System.out.print("Enter new password: ");
                    String newPassword = sc.nextLine();
                    if (newPassword.isEmpty()) {
                        System.out.println("Password cannot be empty.");
                    } else {
                        validPassword = newPassword;
                        System.out.println("Password reset successful. Please login again.");
                        System.out.print("Enter new password to login: ");
                        String loginPassword = sc.nextLine();
                        if (loginPassword.equals(validPassword)) {
                            System.out.println("Login successful!");
                        } else {
                            System.out.println("Invalid password.");
                        }
                    }
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Invalid username.");
        }

        sc.close();
    }
}
