import java.util.Scanner;

/**
 * 01_modular_utility_methods.java
 * Demonstrates static utility methods for math and string operations.
 */
class _01_modular_utility_methods {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to Java Fullstack Course.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(getGreeting(name));

        System.out.print("Enter a number to check even/odd: ");
        int num = sc.nextInt();
        System.out.println(num + " is Even? " + isEven(num));

        System.out.print("Enter three integers (space-separated): ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println("Maximum among three numbers is: " + findMax(x, y, z));
        sc.close();
    }
}
