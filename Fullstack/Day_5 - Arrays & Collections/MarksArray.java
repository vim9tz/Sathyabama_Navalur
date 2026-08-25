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

        // Displaying the marks of students using an enhanced for loop
        System.out.println("Marks of students using enhanced for loop:");
        for (int mark : marks) {
        System.out.println(mark);
        }
    }
}
