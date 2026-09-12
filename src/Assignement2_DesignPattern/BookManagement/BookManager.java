package Assignement2_DesignPattern.BookManagement;

import java.util.ArrayList;

public class BookManager {

    private static final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Book> foundBook = new ArrayList<>();

    public void addBooks(Book book){
        books.add(book);
        System.out.println("New Book added successfully to the System. " +
                "BookId: " + book.getBookId() + " | " + "Book Name: " + book.getTitle());

    }

    public void deleteBookbyId(int bookId){
        for(Book b : books){
            if(b.getBookId() == bookId){
                books.remove(b);
                System.out.println("Book Removed successfully from the system. " +
                        "Removed Book Id: " +b.getBookId() + " | "
                        + "Removed Book Name: " + b.getTitle());
            }
        }
    }

    public String findBookbyName(String bookName){
        if(bookName == null || bookName.isEmpty()){
            return "Kindly provide the Book Name";
        }
        for(Book b : books){
            if(b.getTitle().toLowerCase().contains(bookName.toLowerCase())){
                return b.toString();
            }
        }
        return "Book Not found in the System";
    }

    public ArrayList<Book> findBookbyAuthor (String authorName) throws  Exception{
        if(authorName == null || authorName.isEmpty()) {
            throw new Exception("Author Name should not empty");
        }
        for(Book b : books){
            if(b.getAuthor().toLowerCase().contains(authorName.toLowerCase())){
                foundBook.add(b);
            }
        }
        return foundBook;
    }

    public String findBookbyIsbn(String isbn){
        if(isbn == null || isbn.isEmpty()){
            return "Kindly provide the Book ISBN Number";
        }
        for(Book b : books){
            if((b.getIsbn()).equalsIgnoreCase(isbn)){
                return b.toString();
            }
        }
        return "Book Not found in the System for the ISBN: " +isbn;
    }

    public void updateAuthor(int bookId, String authorName)throws  Exception{
        if(authorName == null || authorName.isEmpty()){
            throw new Exception("Author Name should not be Empty");
        }
        for(Book b : books){
            if(b.getBookId() == bookId){
                b.setAuthor(authorName);
                System.out.println("Author Name updated successfully");
            }
        }

    }

    public void updatePublicationYear(int bookId, String year) throws Exception{
        if(year == null || year.isEmpty()){
            throw new Exception("Year should not be Empty");
        }
        for(Book b : books){
            b.setYearofpub(year);
            System.out.println("Year of the book updated successfully");
        }
    }


}
