class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    String type;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + type);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Car();
        arr[1] = new Truck();
        arr[2] = new Motorcycle();

        ((Car)arr[0]).maxSpeed = 180;
        ((Car)arr[0]).fuelType = "Petrol";
        ((Car)arr[0]).seatCapacity = 4;

        ((Truck)arr[1]).maxSpeed = 120;
        ((Truck)arr[1]).fuelType = "Diesel";
        ((Truck)arr[1]).loadCapacity = 1000;

        ((Motorcycle)arr[2]).maxSpeed = 150;
        ((Motorcycle)arr[2]).fuelType = "Petrol";
        ((Motorcycle)arr[2]).type = "Sport";

        for (int i = 0; i < arr.length; i++) {
            arr[i].displayInfo();
        }
    }
}
