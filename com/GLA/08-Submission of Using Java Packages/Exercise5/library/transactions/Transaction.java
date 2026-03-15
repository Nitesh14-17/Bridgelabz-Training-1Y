package library.transactions;

import java.time.LocalDate;

public class Transaction {
    private String id;
    private String memberId;
    private String bookId;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private String status;

    public Transaction(String id, String memberId, String bookId, LocalDate issueDate, String status) {
        this.id = id;
        this.memberId = memberId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.status = status;
        this.returnDate = null;
    }

    public String getId() { return id; }
    public String getMemberId() { return memberId; }
    public String getBookId() { return bookId; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public String getStatus() { return status; }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        this.status = "RETURNED";
    }

    public void print() {
        System.out.println("Txn ID: " + id);
        System.out.println("Member: " + memberId);
        System.out.println("Book: " + bookId);
        System.out.println("Issue: " + issueDate);
        System.out.println("Return: " + (returnDate != null ? returnDate : "Not Returned"));
        System.out.println("Status: " + status);
    }
}
