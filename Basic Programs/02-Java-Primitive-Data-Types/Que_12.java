/*Write a program that takes the base and height to find area of a triangle in square inches
and square centimeters
Hint => Area of a Triangle is 1⁄2 * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
import java.util.Scanner;
public class Que_12 {   
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the base of the triangle in inches: ");
            double baseInches = input.nextDouble();
            System.out.print("Enter the height of the triangle in inches: ");
            double heightInches = input.nextDouble();

            double areaInches = 0.5 * baseInches * heightInches;
            double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 square centimeters

            System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
        }
    }
}
