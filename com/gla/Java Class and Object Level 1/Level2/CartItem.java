public class CartItem {
    String name;
    double price;
    int qty;
    
    public CartItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.qty = 0;
    }
    
    public void add(int q) {
        qty += q;
        System.out.println("Added " + q + " units of " + name);
    }
    
    public void remove(int q) {
        if (q <= qty) {
            qty -= q;
            System.out.println("Removed " + q + " units of " + name);
        } else {
            System.out.println("Cannot remove more than available quantity");
        }
    }
    
    public double total() {
        return price * qty;
    }
    
    public void display() {
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + total());
    }
    
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Notebook", 50);
        c1.add(3);
        c1.display();
        
        System.out.println();
        c1.add(2);
        c1.display();
        
        System.out.println();
        c1.remove(1);
        c1.display();
    }
}
