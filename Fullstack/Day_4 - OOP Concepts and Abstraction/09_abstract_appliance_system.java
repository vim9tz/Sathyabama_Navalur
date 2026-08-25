/**
 * 09_abstract_appliance_system.java
 * Abstract class with constructor, concrete methods, and abstract operational behaviors.
 */
abstract class HomeAppliance {
    String brand;
    double powerRatingWatts;

    HomeAppliance(String brand, double powerRatingWatts) {
        this.brand = brand;
        this.powerRatingWatts = powerRatingWatts;
        System.out.println("Abstract Constructor: Initialized " + brand + " Appliance (" + powerRatingWatts + "W)");
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public void displaySpecs() {
        System.out.println("Brand: " + brand + " | Power Rating: " + powerRatingWatts + " Watts");
    }
}

class WashingMachine extends HomeAppliance {
    double loadCapacityKg;

    WashingMachine(String brand, double powerRatingWatts, double loadCapacityKg) {
        super(brand, powerRatingWatts);
        this.loadCapacityKg = loadCapacityKg;
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine: Motor starting wash cycle (" + loadCapacityKg + " kg load).");
    }

    @Override
    public void turnOff() {
        System.out.println("WashingMachine: Drain pump finished. Power off.");
    }
}

class Refrigerator extends HomeAppliance {
    int volumeLiters;

    Refrigerator(String brand, double powerRatingWatts, int volumeLiters) {
        super(brand, powerRatingWatts);
        this.volumeLiters = volumeLiters;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator: Compressor running. Cooling " + volumeLiters + "L compartment.");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator: Defrost mode active. Compressor paused.");
    }
}

class _09_abstract_appliance_system {
    public static void main(String[] args) {
        HomeAppliance wm = new WashingMachine("Bosch", 2000.0, 7.5);
        wm.displaySpecs();
        wm.turnOn();
        wm.turnOff();

        System.out.println();
        HomeAppliance ref = new Refrigerator("Samsung", 350.0, 345);
        ref.displaySpecs();
        ref.turnOn();
        ref.turnOff();
    }
}
