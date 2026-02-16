public class SpringSeason {
    
    public static boolean isSpring(int m, int d) {
        if (m == 3 && d >= 20) {
            return true;
        } else if (m > 3 && m < 6) {
            return true;
        } else if (m == 6 && d <= 20) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments");
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }
        
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        
        if (isSpring(m, d)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
