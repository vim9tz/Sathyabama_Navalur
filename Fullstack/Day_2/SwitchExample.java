public class SwitchExample {
  public static void main(String[] args) {
    int day = 3;
    String dayName;

    switch (day) {
    case 1:
      dayName = "Monday";
      System.out.println("The day is: " + dayName);
      break;
    case 2:
      dayName = "Tuesday";
      System.out.println("The day is: " + dayName);
      break;
    case 3:
      dayName = "Wednesday";
      System.out.println("The day is: " + dayName);
      break;
    case 4:
      dayName = "Thursday";
      System.out.println("The day is: " + dayName);
      break;
    case 5:
      dayName = "Friday";
      System.out.println("The day is: " + dayName);
      break;
    case 6:
      dayName = "Saturday";
      System.out.println("The day is: " + dayName);
      break;
    case 7:
      dayName = "Sunday";
      System.out.println("The day is: " + dayName);
      break;
    default:
      dayName = "Invalid day";
      System.out.println("The day is: " + dayName);
    }
  }
}