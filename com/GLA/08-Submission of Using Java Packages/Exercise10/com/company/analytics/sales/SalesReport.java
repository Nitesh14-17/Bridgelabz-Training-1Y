package com.company.analytics.sales;

public class SalesReport {
    private String[] reg = {"North", "South", "East", "West", "Central"};
    private double[] sales = {150000, 120000, 180000, 200000, 95000};

    public void print() {
        System.out.println("=== SALES ===");
        System.out.println(String.format("%-15s %-20s", "Region", "Sales"));
        for (int i = 0; i < 40; i++) System.out.print("-");
        System.out.println();

        double total = getTotal();
        for (int i = 0; i < reg.length; i++) {
            double pct = (sales[i] / total) * 100;
            System.out.println(String.format("%-15s %-20.2f (%.2f%%)", reg[i], sales[i], pct));
        }
        System.out.println("TOTAL: " + total);
    }

    public double getTotal() {
        double total = 0;
        for (double s : sales) total += s;
        return total;
    }

    public double getAvg() {
        return getTotal() / reg.length;
    }

    public String getTop() {
        int idx = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[idx]) idx = i;
        }
        return reg[idx];
    }
}
