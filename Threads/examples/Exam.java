class EntryMonitor extends Thread {
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Monitoring entry. State: " + getState());
            try { Thread.sleep(2000); } catch (InterruptedException e) { break; }
        }
    }
}
class PaperDist extends Thread {
    public void run() {
        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        System.out.println("Distributing papers. State: " + getState());
    }
}
class Attendance extends Thread {
    public void run() {
        try { Thread.sleep(10000); } catch (InterruptedException e) {}
        System.out.println("Marking attendance. State: " + getState());
    }
}
class Collection extends Thread {
    public void run() {
        try { Thread.sleep(15000); } catch (InterruptedException e) {}
        System.out.println("Collecting answer sheets. State: " + getState());
    }
}

public class Exam {
    public static void main(String[] args) throws InterruptedException {
        EntryMonitor entry = new EntryMonitor();
        PaperDist paper = new PaperDist();
        Attendance att = new Attendance();
        Collection coll = new Collection();
        paper.setPriority(10);
        att.setPriority(8);
        entry.setPriority(5);
        coll.setPriority(7);
        entry.start();
        paper.start();
        att.start();
        coll.start();
        Thread.sleep(17000); // Let all finish
        entry.interrupt(); // Stop entry monitoring
    }
}
