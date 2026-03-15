abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public void setType(String type) { this.type = type; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public abstract double calculateRentalCost(int days);
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private String policyNumber;
    public Car(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.1; }
    public String getInsuranceDetails() { return policyNumber; }
}
class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    public Bike(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return policyNumber; }
}
class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    public Truck(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return getRentalRate() * 0.2; }
    public String getInsuranceDetails() { return policyNumber; }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C1", "Car", 1000, "P1"),
            new Bike("B1", "Bike", 500, "P2"),
            new Truck("T1", "Truck", 2000, "P3")
        };
        for (Vehicle v : vehicles) {
            System.out.println(v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).calculateInsurance());
            }
        }
    }
}
