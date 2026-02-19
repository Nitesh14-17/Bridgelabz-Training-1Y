public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " has been borrowed successfully.");
        } else {
            System.out.println(title + " is not available for borrowing.");
        }
    }

    public void returnBook() {
        availability = true;
        System.out.println(title + " has been returned successfully.");
    }

    public boolean isAvailable() {
        return availability;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }
}
