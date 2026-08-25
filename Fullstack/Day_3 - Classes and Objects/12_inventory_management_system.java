/**
 * 12_inventory_management_system.java
 * Capstone object-oriented inventory tracker combining methods, objects, constructors, and inheritance.
 */
class InventoryItem {
    int itemCode;
    String description;
    int stockQuantity;
    double unitPrice;

    InventoryItem(int itemCode, String description, int stockQuantity, double unitPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    double calculateTotalValue() {
        return stockQuantity * unitPrice;
    }

    void displayStockStatus() {
        System.out.println("Item [" + itemCode + "]: " + description + " | Stock: " + stockQuantity + " | Total Value: ₹" + calculateTotalValue());
    }
}

class PerishableItem extends InventoryItem {
    int expiryDaysRemaining;

    PerishableItem(int itemCode, String description, int stockQuantity, double unitPrice, int expiryDaysRemaining) {
        super(itemCode, description, stockQuantity, unitPrice);
        this.expiryDaysRemaining = expiryDaysRemaining;
    }

    void checkFreshness() {
        displayStockStatus();
        if (expiryDaysRemaining <= 3) {
            System.out.println("ALERT: Expiry imminent (" + expiryDaysRemaining + " days left). Apply discount!");
        } else {
            System.out.println("Status: Fresh stock (" + expiryDaysRemaining + " days left).");
        }
    }
}

class _12_inventory_management_system {
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem(501, "Dell Wireless Mouse", 45, 899.00);
        PerishableItem item2 = new PerishableItem(601, "Organic Almond Milk", 20, 150.00, 2);

        System.out.println("=== WAREHOUSE INVENTORY CAPSTONE ===");
        item1.displayStockStatus();
        System.out.println();
        item2.checkFreshness();
    }
}
