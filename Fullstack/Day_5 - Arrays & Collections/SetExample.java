import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("arun@gmail.com");
        emails.add("rahul@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("arun@gmail.com");

        System.out.println(emails);
    }
}