public class MarksAverage {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        // Calculating the average of marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = (double)sum / marks.length;
        // Displaying the average of marks
        System.out.println("Average marks of students: " + average);
        // Using Enhanced for loop to calculate the average of marks
        int sumEnhanced = 0;
        for (int i : marks) {
            sumEnhanced += i;
        }
        double averageEnhanced = (double)sumEnhanced / marks.length;
        System.out.println("Average marks of students (enhanced for loop): " + averageEnhanced);
    }
}
