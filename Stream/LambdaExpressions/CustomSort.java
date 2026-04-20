import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String n, double p, double r, double d) {
        name = n;
        price = p;
        rating = r;
        discount = d;
    }
}

public class CustomSort {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("A", 100, 4.5, 10));
        list.add(new Product("B", 80, 4.8, 20));
        list.add(new Product("C", 120, 4.2, 5));
        list.sort((a, b) -> Double.compare(a.price, b.price));
        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        list.sort((a, b) -> Double.compare(b.discount, a.discount));
    }
}
