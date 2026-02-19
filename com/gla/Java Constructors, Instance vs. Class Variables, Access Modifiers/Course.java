public class Course {
    private String courseName;
    private int duration;
    private double fee;
    static String instituteName = "Bridgelabz";

    public Course() {
        this.courseName = "Java Basics";
        this.duration = 30;
        this.fee = 5000;
    }

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Fee: Rs. " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static String getInstituteName() {
        return instituteName;
    }
}
