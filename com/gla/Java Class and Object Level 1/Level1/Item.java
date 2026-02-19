public class Item {
    String code;
    String name;
    double price;
    
    public Item(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Item Code: " + code);
        System.out.println("Item Name: " + name);
        System.out.println("Price: " + price);
    }
    
    public double totalCost(int qty) {
        return price * qty;
    }
    
    public static void main(String[] args) {
        Item i1 = new Item("IT001", "Laptop", 50000);
        i1.display();
        System.out.println("Total Cost for 2 units: " + i1.totalCost(2));
        
        System.out.println();
        
        Item i2 = new Item("IT002", "Mouse", 500);
        i2.display();
        System.out.println("Total Cost for 5 units: " + i2.totalCost(5));
    }
}
