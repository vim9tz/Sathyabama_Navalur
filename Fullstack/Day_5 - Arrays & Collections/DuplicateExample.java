import java.util.HashSet;

public class DuplicateExample {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("arun@gmail.com");
        emails.add("rahul@gmail.com");
        emails.add("priya@gmail.com");

        System.out.println(
                emails.add("bob@gmail.com")
        );

        System.out.println(
                emails.add("arun@gmail.com")
        );
    }
}