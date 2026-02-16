import java.util.Scanner;

public class UnitConvertor3 {
    
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    
    public static double convertPoundsToKilograms(double lbs) {
        return lbs * 0.453592;
    }
    
    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }
    
    public static double convertGallonsToLiters(double gal) {
        return gal * 3.78541;
    }
    
    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean cont = true;
        while (cont) {
            System.out.println("\n=== Unit Convertor ===");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Kilograms to Pounds");
            System.out.println("5. Gallons to Liters");
            System.out.println("6. Liters to Gallons");
            System.out.println("7. Exit");
            
            System.out.print("Choose an option (1-7): ");
            int ch = scan.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double f = scan.nextDouble();
                    System.out.println(f + "F = " + convertFahrenheitToCelsius(f) + "C");
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    double c = scan.nextDouble();
                    System.out.println(c + "C = " + convertCelsiusToFahrenheit(c) + "F");
                    break;
                case 3:
                    System.out.print("Enter pounds: ");
                    double lbs = scan.nextDouble();
                    System.out.println(lbs + " lbs = " + convertPoundsToKilograms(lbs) + " kg");
                    break;
                case 4:
                    System.out.print("Enter kilograms: ");
                    double kg = scan.nextDouble();
                    System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " lbs");
                    break;
                case 5:
                    System.out.print("Enter gallons: ");
                    double gal = scan.nextDouble();
                    System.out.println(gal + " gallons = " + convertGallonsToLiters(gal) + " liters");
                    break;
                case 6:
                    System.out.print("Enter liters: ");
                    double l = scan.nextDouble();
                    System.out.println(l + " liters = " + convertLitersToGallons(l) + " gallons");
                    break;
                case 7:
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
