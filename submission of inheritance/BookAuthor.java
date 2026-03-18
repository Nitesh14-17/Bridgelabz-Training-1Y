class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}

public class BookAuthor {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java";
        a.publicationYear = 2020;
        a.name = "John";
        a.bio = "Writer";
        a.displayInfo();
    }
}
