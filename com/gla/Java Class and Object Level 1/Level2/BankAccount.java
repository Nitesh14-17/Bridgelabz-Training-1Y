public class BankAccount {
    String holder;
    String accNo;
    double balance;
    
    public BankAccount(String holder, String accNo, double balance) {
        this.holder = holder;
        this.accNo = accNo;
        this.balance = balance;
    }
    
    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
        System.out.println("New Balance: " + balance);
    }
    
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public void display() {
        System.out.println("Account Holder: " + holder);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("John", "ACC001", 10000);
        b1.display();
        
        System.out.println();
        b1.deposit(5000);
        
        System.out.println();
        b1.withdraw(3000);
        
        System.out.println();
        b1.withdraw(20000);
    }
}
