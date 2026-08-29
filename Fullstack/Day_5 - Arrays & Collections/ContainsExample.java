import java.util.ArrayList;

public class ContainsExample {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Arun");
    names.add("Baby");
    names.add("Charles");
    names.add("Divya");
    names.add("Elsa");
    if(names.contains("Divya")){
        System.out.println("Student Found.");
    } else {
        System.out.println("Student Not Found.");
    }
  }
}
