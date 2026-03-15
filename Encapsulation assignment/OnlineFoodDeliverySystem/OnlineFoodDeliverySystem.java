abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void getItemDetails() {
        System.out.println(itemName + " " + price + " " + quantity);
    }
    public abstract double calculateTotalPrice();
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return getPrice() * 0.1; }
    public String getDiscountDetails() { return "Veg Discount"; }
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }
    public double applyDiscount() { return getPrice() * 0.05; }
    public String getDiscountDetails() { return "NonVeg Discount"; }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer", 200, 2),
            new NonVegItem("Chicken", 300, 1)
        };
        for (FoodItem f : items) {
            f.getItemDetails();
            System.out.println(f.calculateTotalPrice());
        }
    }
}
