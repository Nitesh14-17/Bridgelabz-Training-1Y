class BankAccount {
    int accountNumber;
    int balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displayAccountType() {
        System.out.println("SavingsAccount");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    void displayAccountType() {
        System.out.println("CheckingAccount");
    }
}

class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    void displayAccountType() {
        System.out.println("FixedDepositAccount");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 1;
        s.balance = 1000;
        s.interestRate = 5.5;
        s.displayAccountType();

        CheckingAccount c = new CheckingAccount();
        c.accountNumber = 2;
        c.balance = 2000;
        c.withdrawalLimit = 500;
        c.displayAccountType();

        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 3;
        f.balance = 5000;
        f.depositPeriod = 12;
        f.displayAccountType();
    }
}
