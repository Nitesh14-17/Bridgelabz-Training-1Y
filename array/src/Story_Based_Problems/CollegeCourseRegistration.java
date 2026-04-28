package Story_Based_Problems;

import java.util.*;

class Student {
    int id;
    String name;
    List<String> courses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Courses: " + courses);
    }
}

public class CollegeCourseRegistration {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Register Course");
            System.out.println("3. View Students");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    registerCourse();
                    break;

                case 3:
                    viewStudents();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        students.put(id, new Student(id, name));
        System.out.println("Student added successfully!");
    }

    static void registerCourse() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        students.get(id).addCourse(course);
        System.out.println("Course registered!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students.values()) {
            s.display();
            System.out.println("----------------");
        }
    }
}
