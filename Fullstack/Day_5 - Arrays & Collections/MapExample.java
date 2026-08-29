import java.util.HashMap;
public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> employees =
                new HashMap<>();
        employees.put(101, "Arun");
        employees.put(102, "Priya");
        employees.put(103, "Rahul");
        System.out.println(employees);
        // Read the value using key
        System.out.println(employees.get(102));
        System.out.println(employees.containsKey(101));
        System.out.println(employees.containsValue("Arun"));
    }
}