public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this("Customer", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public double calculateTotalCost() {
        double costPerDay = 0;
        if (carModel.equals("Economy")) {
            costPerDay = 500;
        } else if (carModel.equals("Sedan")) {
            costPerDay = 1000;
        } else if (carModel.equals("SUV")) {
            costPerDay = 2000;
        }
        return costPerDay * rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
    }
}
