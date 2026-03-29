class Order implements Runnable {
    private String id, rest, type;
    private int time;
    public Order(String id, String rest, int time, String type) {
        this.id = id; this.rest = rest; this.time = time; this.type = type;
    }
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("Order " + id + " picked up by " + Thread.currentThread().getName());
        try {
            System.out.println("Order " + id + " in transit...");
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {}
        long end = System.currentTimeMillis();
        System.out.println("Order " + id + " delivered by " + Thread.currentThread().getName() +
            ". Total time: " + (end - start)/1000.0 + "s");
    }
}

public class Food {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order("1", "PizzaHut", 2, "Express"), "Agent1");
        Thread o2 = new Thread(new Order("2", "KFC", 4, "Standard"), "Agent2");
        Thread o3 = new Thread(new Order("3", "Subway", 3, "Economy"), "Agent3");
        Thread o4 = new Thread(new Order("4", "Dominos", 1, "Express"), "Agent4");
        Thread o5 = new Thread(new Order("5", "BurgerKing", 5, "Standard"), "Agent5");
        o1.setPriority(10); // Express
        o2.setPriority(5);  // Standard
        o3.setPriority(3);  // Economy
        o4.setPriority(10); // Express
        o5.setPriority(5);  // Standard
        o1.start(); o2.start(); o3.start(); o4.start(); o5.start();
    }
}
