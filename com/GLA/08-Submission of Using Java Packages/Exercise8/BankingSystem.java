import static com.bank.util.InterestCalculator.*;
import static java.lang.Math.*;

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("===== Exercise 8 =====\n");

        double p = 10000.0;
        double r = 8.0;
        double t = 5.0;

        System.out.println("Principal: " + p);
        System.out.println("Rate: " + r + "%");
        System.out.println("Time: " + t + " years\n");

        System.out.println("=== SIMPLE INTEREST ===");
        double si = calcSI(p, r, t);
        double siAmt = getSIAmt(p, r, t);
        System.out.println("Interest: " + si);
        System.out.println("Amount: " + siAmt);

        System.out.println("\n=== COMPOUND INTEREST ===");
        double ci = calcCI(p, r, t);
        double ciAmt = getCIAmt(p, r, t);
        System.out.println("Interest: " + ci);
        System.out.println("Amount: " + ciAmt);

        System.out.println("\n=== COMPARISON ===");
        System.out.println("Difference: " + (ci - si));
        System.out.println("");

        System.out.println("=== TABLE ===");
        System.out.println(String.format("%-5s %-10s %-10s %-10s %-10s %-10s",
                "Year", "P", "SI", "SI Amt", "CI", "CI Amt"));
        for (int i = 0; i < 60; i++) System.out.print("-");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(String.format("%-5d %-10.0f %-10.2f %-10.2f %-10.2f %-10.2f",
                    i, p, calcSI(p, r, i), getSIAmt(p, r, i), calcCI(p, r, i), getCIAmt(p, r, i)));
        }

        System.out.println("\n=== MATH FUNCTIONS ===");
        System.out.println("sqrt(16) = " + sqrt(16));
        System.out.println("pow(2, 10) = " + pow(2, 10));
        System.out.println("max(100, 250) = " + max(100, 250));
        System.out.println("min(100, 250) = " + min(100, 250));
        System.out.println("abs(-45) = " + abs(-45));
    }
}
