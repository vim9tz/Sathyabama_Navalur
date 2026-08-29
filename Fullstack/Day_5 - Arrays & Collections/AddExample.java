import java.util.ArrayList;

public class AddExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // Adding an element at index 1
        list.add(0, 5);  // Adding an element at index 0
        System.out.println(list);
    }
}
