import java.util.Scanner;

public class QuotientAndRemainder {
    
    public static int[] find(int n, int d) {
        int q = n / d;
        int r = n % d;
        return new int[] {r, q};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the divisor: ");
        int d = sc.nextInt();
        
        int[] res = find(n, d);
        
        System.out.println("Quotient: " + res[1]);
        System.out.println("Remainder: " + res[0]);
        
        sc.close();
    }
}
