class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Teacher");
    }
}

class Student extends Person {
    int grade;

    void displayRole() {
        System.out.println("Student");
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println("Staff");
    }
}

public class SchoolRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Tom";
        t.age = 40;
        t.subject = "Math";
        t.displayRole();

        Student s = new Student();
        s.name = "Sam";
        s.age = 15;
        s.grade = 10;
        s.displayRole();

        Staff f = new Staff();
        f.name = "Sue";
        f.age = 35;
        f.department = "Admin";
        f.displayRole();
    }
}
