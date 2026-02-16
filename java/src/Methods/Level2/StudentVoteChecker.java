import java.util.Scanner;

public class StudentVoteChecker {
    
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        
        int[] ages = new int[10];
        
        System.out.println("=== Student Vote Checker ===");
        System.out.println("Enter the ages of 10 students:\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scan.nextInt();
        }
        
        System.out.println("\n=== Voting Eligibility Results ===");
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Invalid age");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): CAN VOTE");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): CANNOT VOTE");
            }
        }
        
        scan.close();
    }
}
