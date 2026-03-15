class MainRentableVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.rent();
        c.returnVehicle();
        Bike b = new Bike();
        b.rent();
        b.returnVehicle();
        Bus u = new Bus();
        u.rent();
        u.returnVehicle();
    }
}