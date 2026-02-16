import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static long sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static long sumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a natural number (n): ");
        int n = scan.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number!");
            scan.close();
            return;
        }
        
        long recSum = sumUsingRecursion(n);
        System.out.println("Sum using recursion: " + recSum);
        
        long formSum = sumUsingFormula(n);
        System.out.println("Sum using formula n*(n+1)/2: " + formSum);
        
        if (recSum == formSum) {
            System.out.println("Both methods give the same result: " + recSum);
        } else {
            System.out.println("Results differ!");
        }
        
        scan.close();
    }
}
