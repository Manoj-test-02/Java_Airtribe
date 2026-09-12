package Assignement2_DesignPattern.InventoryManagement;

import Assignement2_DesignPattern.BookManagement.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InventoryManagement {
    private static final ArrayList<Book> borrowedbook = new ArrayList<>();

    public static void addToBorrowedBook(Book book){
        borrowedbook.add(book);
    }
    public static void removeBorrowdBook (Book book){
        for(Book b: borrowedbook){
            if(b.getTitle().equals(book.getTitle())){
                borrowedbook.remove(b);
            }
        }
    }

    public static boolean isBookPresent (String title){
        for(Book b : borrowedbook){
            if(b.getTitle().equals(title)){
                return true;
            }
        }
        return false;

    }
}
