public class Circle {
    double r;
    
    public Circle(double r) {
        this.r = r;
    }
    
    public double area() {
        return 3.14159 * r * r;
    }
    
    public double circumference() {
        return 2 * 3.14159 * r;
    }
    
    public void display() {
        System.out.println("Radius: " + r);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
    
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.display();
        
        System.out.println();
        
        Circle c2 = new Circle(7.5);
        c2.display();
    }
}
