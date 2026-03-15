package college.student;

public class Student {
    private String name;
    private int id;
    private String dept;

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Dept: " + dept);
    }
}
