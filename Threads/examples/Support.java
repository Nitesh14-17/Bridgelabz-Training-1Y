import java.util.Random;

class Ticket extends Thread {
    private int num;
    private String type;
    public Ticket(int num, String type) {
        this.num = num; this.type = type;
    }
    public void run() {
        int time = new Random().nextInt(5) + 1;
        System.out.println("Ticket " + num + " (" + type + ") started by " + getName() + " Priority: " + getPriority());
        try { Thread.sleep(time * 1000); } catch (InterruptedException e) {}
        System.out.println("Ticket " + num + " (" + type + ") completed by " + getName());
    }
}

public class Support {
    public static void main(String[] args) {
        String[] types = {"Critical", "Feature", "Query", "Feedback"};
        int[] prios = {10, 4, 2, 1};
        for (int i = 1; i <= 10; i++) {
            int idx = new Random().nextInt(4);
            Ticket t = new Ticket(i, types[idx]);
            t.setPriority(prios[idx]);
            t.start();
        }
    }
}
