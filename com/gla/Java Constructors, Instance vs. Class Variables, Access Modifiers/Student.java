public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student() {
        this.rollNumber = 0;
        this.name = "Unknown";
        this.cgpa = 0.0;
    }

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    public double getCGPA() {
        return cgpa;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
