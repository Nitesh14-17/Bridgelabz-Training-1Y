import java.util.Scanner;

public class UnitConvertor2 {
    
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;
    
    public static double convertYardsToFeet(double yds) {
        return yds * YARDS_TO_FEET;
    }
    
    public static double convertFeetToYards(double ft) {
        return ft * FEET_TO_YARDS;
    }
    
    public static double convertMetersToInches(double m) {
        return m * METERS_TO_INCHES;
    }
    
    public static double convertInchesToMeters(double in) {
        return in * INCHES_TO_METERS;
    }
    
    public static double convertInchesToCm(double in) {
        return in * INCHES_TO_CM;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean cont = true;
        while (cont) {
            System.out.println("\n=== Unit Convertor ===");
            System.out.println("1. Yards to Feet");
            System.out.println("2. Feet to Yards");
            System.out.println("3. Meters to Inches");
            System.out.println("4. Inches to Meters");
            System.out.println("5. Inches to Centimeters");
            System.out.println("6. Exit");
            
            System.out.print("Choose an option (1-6): ");
            int ch = scan.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter yards: ");
                    double yds = scan.nextDouble();
                    System.out.println(yds + " yards = " + convertYardsToFeet(yds) + " feet");
                    break;
                case 2:
                    System.out.print("Enter feet: ");
                    double ft = scan.nextDouble();
                    System.out.println(ft + " feet = " + convertFeetToYards(ft) + " yards");
                    break;
                case 3:
                    System.out.print("Enter meters: ");
                    double m = scan.nextDouble();
                    System.out.println(m + " meters = " + convertMetersToInches(m) + " inches");
                    break;
                case 4:
                    System.out.print("Enter inches: ");
                    double in = scan.nextDouble();
                    System.out.println(in + " inches = " + convertInchesToMeters(in) + " meters");
                    break;
                case 5:
                    System.out.print("Enter inches: ");
                    double inCm = scan.nextDouble();
                    System.out.println(inCm + " inches = " + convertInchesToCm(inCm) + " cm");
                    break;
                case 6:
                    cont = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        
        scan.close();
    }
}
