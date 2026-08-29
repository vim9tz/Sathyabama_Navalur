import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("Java");

        System.out.println(courses);
    }
}

// add()       → Add
// get()       → Access
// set()       → Update
// remove()    → Delete
// contains()  → Search
// indexOf()   → Find index
// size()      → Number of elements
// clear()     → Remove everything
// isEmpty()   → Check empty