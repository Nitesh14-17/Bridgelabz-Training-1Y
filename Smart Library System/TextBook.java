public class TextBook extends Book {
    private static final double FINE = 2.0;
    
    public TextBook(int id, String title, double price) {
        super(id, title, price);
    }
    
    @Override
    public double calculateFine(int days) {
        return days * FINE;
    }
    
    @Override
    public String toString() {
        return "TextBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", finePerDay=₹" + FINE +
                '}';
    }
}
