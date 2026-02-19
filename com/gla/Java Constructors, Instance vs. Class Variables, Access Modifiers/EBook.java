public class EBook extends BookLibrary {
    private String format;
    private double fileSize;

    public EBook() {
        super();
        this.format = "PDF";
        this.fileSize = 0.0;
    }

    public EBook(String isbn, String title, String author, String format, double fileSize) {
        super(isbn, title, author);
        this.format = format;
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Format: " + format);
        System.out.println("File Size: " + fileSize + " MB");
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
