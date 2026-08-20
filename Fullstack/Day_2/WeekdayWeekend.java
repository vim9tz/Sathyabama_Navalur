import java.util.Scanner;

public class WeekdayWeekend {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    String dayType;

    switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      dayType = "Weekday";
      System.out.println("The day is: " + dayType);
      break;
    case 6:
    case 7:
      dayType = "Weekend";
      System.out.println("The day is: " + dayType);
      break;
    default:
      dayType = "Invalid day";
      System.out.println("The day is: " + dayType);
    }
    sc.close();
  }
}
