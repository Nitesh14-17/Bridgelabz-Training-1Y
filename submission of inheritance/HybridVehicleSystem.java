interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling");
    }
}

public class HybridVehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        e.maxSpeed = 120;
        e.model = "EV1";
        e.charge();

        PetrolVehicle p = new PetrolVehicle();
        p.maxSpeed = 150;
        p.model = "PV1";
        p.refuel();
    }
}
