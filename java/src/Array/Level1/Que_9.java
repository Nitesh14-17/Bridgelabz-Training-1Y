/*9. Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and
Copy the 2D Array into a single dimension array
Hint =>
a. Take user input for rows and columns, create a 2D array (Matrix), and take the user input
b. Copy the elements of the matrix to a 1D array. For this create a 1D array of size
rows*columns as in int[] array = new int[rows * columns];
c. Define the index variable and Loop through the 2D array. Copy every element of the 2D
array into the 1D array and increment the index
d. Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for
rows, and the inner for loops to access each element*/
package Array.Level1;
import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] array = new int[rows * columns];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("The elements in the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
