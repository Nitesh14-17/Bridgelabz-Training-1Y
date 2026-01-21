/*Write a program that takes the base and height in cm to find the area of a triangle in square
inches and square centimeters
Hint => Area of a Triangle is 1⁄2 * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___ */
import java.util.Scanner;
public class Que_17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the base of the triangle in centimeters: ");
            double baseCm = input.nextDouble();
            System.out.print("Enter the height of the triangle in centimeters: ");
            double heightCm = input.nextDouble();

            double baseInches = baseCm / 2.54;
            double heightInches = heightCm / 2.54;

            double areaInches = 0.5 * baseInches * heightInches;
            double areaCm = 0.5 * baseCm * heightCm;

            System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
        }
    }
}
