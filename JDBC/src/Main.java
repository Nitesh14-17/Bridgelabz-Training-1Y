public class Main {
    public static void main(String[] args) {
        
        LibraryBookManager.createTable();
        
        LibraryBookManager.insertBook("The Great Gatsby", "F. Scott Fitzgerald");
        LibraryBookManager.insertBook("To Kill a Mockingbird", "Harper Lee");
        LibraryBookManager.insertBook("1984", "George Orwell");
        LibraryBookManager.insertBook("Pride and Prejudice", "Jane Austen");
        
        LibraryBookManager.displayAllBooks();
        
        LibraryBookManager.displayAvailableBooks();
        
        LibraryBookManager.markBookAsIssued(1);
        
        LibraryBookManager.displayAllBooks();
        
        LibraryBookManager.deleteBook(2);
        
        LibraryBookManager.displayAllBooks();
    }
}
