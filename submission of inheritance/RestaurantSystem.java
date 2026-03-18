interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Cook");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Serve");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.name = "John";
        c.id = 1;
        c.performDuties();

        Waiter w = new Waiter();
        w.name = "Jane";
        w.id = 2;
        w.performDuties();
    }
}
