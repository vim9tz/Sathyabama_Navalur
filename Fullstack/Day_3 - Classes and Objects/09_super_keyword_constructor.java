/**
 * 09_super_keyword_constructor.java
 * Invoking parent constructors using super(...) in product inheritance hierarchies.
 */
class EcommerceProduct {
    int productId;
    String name;
    double price;

    EcommerceProduct(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("ID: " + productId + " | Name: " + name + " | Price: ₹" + price);
    }
}

class PhysicalProduct extends EcommerceProduct {
    double shippingWeightKg;

    PhysicalProduct(int productId, String name, double price, double shippingWeightKg) {
        super(productId, name, price); // Forward to parent constructor
        this.shippingWeightKg = shippingWeightKg;
    }

    void displayPhysicalProduct() {
        displayProduct();
        System.out.println("Type: Physical Goods | Weight: " + shippingWeightKg + " kg");
    }
}

class DigitalProduct extends EcommerceProduct {
    String downloadUrl;

    DigitalProduct(int productId, String name, double price, String downloadUrl) {
        super(productId, name, price); // Forward to parent constructor
        this.downloadUrl = downloadUrl;
    }

    void displayDigitalProduct() {
        displayProduct();
        System.out.println("Type: Digital Download | URL: " + downloadUrl);
    }
}

class _09_super_keyword_constructor {
    public static void main(String[] args) {
        PhysicalProduct p1 = new PhysicalProduct(201, "Wireless Headphones", 2499.00, 0.45);
        DigitalProduct d1 = new DigitalProduct(301, "Java Mastery E-Book", 499.00, "https://store.com/downloads/java.pdf");

        System.out.println("--- E-Commerce Catalog ---");
        p1.displayPhysicalProduct();
        System.out.println();
        d1.displayDigitalProduct();
    }
}
