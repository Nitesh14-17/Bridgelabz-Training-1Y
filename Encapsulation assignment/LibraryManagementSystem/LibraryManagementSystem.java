abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void setItemId(int itemId) { this.itemId = itemId; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void getItemDetails() {
        System.out.println(itemId + " " + title + " " + author);
    }
    public abstract int getLoanDuration();
}
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { available = false; }
    public boolean checkAvailability() { return available; }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 7; }
    public void reserveItem() { available = false; }
    public boolean checkAvailability() { return available; }
}
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 3; }
    public void reserveItem() { available = false; }
    public boolean checkAvailability() { return available; }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Book1", "A"),
            new Magazine(2, "Mag1", "B"),
            new DVD(3, "DVD1", "C")
        };
        for (LibraryItem i : items) {
            i.getItemDetails();
            System.out.println(i.getLoanDuration());
        }
    }
}
