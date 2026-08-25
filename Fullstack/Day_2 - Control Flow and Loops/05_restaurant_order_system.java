import java.util.Scanner;

/**
 * 05_restaurant_order_system.java
 * Multi-level nested switch system for restaurant ordering and billing.
 */
class _05_restaurant_order_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Desserts");
        System.out.print("Select Category: ");
        int category = sc.nextInt();

        int itemPrice = 0;
        String itemName = "";

        switch (category) {
            case 1:
                System.out.println("--- Starters ---");
                System.out.println("1. Paneer Tikka (₹200)");
                System.out.println("2. Spring Roll (₹150)");
                System.out.print("Choose item: ");
                int starterChoice = sc.nextInt();
                switch (starterChoice) {
                    case 1: itemName = "Paneer Tikka"; itemPrice = 200; break;
                    case 2: itemName = "Spring Roll"; itemPrice = 150; break;
                    default: System.out.println("Invalid starter."); return;
                }
                break;

            case 2:
                System.out.println("--- Main Course ---");
                System.out.println("1. Veg Biryani (₹250)");
                System.out.println("2. Butter Naan with Paneer (₹300)");
                System.out.print("Choose item: ");
                int mainChoice = sc.nextInt();
                switch (mainChoice) {
                    case 1: itemName = "Veg Biryani"; itemPrice = 250; break;
                    case 2: itemName = "Butter Naan with Paneer"; itemPrice = 300; break;
                    default: System.out.println("Invalid main course."); return;
                }
                break;

            case 3:
                System.out.println("--- Desserts ---");
                System.out.println("1. Gulab Jamun (₹80)");
                System.out.println("2. Ice Cream (₹100)");
                System.out.print("Choose item: ");
                int dessertChoice = sc.nextInt();
                switch (dessertChoice) {
                    case 1: itemName = "Gulab Jamun"; itemPrice = 80; break;
                    case 2: itemName = "Ice Cream"; itemPrice = 100; break;
                    default: System.out.println("Invalid dessert."); return;
                }
                break;

            default:
                System.out.println("Invalid category selected.");
                sc.close();
                return;
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int totalBill = itemPrice * quantity;

        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + totalBill);
        sc.close();
    }
}
