import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();
        first.add(10);
        first.add(20);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(30);
        second.add(40);

        first.addAll(second);
        // second.addAll(first);

        System.out.println(first);
    }
}