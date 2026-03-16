public class SmartLibrarySystem {
    public static void main(String[] args) {
        System.out.println("=== " + Book.getLibraryName() + " ===\n");
        
        Book[] books = new Book[3];
        
        books[0] = new TextBook(101, "Java Programming", 299.99);
        books[1] = new Magazine(102, "National Geographic", 99.99);
        books[2] = new TextBook(103, "Data Structures", 399.99);
        
        System.out.println("Books in the Library:");
        System.out.println("--------------------");
        for (Book book : books) {
            System.out.println(book);
        }
        
        System.out.println("\n\nFine Calculations (using Polymorphism):");
        System.out.println("----------------------------------------");
        
        int days = 5;
        
        for (Book book : books) {
            double fine = book.calculateFine(days);
            System.out.println("Book ID: " + book.getId() + 
                             " | Title: " + book.getTitle() + 
                             " | Days Late: " + days + 
                             " | Fine: ₹" + fine);
        }
        
        System.out.println("\n\nFine Calculations for 10 days late:");
        System.out.println("-----------------------------------");
        int days2 = 10;
        
        for (Book book : books) {
            double fine = book.calculateFine(days2);
            System.out.println("Book: " + book.getTitle() + 
                             " | Days Late: " + days2 + 
                             " | Fine: ₹" + fine);
        }
    }
}
