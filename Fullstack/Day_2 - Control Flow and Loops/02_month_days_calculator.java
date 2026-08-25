import java.util.Scanner;

/**
 * 02_month_days_calculator.java
 * Calculates days in a month using modern/traditional switch statements and leap year logic.
 */
class _02_month_days_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                yield isLeap ? 29 : 28;
            }
            default -> -1;
        };

        if (days == -1) {
            System.out.println("Invalid month number entered!");
        } else {
            System.out.println("Days in month " + month + " for year " + year + ": " + days);
        }
        sc.close();
    }
}
