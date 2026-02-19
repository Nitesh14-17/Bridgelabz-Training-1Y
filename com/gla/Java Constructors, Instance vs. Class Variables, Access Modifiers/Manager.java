public class Manager extends Employee {
    private int teamSize;
    private double bonus;

    public Manager() {
        super();
        this.teamSize = 0;
        this.bonus = 0.0;
    }

    public Manager(int employeeID, String department, double salary, int teamSize, double bonus) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalCompensation() {
        return getSalary() + bonus;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + getSalary());
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: Rs. " + bonus);
        System.out.println("Total Compensation: Rs. " + getTotalCompensation());
    }
}
