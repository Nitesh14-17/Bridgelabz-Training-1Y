package college.student;

public class Student {
    private String name;
    private int roll;
    private String dept;
    private double gpa;

    public Student(String name, int roll, String dept, double gpa) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
    public String getDept() { return dept; }
    public double getGpa() { return gpa; }

    public void info() {
        System.out.println("  Name: " + name);
        System.out.println("  Roll: " + roll);
        System.out.println("  Dept: " + dept);
        System.out.println("  GPA: " + String.format("%.2f", gpa));
    }
}
