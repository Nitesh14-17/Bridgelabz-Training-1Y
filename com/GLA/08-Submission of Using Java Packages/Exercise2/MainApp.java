import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 2 =====\n");

        Course c1 = new Course("CS101", "Intro to CS", "Dr. Vikram", 4);
        Course c2 = new Course("CS201", "Data Structures", "Prof. Anjali", 4);
        Course c3 = new Course("CS301", "Databases", "Dr. Arjun", 3);

        System.out.println("Course 1:");
        c1.print();
        System.out.println();
        
        System.out.println("Course 2:");
        c2.print();
        System.out.println();
        
        System.out.println("Course 3:");
        c3.print();
    }
}
