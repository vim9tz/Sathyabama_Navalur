
import java.util.ArrayList;

public class IndexExample{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Baby");
        names.add("Charles");
        names.add("Divya");
        names.add("Elsa");

        int index = names.indexOf("Elsa");

        System.out.println("Index of Charles = " + index);
    }
}