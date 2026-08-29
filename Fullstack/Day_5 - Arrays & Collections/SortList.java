import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        // Default Ascending order
        Collections.sort(numbers);
        System.out.println("Ascending order = " + numbers);
        // Descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order = " + numbers);
    }
}