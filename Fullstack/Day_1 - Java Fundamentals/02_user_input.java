import java.util.Scanner;

/**
 * 02_user_input.java
 * Reads string input using java.util.Scanner.
 */
class _02_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
