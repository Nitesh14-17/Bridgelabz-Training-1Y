public class CollinearPointsChecker {
    
    static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, 
                                       double x3, double y3) {
        if (x2 == x1 || x3 == x1) {
            return x2 == x3;
        }
        
        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);
        double slope3 = (y3 - y1) / (x3 - x1);
        
        return slope1 == slope2 && slope2 == slope3;
    }
    
    static boolean isCollinearByArea(double x1, double y1, double x2, double y2, 
                                      double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 0.0001;
    }
    
    public static void main(String[] args) {
        double x1 = 2, y1 = 4;
        double x2 = 4, y2 = 6;
        double x3 = 6, y3 = 8;
        
        System.out.println("Point A: (" + x1 + ", " + y1 + ")");
        System.out.println("Point B: (" + x2 + ", " + y2 + ")");
        System.out.println("Point C: (" + x3 + ", " + y3 + ")");
        
        System.out.println("\nCollinear (Slope Method): " + isCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear (Area Method): " + isCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}
