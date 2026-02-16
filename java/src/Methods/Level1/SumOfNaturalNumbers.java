import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static long find(int n) {
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        long s = find(n);
        
        System.out.println("The sum of " + n + " natural numbers is: " + s);
        
        sc.close();
    }
}
