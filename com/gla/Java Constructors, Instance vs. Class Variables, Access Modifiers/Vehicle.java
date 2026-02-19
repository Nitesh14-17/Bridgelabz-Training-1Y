public class Vehicle {
    private String ownerName;
    private String vehicleType;
    static double registrationFee = 5000;

    public Vehicle() {
        this.ownerName = "Owner";
        this.vehicleType = "Car";
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: Rs. " + registrationFee);
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }
}
