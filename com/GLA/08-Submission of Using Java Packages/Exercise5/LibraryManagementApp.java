import library.books.*;
import library.members.*;
import library.transactions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        System.out.println("===== Exercise 5 =====\n");

        List<Book> books = new ArrayList<>();
        List<Member> members = new ArrayList<>();
        List<Transaction> txns = new ArrayList<>();

        System.out.println("Adding Books:");
        Book b1 = new Book("B001", "Java Programming", "Herbert Schildt", "978-0071606868");
        Book b2 = new Book("B002", "Data Structures", "M.A. Weiss", "978-0071606855");
        Book b3 = new Book("B003", "Algorithm Design", "Jon Kleinberg", "978-0321295256");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println("Added " + books.size() + " books\n");

        System.out.println("Registering Members:");
        Member m1 = new Member("M001", "Raj Kumar", "raj@email.com", "9876543210");
        Member m2 = new Member("M002", "Priya Singh", "priya@email.com", "9876543211");
        Member m3 = new Member("M003", "Arjun Verma", "arjun@email.com", "9876543212");

        members.add(m1);
        members.add(m2);
        members.add(m3);
        System.out.println("Registered " + members.size() + " members\n");

        System.out.println("Issuing Books:");
        Transaction t1 = new Transaction("TXN001", "M001", "B001", LocalDate.now(), "ISSUED");
        Transaction t2 = new Transaction("TXN002", "M002", "B002", LocalDate.now(), "ISSUED");
        Transaction t3 = new Transaction("TXN003", "M003", "B003", LocalDate.now(), "ISSUED");

        txns.add(t1);
        txns.add(t2);
        txns.add(t3);

        b1.setAvail(false);
        b2.setAvail(false);
        b3.setAvail(false);
        System.out.println("Issued \n");

        System.out.println("=== BOOKS ===");
        for (Book b : books) {
            b.print();
            System.out.println();
        }

        System.out.println("=== MEMBERS ===");
        for (Member m : members) {
            m.print();
            System.out.println();
        }

        System.out.println("=== TRANSACTIONS ===");
        for (Transaction t : txns) {
            t.print();
            System.out.println();
        }
    }
}
