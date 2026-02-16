import java.util.Scanner;

public class RandomNumberGenerator {
    
    public static int[] generate4DigitRandomArray(int sz) {
        int[] nums = new int[sz];
        
        for (int i = 0; i < sz; i++) {
            nums[i] = 1000 + (int)(Math.random() * 9000);
        }
        
        return nums;
    }
    
    public static double[] findAverageMinMax(int[] nums) {
        if (nums.length == 0) {
            return new double[0];
        }
        
        double sum = 0;
        int min = nums[0];
        int max = nums[0];
        
        for (int n : nums) {
            sum += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        
        double avg = sum / nums.length;
        
        return new double[]{avg, min, max};
    }
    
    public static void displayArray(int[] nums) {
        System.out.print("Generated numbers: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Random 4-Digit Number Generator ===\n");
        
        int[] randoms = generate4DigitRandomArray(5);
        displayArray(randoms);
        
        double[] stats = findAverageMinMax(randoms);
        
        System.out.println("\n=== Results ===");
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
        
        scan.close();
    }
}
