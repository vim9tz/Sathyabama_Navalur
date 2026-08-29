import java.util.Scanner;
public class UserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Displaying the elements of the array using individual print statements
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
