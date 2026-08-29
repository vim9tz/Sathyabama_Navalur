import java.util.ArrayList;
public class UpdateExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        // Displaying the original list
        System.out.println("Original list: " + list);
        // Updating the element at index 1
        list.add(1, 25);
        // 10 25 20 30
        list.set(1, 5);
        // 10 5 20 30
        System.out.println("Updated list: " + list);
    }
}
