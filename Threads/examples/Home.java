class Device implements Runnable {
    private String name;
    private int interval;
    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " cycle " + i + " at " + System.currentTimeMillis());
            try { Thread.sleep(interval); } catch (InterruptedException e) {}
        }
    }
}

public class Home {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("TempSensor", 5000));
        Thread cam = new Thread(new Device("Camera", 3000));
        Thread light = new Thread(new Device("Light", 4000));
        Thread door = new Thread(new Device("DoorLock", 6000));
        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);
        temp.start();
        cam.start();
        light.start();
        door.start();
    }
}
