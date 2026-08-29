import java.util.ArrayList;

public class ClearExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Priya");

        System.out.println("Before = " + names);

        names.clear();

        System.out.println("After = " + names);
    }
}