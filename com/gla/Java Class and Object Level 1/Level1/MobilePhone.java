public class MobilePhone {
    String brand;
    String model;
    double price;
    
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("Samsung", "Galaxy S20", 70000);
        p1.display();
        
        System.out.println();
        
        MobilePhone p2 = new MobilePhone("Apple", "iPhone 13", 80000);
        p2.display();
    }
}
