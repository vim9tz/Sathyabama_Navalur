/**
 * 03_student_class_and_objects.java
 * Fundamentals of Class definition, attributes, instance methods, and Object creation.
 */
class StudentRecord {
    int rollNo;
    String name;
    double cgpa;

    void setDetails(int r, String n, double c) {
        rollNo = r;
        name = n;
        cgpa = c;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | CGPA: " + cgpa);
    }
}

class _03_student_class_and_objects {
    public static void main(String[] args) {
        // Instantiate Object 1
        StudentRecord s1 = new StudentRecord();
        s1.setDetails(101, "Aarav Sharma", 8.9);

        // Instantiate Object 2
        StudentRecord s2 = new StudentRecord();
        s2.setDetails(102, "Diya Patel", 9.4);

        System.out.println("--- Student Details ---");
        s1.displayDetails();
        s2.displayDetails();
    }
}
