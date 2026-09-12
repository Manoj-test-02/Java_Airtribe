package Assignement2_DesignPattern.InventoryManagement;

import Assignement2_DesignPattern.BookManagement.Book;
import Assignement2_DesignPattern.NotificationManagement.NotifierFactory;
import Assignement2_DesignPattern.Patron.Patron;

import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;

public class BookLending extends NotifierFactory {
    private final Patron patron;
    private final Book book;
    private final LocalDate issueDate;
    private final LocalDate dueDate;

    @Override
    public String toString() {
        return "BookLending Details: " +
                "Patron=" + patron.getPatronFirstName() +
                ", Book=" + book.getTitle() +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate ;
    }

    BookLending(Patron patron, Book book, LocalDate issueDate, LocalDate dueDate){
        this.patron = patron;
        this.book = book;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Patron getPatron() {
        return patron;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public static boolean CheckOutBook(BookLending lendedBooks){
        if(InventoryManagement.isBookPresent(lendedBooks.book.getTitle())){
            return false;
        } else {
            InventoryManagement.addToBorrowedBook(lendedBooks.book);
            return true;
        }
    }

    public static boolean returnBook (BookLending lendedBooks){
        InventoryManagement.removeBorrowdBook(lendedBooks.book);
        return true;
    }

    public static void SendCheckoutNotification(BookLending lendedBooks, boolean isCheckedOut, String[] channel){
        if (isCheckedOut) {
            for (String c : channel) {
                NotifierFactory.create(c).SendBookLending(lendedBooks.toString());
            }
        } else {
            System.out.println("Requested Book is not available. Tentative Available Date: " + lendedBooks.dueDate.plusDays(2));

        }

    }

    public static void SendReturnNotification(boolean isreturned, String[] channel){
        if (isreturned) {
            for (String c : channel) {
                NotifierFactory.create(c).SendBookReturn("Thanks for Returning the books");
            }
        } else {
            System.out.println("Unable to Return the Book. Check with the Admin");

        }

    }
}
