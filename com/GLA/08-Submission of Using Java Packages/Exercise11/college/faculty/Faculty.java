package college.faculty;

public class Faculty {
    private String id;
    private String name;
    private String specialization;
    private String dept;
    private String email;

    public Faculty(String id, String name, String specialization, String dept, String email) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.dept = dept;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public String getDept() { return dept; }
    public String getEmail() { return email; }

    public void info() {
        System.out.println("  ID: " + id);
        System.out.println("  Name: " + name);
        System.out.println("  Specialization: " + specialization);
        System.out.println("  Dept: " + dept);
        System.out.println("  Email: " + email);
    }
}
