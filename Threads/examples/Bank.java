class BankAccount implements Runnable {
    private String user;
    private String type;
    public BankAccount(String user, String type) {
        this.user = user;
        this.type = type;
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(user + " (" + type + ") checking balance. Priority: " + Thread.currentThread().getPriority());
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("Alice", "Premium"));
        Thread t2 = new Thread(new BankAccount("Bob", "Regular"));
        Thread t3 = new Thread(new BankAccount("Charlie", "Basic"));
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
