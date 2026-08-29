import java.util.ArrayList;

public class EmptyExample {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();

    names.add("Arun");

    if (names.isEmpty()) {
      System.out.println("List is Empty");
    } else {
      System.out.println("List contains data");
    }
  }
}