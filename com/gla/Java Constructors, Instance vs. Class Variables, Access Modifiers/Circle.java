public class Circle {
    private double radius;

    public Circle() {
        this(5.0);
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14159 * radius;
    }

    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}
