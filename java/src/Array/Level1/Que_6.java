/*6. Create a program to find the mean height of players present in a football team.
Hint =>
a. The formula to calculate the mean is: mean = sum of all elements / number of elements
b. Create a double array named heights of size 11 and get input values from the user.
c. Find the sum of all the elements present in the array.
d. Divide the sum by 11 to find the mean height and print the mean height of the football
team*/
package Array.Level1;
import java.util.Scanner;
public class Que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players in the football team:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double meanHeight = sum / heights.length;
        System.out.printf("The mean height of the football team is: %.2f\n", meanHeight);

        sc.close();
    }
}
