import java.util.Scanner;

public class ChocolateDistribution {
    
    public static int[] find(int n, int m) {
        int per = n / m;
        int rem = n % m;
        return new int[] {per, rem};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();
        
        System.out.print("Enter number of children: ");
        int m = sc.nextInt();
        
        int[] res = find(n, m);
        
        System.out.println("Each child gets: " + res[0] + " chocolates");
        System.out.println("Remaining chocolates: " + res[1]);
        
        sc.close();
    }
}
