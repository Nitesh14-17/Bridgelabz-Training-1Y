package com.company.analytics.hr;

public class EmployeeReport {
    private String[] dept = {"IT", "HR", "Finance", "Ops", "Marketing"};
    private int[] emp = {45, 15, 20, 30, 25};
    private double[] sal = {65000, 50000, 55000, 45000, 48000};

    public void print() {
        System.out.println("=== HR ===");
        System.out.println(String.format("%-15s %-10s %-15s %-20s",
                "Dept", "Emp", "Avg Sal", "Total Payroll"));
        for (int i = 0; i < 65; i++) System.out.print("-");
        System.out.println();

        double totalPayroll = 0;
        for (int i = 0; i < dept.length; i++) {
            double payroll = emp[i] * sal[i];
            totalPayroll += payroll;
            System.out.println(String.format("%-15s %-10d %-15.2f %-20.2f",
                    dept[i], emp[i], sal[i], payroll));
        }
        System.out.println("TOTAL: " + totalPayroll);
    }

    public int getTotal() {
        int total = 0;
        for (int e : emp) total += e;
        return total;
    }

    public double getPayroll() {
        double total = 0;
        for (int i = 0; i < dept.length; i++) {
            total += emp[i] * sal[i];
        }
        return total;
    }

    public double getAvg() {
        return (double) getTotal() / dept.length;
    }

    public String getLargest() {
        int max = 0;
        for (int i = 1; i < emp.length; i++) {
            if (emp[i] > emp[max]) max = i;
        }
        return dept[max];
    }
}
