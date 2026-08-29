import java.util.ArrayList;
public class RemoveValueExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Priya");
        names.add("Rahul");

        names.remove("Priya");

        System.out.println(names);
    }
}