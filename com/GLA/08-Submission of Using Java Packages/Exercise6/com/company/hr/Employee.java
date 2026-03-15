package com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double sal;

    public Employee(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSal() { return sal; }

    public void setSal(double sal) {
        if (sal < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.sal = sal;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Salary: " + sal);
    }
}
