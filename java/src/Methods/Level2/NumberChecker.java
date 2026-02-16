import java.util.Scanner;

public class NumberChecker {
    
    public static String isPositive(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    public static int compare(int n1, int n2) {
        if (n1 > n2) {
            return 1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] nums = new int[5];
        
        System.out.println("=== Number Checker ===");
        System.out.println("Enter 5 numbers:\n");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }
        
        System.out.println("\n=== Analysis ===");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + " (" + nums[i] + "): ");
            System.out.print(isPositive(nums[i]));
            
            if (nums[i] > 0) {
                System.out.print(" and " + isEven(nums[i]));
            }
            System.out.println();
        }
        
        System.out.println("\n=== Comparison of First and Last Elements ===");
        int first = nums[0];
        int last = nums[4];
        int cmp = compare(first, last);
        
        System.out.print("First element: " + first + ", Last element: " + last + " => ");
        
        if (cmp == 1) {
            System.out.println("First element is GREATER than last element");
        } else if (cmp == 0) {
            System.out.println("First and last elements are EQUAL");
        } else {
            System.out.println("First element is LESS than last element");
        }
        
        scan.close();
    }
}
