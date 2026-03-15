package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {
    private static final double BONUS = 0.10;

    public double calcBonus(Employee e) {
        if (e == null) throw new IllegalArgumentException("Employee cannot be null");
        return e.getSal() * BONUS;
    }

    public double getTotal(Employee e) {
        return e.getSal() + calcBonus(e);
    }

    public void printBonus(Employee e) {
        double bonus = calcBonus(e);
        double total = getTotal(e);

        System.out.println("Employee: " + e.getName());
        System.out.println("Base: " + e.getSal());
        System.out.println("Bonus (10%): " + String.format("%.2f", bonus));
        System.out.println("Total: " + String.format("%.2f", total));
    }
}
