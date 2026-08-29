// https://github.com/vim9tz/sathyabama_navalur
public class MarksArray {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

    // Displaying the marks of students using individual print statements
        System.out.println("Marks of students:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the marks of students using a loop
        for (int i = 0; i < marks.length; i++) {
        System.out.println("Mark of student " + (i + 1) + ": " + marks[i]);
        }
// https://meet.google.com/uex-iezb-wnk
        // Displaying the marks of students using an enhanced for loop
        System.out.println("Marks of students using enhanced for loop:");
        for (int m : marks) {
            System.out.println(m);
        }
    }
}
