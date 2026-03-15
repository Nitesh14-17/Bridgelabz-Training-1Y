package com.school.util;

import com.school.data.Student;

public class Analyzer {

    public double getAvg(Student s) {
        if (s == null) throw new IllegalArgumentException("Student is null");
        return (s.getM1() + s.getM2() + s.getM3()) / 3.0;
    }

    public String getGrade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else if (avg >= 50) return "E";
        else return "F";
    }
}
