import java.util.Scanner;

public class UnitConvertor1 {
    
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }
    
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
    
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }
    
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean cont = true;
        while (cont) {
            System.out.println("\n=== Unit Convertor ===");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Exit");
            
            System.out.print("Choose an option (1-5): ");
            int ch = scan.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter kilometers: ");
                    double km = scan.nextDouble();
                    System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
                    break;
                case 2:
                    System.out.print("Enter miles: ");
                    double miles = scan.nextDouble();
                    System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
                    break;
                case 3:
                    System.out.print("Enter meters: ");
                    double meters = scan.nextDouble();
                    System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
                    break;
                case 4:
                    System.out.print("Enter feet: ");
                    double feet = scan.nextDouble();
                    System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
                    break;
                case 5:
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
