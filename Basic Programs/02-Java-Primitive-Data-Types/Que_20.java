/* Write an IntOperation program by taking a, b, and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also
understand the precedence of the operators.
Hint =>
a. Create variables a, b, and c of int data type.
b. Take user input for a, b, and c.
c. Compute 3 integer operations and assign the result to a variable
d. Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___*/
import java.util.Scanner;
public class Que_20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter value for a: ");
            int a = input.nextInt();
            System.out.print("Enter value for b: ");
            int b = input.nextInt();
            System.out.print("Enter value for c: ");
            int c = input.nextInt();

            int operation1 = a + b * c;
            int operation2 = a * b + c;
            int operation3 = c + a / b;
            int operation4 = a % b + c;

            System.out.println("The results of Int Operations are " 
                + operation1 + ", " 
                + operation2 + ", " 
                + operation3 + ", and " 
                + operation4);
        }
    }
}
