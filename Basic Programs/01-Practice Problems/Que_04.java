/*Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2. */
import java.util.Scanner;
public class Que_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        scanner.close();
    }
}
