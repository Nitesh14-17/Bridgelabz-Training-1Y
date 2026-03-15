abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public void setBalance(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public abstract double calculateInterest();
}
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) {}
    public double calculateLoanEligibility() { return getBalance() * 0.5; }
}
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() { return getBalance() * 0.01; }
    public void applyForLoan(double amount) {}
    public double calculateLoanEligibility() { return getBalance() * 0.2; }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("A1", "X", 10000),
            new CurrentAccount("A2", "Y", 20000)
        };
        for (BankAccount a : accounts) {
            System.out.println(a.calculateInterest());
        }
    }
}
