public class Magazine extends Book {
    private static final double FINE = 5.0;
    
    public Magazine(int id, String title, double price) {
        super(id, title, price);
    }
    
    @Override
    public double calculateFine(int days) {
        return days * FINE;
    }
    
    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", finePerDay=₹" + FINE +
                '}';
    }
}
