package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 6 =====\n");

        Employee e1 = new Employee(101, "Harshad Kumar", "Dev", 50000.0);
        Employee e2 = new Employee(102, "Neha Singh", "HR", 40000.0);
        Employee e3 = new Employee(103, "Arjun Verma", "Finance", 45000.0);

        Payroll p = new Payroll();

        System.out.println("=== Employee Details ===");
        e1.print();
        System.out.println();
        e2.print();
        System.out.println();
        e3.print();
        System.out.println();

        System.out.println("=== Bonus Calculation ===");
        p.printBonus(e1);
        System.out.println();
        p.printBonus(e2);
        System.out.println();
        p.printBonus(e3);
    }
}
