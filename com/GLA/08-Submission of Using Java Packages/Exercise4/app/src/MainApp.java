import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 4 =====\n");

        Student s1 = new Student("Priya Sharma", 1001, "CS");
        Student s2 = new Student("Rahul Patel", 1002, "EC");

        System.out.println("Student 1:");
        s1.info();
        System.out.println();
        System.out.println("Student 2:");
        s2.info();

        System.out.println("\n=== Modules provide strong encapsulation ===");
    }
}
