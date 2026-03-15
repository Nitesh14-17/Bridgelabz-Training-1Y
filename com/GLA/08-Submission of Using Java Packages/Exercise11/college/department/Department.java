package college.department;

public class Department {
    private String code;
    private String name;
    private String building;
    private int faculty;
    private int students;

    public Department(String code, String name, String building, int faculty, int students) {
        this.code = code;
        this.name = name;
        this.building = building;
        this.faculty = faculty;
        this.students = students;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public String getBuilding() { return building; }
    public int getFaculty() { return faculty; }
    public int getStudents() { return students; }

    public void info() {
        System.out.println("  Code: " + code);
        System.out.println("  Name: " + name);
        System.out.println("  Building: " + building);
        System.out.println("  Faculty: " + faculty);
        System.out.println("  Students: " + students);
    }
}
