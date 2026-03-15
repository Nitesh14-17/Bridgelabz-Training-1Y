abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }
    public void getVehicleDetails() {
        System.out.println(vehicleId + " " + driverName + " " + ratePerKm);
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
class Car extends Vehicle implements GPS {
    private String location;
    public Car(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}
class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}
class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 1.2; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(1, "D1", 10, "Loc1"),
            new Bike(2, "D2", 8, "Loc2"),
            new Auto(3, "D3", 12, "Loc3")
        };
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println(v.calculateFare(5));
        }
    }
}
