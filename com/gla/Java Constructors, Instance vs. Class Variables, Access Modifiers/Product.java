public class Product {
    private String productName;
    private double price;
    static int totalProducts = 0;

    public Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: Rs. " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }
}
