class Course {
    String courseName;
    int duration;
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;
}

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse();
        p.courseName = "Java";
        p.duration = 30;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 1000;
        p.discount = 100;
        System.out.println(p.courseName + " " + p.duration + " " + p.platform + " " + p.isRecorded + " " + p.fee + " " + p.discount);
    }
}
