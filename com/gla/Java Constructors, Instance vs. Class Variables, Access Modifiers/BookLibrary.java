public class BookLibrary {
    public String isbn;
    protected String title;
    private String author;

    public BookLibrary() {
        this.isbn = "0000000000";
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public BookLibrary(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
