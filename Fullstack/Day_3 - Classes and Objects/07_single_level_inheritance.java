/**
 * 07_single_level_inheritance.java
 * Demonstrates basic single-level inheritance using the extends keyword.
 */
class BaseVehicle {
    String brand = "Generic Motors";
    int maxSpeed = 120;

    void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class CarSubclass extends BaseVehicle {
    int numberOfDoors = 4;

    void displayCarInfo() {
        System.out.println("Brand: " + brand + " | Top Speed: " + maxSpeed + " km/h | Doors: " + numberOfDoors);
    }
}

class _07_single_level_inheritance {
    public static void main(String[] args) {
        CarSubclass myCar = new CarSubclass();
        myCar.brand = "Tata Motors";
        myCar.maxSpeed = 180;

        myCar.startEngine(); // Inherited method
        myCar.displayCarInfo(); // Subclass specific method
    }
}
