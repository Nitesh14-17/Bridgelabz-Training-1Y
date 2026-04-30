import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryBookManager {

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS books (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "title VARCHAR(100), " +
                "author VARCHAR(50), " +
                "status VARCHAR(10))";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Table created successfully");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertBook(String title, String author) {
        String sql = "INSERT INTO books (title, author, status) VALUES (?, ?, 'Available')";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.executeUpdate();
            System.out.println("Book inserted successfully");
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAvailableBooks() {
        String sql = "SELECT * FROM books WHERE status = 'Available'";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("\n--- Available Books ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void markBookAsIssued(int bookId) {
        String sql = "UPDATE books SET status = 'Issued' WHERE id = ?";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Book marked as Issued");
            } else {
                System.out.println("Book not found");
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBook(int bookId) {
        String sql = "DELETE FROM books WHERE id = ?";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Book deleted successfully");
            } else {
                System.out.println("Book not found");
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllBooks() {
        String sql = "SELECT * FROM books";
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("\n--- All Books ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String status = rs.getString("status");
                System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + status);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
