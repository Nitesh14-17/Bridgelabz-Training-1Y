import java.util.Scanner;

public class Handshakes {
    
    public static long calculate(int n) {
        return (long) (n * (n - 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        long hs = calculate(n);
        
        System.out.println("The maximum number of possible handshakes: " + hs);
        
        sc.close();
    }
}
