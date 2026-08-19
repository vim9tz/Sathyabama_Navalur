import java.util.Scanner;

/**
 * 05_minutes_to_hours.java
 * Converts total minutes into hours and remaining minutes.
 */
class _05_minutes_to_hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Minutes: ");
        int totalMinutes = sc.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + " minutes.");

        sc.close();
    }
}
