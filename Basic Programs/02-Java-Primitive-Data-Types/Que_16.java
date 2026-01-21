/*16. Create a program to find the maximum number of handshakes among N number of
students.
Hint =>
a. Get integer input for numberOfStudents variable.
b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
possible handshakes.
c. Display the number of possible handshakes. */
import java.util.Scanner;
public class Que_16 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();

            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        }
    }
}
