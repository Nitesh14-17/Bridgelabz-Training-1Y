abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public void displayDetails() {
        System.out.println(employeeId + " " + name + " " + baseSalary);
    }
    public abstract double calculateSalary();
}
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String department) {
        this.department = department;
    }
    public String getDepartmentDetails() {
        return department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hours;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hours) {
        super(employeeId, name, baseSalary);
        this.hours = hours;
    }
    public double calculateSalary() {
        return getBaseSalary() * hours;
    }
    public void assignDepartment(String department) {
        this.department = department;
    }
    public String getDepartmentDetails() {
        return department;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(1, "A", 50000),
            new PartTimeEmployee(2, "B", 200, 20)
        };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println(e.calculateSalary());
        }
    }
}
