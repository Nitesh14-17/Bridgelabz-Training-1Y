package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class TestAnalyzer {
    public static void main(String[] args) {
        System.out.println("===== Exercise 7 =====\n");

        Analyzer a = new Analyzer();

        Student[] st = {
            new Student("Raj Patel", 1001, 85, 90, 88),
            new Student("Priya Kumar", 1002, 78, 82, 80),
            new Student("Arjun Singh", 1003, 92, 95, 93),
            new Student("Neha Verma", 1004, 65, 68, 70),
            new Student("Vikram Rao", 1005, 45, 40, 42)
        };

        System.out.println(String.format("%-15s %-10s %-10s %-10s %-10s %-7s",
                "Name", "M1", "M2", "M3", "Avg", "Grade"));
        for (int i = 0; i < 70; i++) System.out.print("-");
        System.out.println();

        for (Student s : st) {
            double avg = a.getAvg(s);
            String grade = a.getGrade(avg);

            System.out.println(String.format("%-15s %-10.0f %-10.0f %-10.0f %-10.2f %-7s",
                    s.getName(), s.getM1(), s.getM2(), s.getM3(), avg, grade));
        }
    }
}
