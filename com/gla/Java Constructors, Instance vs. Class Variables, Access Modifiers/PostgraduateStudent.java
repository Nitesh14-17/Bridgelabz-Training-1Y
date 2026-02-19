public class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent() {
        super();
        this.specialization = "General";
    }

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        super.displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
