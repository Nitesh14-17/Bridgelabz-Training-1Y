import java.util.Scanner;

public class FriendsComparison {
    
    private static final String[] names = {"Amar", "Akbar", "Anthony"};
    
    public static int findYoungest(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
    
    public static int findTallest(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("=== Friends Comparison ===");
        System.out.println("Enter details for 3 friends: Amar, Akbar, Anthony\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scan.nextInt();
            
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scan.nextDouble();
            System.out.println();
        }
        
        int youngIdx = findYoungest(ages);
        System.out.println("=== Results ===");
        System.out.println("Youngest friend: " + names[youngIdx] + 
                          " (Age: " + ages[youngIdx] + " years)");
        
        int tallIdx = findTallest(heights);
        System.out.println("Tallest friend: " + names[tallIdx] + 
                          " (Height: " + heights[tallIdx] + " cm)");
        
        scan.close();
    }
}
