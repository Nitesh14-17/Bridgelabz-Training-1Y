public class EuclideanDistanceCalculator {
    
    static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        
        double[] result = new double[2];
        result[0] = slope;
        result[1] = intercept;
        return result;
    }
    
    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 3, y2 = 4;
        
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
        
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        double[] equation = lineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + equation[0] + "x + " + equation[1]);
    }
}
