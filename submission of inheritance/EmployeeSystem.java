class Employee {
    String name;
    int id;
    int salary;

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}

class Intern extends Employee {
    String school;

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + school);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "A";
        m.id = 1;
        m.salary = 50000;
        m.teamSize = 5;
        m.displayDetails();

        Developer d = new Developer();
        d.name = "B";
        d.id = 2;
        d.salary = 40000;
        d.programmingLanguage = "Java";
        d.displayDetails();

        Intern i = new Intern();
        i.name = "C";
        i.id = 3;
        i.salary = 20000;
        i.school = "XYZ";
        i.displayDetails();
    }
}
