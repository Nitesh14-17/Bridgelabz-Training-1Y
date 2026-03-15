package college.main;

import college.student.*;
import college.faculty.*;
import college.department.*;

import java.util.ArrayList;
import java.util.List;

public class CollegeManagementApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 11 =====\n");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Raj Patel", 1001, "CS", 3.8));
        students.add(new Student("Priya Singh", 1002, "CS", 3.9));
        students.add(new Student("Arjun Verma", 1003, "EC", 3.6));

        List<Faculty> faculty = new ArrayList<>();
        faculty.add(new Faculty("F001", "Dr. Harshad", "Java", "CS", "harshad@college.edu"));
        faculty.add(new Faculty("F002", "Prof. Anjali", "DS", "CS", "anjali@college.edu"));
        faculty.add(new Faculty("F003", "Dr. Vikram", "Digital", "EC", "vikram@college.edu"));

        List<Department> depts = new ArrayList<>();
        depts.add(new Department("CS", "Computer Science", "A", 4, 120));
        depts.add(new Department("EC", "Electronics", "B", 3, 95));

        System.out.println("=== STUDENTS ===");
        for (Student s : students) {
            s.info();
            System.out.println();
        }

        System.out.println("=== FACULTY ===");
        for (Faculty f : faculty) {
            f.info();
            System.out.println();
        }

        System.out.println("=== DEPARTMENTS ===");
        for (Department d : depts) {
            d.info();
            System.out.println();
        }

        System.out.println("=== STATISTICS ===");
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Faculty: " + faculty.size());
        System.out.println("Total Departments: " + depts.size());
    }
}
