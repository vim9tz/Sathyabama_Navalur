import java.util.Scanner;

/**
 * 02_interactive_modular_calculator.java
 * Modular calculator using distinct static methods for each operation.
 */
class _02_interactive_modular_calculator {

    public static void showTitle() {
        System.out.println("====================================");
        System.out.println("    MODULAR JAVA CALCULATOR SYSTEM  ");
        System.out.println("====================================");
    }

    public static void showMenu() {
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
    }

    public static double addition(double a, double b) { return a + b; }
    public static double subtraction(double a, double b) { return a - b; }
    public static double multiplication(double a, double b) { return a * b; }
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showTitle();

        while (true) {
            showMenu();
            System.out.print("Enter choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the Modular Calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select 1 to 5.\n");
                continue;
            }

            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();

            double result = switch (choice) {
                case 1 -> addition(n1, n2);
                case 2 -> subtraction(n1, n2);
                case 3 -> multiplication(n1, n2);
                case 4 -> division(n1, n2);
                default -> 0;
            };

            if (!Double.isNaN(result)) {
                System.out.println("Calculated Result: " + result);
            }
            System.out.println();
        }
        sc.close();
    }
}
