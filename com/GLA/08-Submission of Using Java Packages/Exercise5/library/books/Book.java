package library.books;

public class Book {
    private String id;
    private String name;
    private String author;
    private String isbn;
    private boolean avail;

    public Book(String id, String name, String author, String isbn) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.avail = true;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvail() { return avail; }
    public void setAvail(boolean avail) { this.avail = avail; }

    public void print() {
        System.out.println("Book ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (avail ? "Yes" : "No"));
    }
}
