/*DoubleOpt program by taking double values and doing the same
operations. */
import java.util.Scanner;
public class Que_21 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first double value: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second double value: ");
            double num2 = input.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;
            double remainder = num1 % num2;

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
