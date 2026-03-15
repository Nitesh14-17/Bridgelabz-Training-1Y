package college.student;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayRoll() {
        System.out.println("Roll: " + rollNumber);
    }

    public void display() {
        System.out.println("=== Student ===");
        displayName();
        displayRoll();
    }
}
