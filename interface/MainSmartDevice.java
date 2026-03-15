class MainSmartDevice {
    public static void main(String[] args) {
        Light l = new Light();
        l.turnOn();
        l.turnOff();
        AC a = new AC();
        a.turnOn();
        a.turnOff();
        TV t = new TV();
        t.turnOn();
        t.turnOff();
    }
}