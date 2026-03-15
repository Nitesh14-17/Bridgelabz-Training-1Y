class MainDefaultInterface {
    public static void main(String[] args) {
        PaymentProvider p = new PaymentProvider();
        p.refund();
        CSVExporter e = new CSVExporter();
        e.exportToJSON();
        ElectricVehicle v = new ElectricVehicle();
        v.displaySpeed();
        v.displayBatteryPercentage();
    }
}