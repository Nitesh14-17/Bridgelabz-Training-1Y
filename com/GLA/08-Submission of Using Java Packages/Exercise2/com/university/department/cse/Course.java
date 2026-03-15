package com.university.department.cse;

public class Course {
    private String code;
    private String name;
    private String teacher;
    private int credits;

    public Course(String code, String name, String teacher, int credits) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
    }

    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Teacher: " + teacher);
        System.out.println("Credits: " + credits);
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public String getTeacher() { return teacher; }
    public int getCredits() { return credits; }
}
