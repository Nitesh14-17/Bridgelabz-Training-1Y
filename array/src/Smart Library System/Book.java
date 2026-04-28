public class Book {
    public static String name = "Smart Public Library";
    
    protected int id;
    protected String title;
    protected double price;
    
    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    
    public double calculateFine(int days) {
        return 0;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public static String getLibraryName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
