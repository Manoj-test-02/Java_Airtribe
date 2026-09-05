package Assignement2_DesignPattern.InventoryManagement;


import Assignement2_DesignPattern.BookManagement.Book;
import Assignement2_DesignPattern.BookManagement.BookManager;
import Assignement2_DesignPattern.Patron.Manager;
import Assignement2_DesignPattern.Patron.Patron;
import Assignement2_DesignPattern.Patron.Subscription;
import Assignement2_DesignPattern.PaymentStrategy.CreditCardPayment;
import Assignement2_DesignPattern.PaymentStrategy.NetBanking;
import Assignement2_DesignPattern.PaymentStrategy.PaymentMethod;
import Assignement2_DesignPattern.PaymentStrategy.UPIPayment;

import java.time.LocalDate;

import static Assignement2_DesignPattern.InventoryManagement.BookLending.*;

public class LibraryManagement {
    public static void main(String[] args) {

        String[] channel = {"whatsapp", "sms"};
        BookManager bookManager = new BookManager();
        PaymentMethod paymentMethod = new PaymentMethod();
        Manager addMember = new Manager();

        System.out.println("-----Implemented Builder Patten-----");
        System.out.println(" ");
        Book book1 = new Book.Builderbook(1, "Java Programming", "Max Miller")
                .isbn("IJKP")
                .yearofpub("2025")
                .build();

        Book book2 = new Book.Builderbook(2, "Phython Programming", "PY Union")
                .isbn("IJPYPP")
                .yearofpub("2028")
                .build();

        Book book3 = new Book.Builderbook(3, "Science Fiction", "SC club")
                .isbn("ISCIL")
                .yearofpub("2000")
                .build();
        bookManager.addBooks(book1);
        bookManager.addBooks(book2);
        bookManager.addBooks(book3);
        System.out.println(" ");

        System.out.println("-----Implemented Strategy Patten and Factory Pattern-----");
        System.out.println("-----Member 1-----");
        System.out.println(" ");
        Patron member1 = new Patron(1, "Jhon", "Keller", "test@gmail.com", "+91 987353536", true, Subscription.SIXMONTH);
        paymentMethod.setPaymentStrategy(new CreditCardPayment("76625262728"));
        boolean Status = paymentMethod.checkout(member1.getUserSubscription().getPrice());
        addMember.addPatron(member1).sendNotification(member1,Status, channel);
        System.out.println("-----Member 2-----");
        System.out.println(" ");

        Patron member2 = new Patron(1, "Malik", "Thomson", "test12@gmail.com", "+91 987353786", true, Subscription.SIXMONTH);
        paymentMethod.setPaymentStrategy(new UPIPayment("test@okicici"));
        boolean Status1 = paymentMethod.checkout(member2.getUserSubscription().getPrice());
        addMember.addPatron(member2).sendNotification(member2,Status1, channel);

        System.out.println("-----Member 3-----");
        System.out.println(" ");
        Patron member3 = new Patron(1, "Kushal", "Venkat", "test13@gmail.com", "+91 987353865", true, Subscription.YEARLY);
        paymentMethod.setPaymentStrategy(new NetBanking("72565358652"));
        boolean Status2 = paymentMethod.checkout(member3.getUserSubscription().getPrice());
        addMember.addPatron(member3).sendNotification(member2,Status2, channel);

        System.out.println("-----Book Lending functionality-----");
        System.out.println(" ");

        BookLending lend1 = new BookLending(member1, book1, LocalDate.now(), LocalDate.now().plusDays(14));
        BookLending lend2 = new BookLending(member2, book2, LocalDate.now(), LocalDate.now().plusDays(14));
        boolean isCheckedOut = CheckOutBook(lend1);
        SendCheckoutNotification(lend1, isCheckedOut, channel);

        System.out.println(" ");

        boolean isCheckedOut2 = CheckOutBook(lend1);
        SendCheckoutNotification(lend1, isCheckedOut2, channel);

        System.out.println(" ");
        boolean isCheckedOut3 = CheckOutBook(lend2);
        SendCheckoutNotification(lend2, isCheckedOut3, channel);
        System.out.println(" ");

        System.out.println("-----Book Return functionality-----");
        System.out.println(" ");

        boolean isReturned = returnBook(lend1);
        SendReturnNotification(isReturned, channel);
        System.out.println(" ");

        System.out.println("-----Lending the returned book functionality-----");
        System.out.println(" ");

        boolean isCheckedOut4 = CheckOutBook(lend1);
        SendCheckoutNotification(lend1, isCheckedOut4, channel);

    }
}
