import java.util.Scanner;

public class NumberCheck {
    
    public static int check(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int res = check(n);
        
        if (res == 1) {
            System.out.println(n + " is a positive number");
        } else if (res == -1) {
            System.out.println(n + " is a negative number");
        } else {
            System.out.println(n + " is zero");
        }
        
        sc.close();
    }
}
