import java.util.Scanner;

public class FindFactors {
    
    public static int[] findFactors(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        
        int[] fac = new int[cnt];
        
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                fac[idx] = i;
                idx++;
            }
        }
        
        return fac;
    }
    
    public static int findSum(int[] fac) {
        int sum = 0;
        for (int f : fac) {
            sum += f;
        }
        return sum;
    }
    
    public static long findProduct(int[] fac) {
        long prod = 1;
        for (int f : fac) {
            prod *= f;
        }
        return prod;
    }
    
    public static long findSumOfSquares(int[] fac) {
        long sumSq = 0;
        for (int f : fac) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }
    
    public static void displayFactors(int[] fac) {
        System.out.print("Factors: ");
        for (int f : fac) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        int[] fac = findFactors(num);
        displayFactors(fac);
        
        int sum = findSum(fac);
        System.out.println("Sum of factors: " + sum);
        
        long prod = findProduct(fac);
        System.out.println("Product of factors: " + prod);
        
        long sumSq = findSumOfSquares(fac);
        System.out.println("Sum of squares of factors: " + sumSq);
        
        scan.close();
    }
}
