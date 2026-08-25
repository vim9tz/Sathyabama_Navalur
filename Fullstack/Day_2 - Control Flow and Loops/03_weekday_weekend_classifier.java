import java.util.Scanner;

/**
 * 03_weekday_weekend_classifier.java
 * Classifies a day number (1-7) into Weekday or Weekend using grouped switch cases.
 */
class _03_weekday_weekend_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1 for Mon, 7 for Sun): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Type: Weekday (Work Day)");
                break;
            case 6: case 7:
                System.out.println("Type: Weekend (Rest Day)");
                break;
            default:
                System.out.println("Invalid day code entered.");
                break;
        }
        sc.close();
    }
}
