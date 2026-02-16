import java.util.Scanner;

public class SmallestAndLargest {
    
    public static int[] find(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[] {min, max};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        int[] res = find(a, b, c);
        
        System.out.println("Smallest number: " + res[0]);
        System.out.println("Largest number: " + res[1]);
        
        sc.close();
    }
}
