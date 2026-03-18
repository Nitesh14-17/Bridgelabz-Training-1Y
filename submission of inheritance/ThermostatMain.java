class Device {
    String deviceId;
    String status;
}

class Thermostat extends Device {
    int temperatureSetting;

    void displayStatus() {
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}

public class ThermostatMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "T1";
        t.status = "On";
        t.temperatureSetting = 22;
        t.displayStatus();
    }
}
