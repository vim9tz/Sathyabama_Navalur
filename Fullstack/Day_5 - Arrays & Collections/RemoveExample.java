import java.util.ArrayList;
public class RemoveExample {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(20);
    list.add(30);
    list.add(30);
    System.out.println("Original list: " + list);
    list.remove(1);                   // Removing the element at index 1
    list.remove(Integer.valueOf(30)); // Removing the element with value 30
    list.remove((Integer)20);         // Removing the element with value 20
    System.out.println("Updated list after removing element at index 1: " +
                       list);
  }
}
