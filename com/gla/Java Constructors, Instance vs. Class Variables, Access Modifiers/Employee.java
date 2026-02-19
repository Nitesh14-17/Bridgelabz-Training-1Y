public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee() {
        this.employeeID = 0;
        this.department = "General";
        this.salary = 0.0;
    }

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
    }
}
