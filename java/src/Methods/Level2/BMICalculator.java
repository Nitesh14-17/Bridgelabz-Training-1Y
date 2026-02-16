import java.util.Scanner;

public class BMICalculator {
    
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double w = data[i][0];
            double hCm = data[i][1];
            double hM = hCm / 100;
            
            double bmi = w / (hM * hM);
            data[i][2] = bmi;
        }
    }
    
    public static String[] determineBMIStatus(double[][] data) {
        String[] stats = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            
            if (bmi <= 18.4) {
                stats[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                stats[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                stats[i] = "Overweight";
            } else {
                stats[i] = "Obese";
            }
        }
        
        return stats;
    }
    
    public static void displayResults(double[][] data, String[] stats) {
        System.out.println("\n=== BMI Report ===");
        System.out.println(String.format("%-8s %-12s %-12s %-8s %-12s", 
                          "Person", "Weight(kg)", "Height(cm)", "BMI", "Status"));
        System.out.println("-".repeat(54));
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(String.format("%-8d %-12.2f %-12.2f %-8.2f %-12s", 
                              (i + 1), data[i][0], data[i][1], data[i][2], stats[i]));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[][] data = new double[10][3];
        
        System.out.println("=== BMI Calculator ===");
        System.out.println("Enter weight and height for 10 team members:\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + ":");
            System.out.print("\n  Enter weight (in kg): ");
            data[i][0] = scan.nextDouble();
            
            System.out.print("  Enter height (in cm): ");
            data[i][1] = scan.nextDouble();
            System.out.println();
        }
        
        calculateBMI(data);
        String[] stats = determineBMIStatus(data);
        displayResults(data, stats);
        
        scan.close();
    }
}
