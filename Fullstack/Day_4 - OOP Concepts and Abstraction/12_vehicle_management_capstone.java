/**
 * 12_vehicle_management_capstone.java
 * Capstone application integrating Encapsulation, Abstraction, Polymorphism, and Interfaces in a Fleet Management system.
 */
interface GPSConnectable {
    void transmitCoordinates(double lat, double lon);
}

abstract class FleetVehicle {
    private String vehicleId;
    private String model;
    private double fuelLevelPercent;

    FleetVehicle(String vehicleId, String model, double fuelLevelPercent) {
        this.vehicleId = vehicleId;
        this.model = model;
        setFuelLevelPercent(fuelLevelPercent);
    }

    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public double getFuelLevelPercent() { return fuelLevelPercent; }

    public void setFuelLevelPercent(double fuelLevelPercent) {
        if (fuelLevelPercent >= 0 && fuelLevelPercent <= 100) {
            this.fuelLevelPercent = fuelLevelPercent;
        } else {
            System.out.println("Invalid fuel value. Bound to [0-100].");
        }
    }

    public abstract void performMaintenanceCheck();
}

class ElectricCargoTruck extends FleetVehicle implements GPSConnectable {
    private double batteryKwh;

    ElectricCargoTruck(String vehicleId, String model, double fuelLevelPercent, double batteryKwh) {
        super(vehicleId, model, fuelLevelPercent);
        this.batteryKwh = batteryKwh;
    }

    @Override
    public void performMaintenanceCheck() {
        System.out.println("Truck [" + getVehicleId() + " - " + getModel() + "]: Battery status OK (" + batteryKwh + " kWh capacity). Charge level: " + getFuelLevelPercent() + "%");
    }

    @Override
    public void transmitCoordinates(double lat, double lon) {
        System.out.println("GPS Tracking [" + getVehicleId() + "]: Telemetry sent (Lat: " + lat + ", Lon: " + lon + ")");
    }
}

class _12_vehicle_management_capstone {
    public static void main(String[] args) {
        ElectricCargoTruck truck = new ElectricCargoTruck("TRK-9002", "Tesla Semi", 88.5, 500.0);

        System.out.println("=== FLEET MANAGEMENT OOP CAPSTONE ===");
        truck.performMaintenanceCheck();
        truck.transmitCoordinates(12.9716, 77.5946);
    }
}
