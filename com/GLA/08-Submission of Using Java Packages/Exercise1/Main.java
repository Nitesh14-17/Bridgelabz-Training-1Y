import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Exercise 1 =====\n");

        Student s1 = new Student("Raj Kumar", 101);
        Student s2 = new Student("Priya Singh", 102);

        Faculty f1 = new Faculty("Dr. Harshad", "Java");
        Faculty f2 = new Faculty("Prof. Neha", "Data Structures");

        s1.display();
        System.out.println();
        s2.display();
        System.out.println();

        f1.display();
        System.out.println();
        f2.display();
    }
}
