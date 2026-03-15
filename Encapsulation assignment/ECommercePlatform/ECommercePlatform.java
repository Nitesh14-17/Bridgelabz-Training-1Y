abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public abstract double calculateDiscount();
}
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "Electronics Tax"; }
}
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "Clothing Tax"; }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.05; }
}
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Phone", 10000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 500)
        };
        for (Product p : products) {
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable)p).calculateTax();
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(finalPrice);
        }
    }
}
