package com.school.data;

public class Student {
    private String name;
    private int roll;
    private double m1, m2, m3;

    public Student(String name, int roll, double m1, double m2, double m3) {
        this.name = name;
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
    public double getM1() { return m1; }
    public double getM2() { return m2; }
    public double getM3() { return m3; }
}
