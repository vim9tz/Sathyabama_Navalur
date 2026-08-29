
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();

        original.add(10);
        original.add(20);
        original.add(30);
        original.add(40);

        ArrayList<Integer> copy = new ArrayList<>(original);

        System.out.println("Orignial = " + original);
        System.out.println("Copy = " + copy);
    }
}
