public class Student {
    String name;
    int roll;
    int marks;
    
    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    
    public char grade() {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        return 'F';
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Raj", 1, 85);
        s1.display();
        
        System.out.println();
        
        Student s2 = new Student("Priya", 2, 92);
        s2.display();
    }
}
