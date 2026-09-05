package Assignement2_DesignPattern.BookManagement;

public class Book {

    /*
    * Encapsulation used
    * Variables are accessed through getters and setters
    * Builder patterns implemented to set the values for books
    * */

    private  final int bookId;
    private  String title;
    private  String author;
    private  String isbn;
    private  String yearofpub;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYearofpub(String yearofpub) {
        this.yearofpub = yearofpub;
    }

    public Book(Builderbook book){
        this.bookId = book.bookId;
        this.title = book.title;
        this.author = book.author;
        this.isbn = book.isbn;
        this.yearofpub = book.yearofpub;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getYearofpub() {
        return yearofpub;
    }

    public void updateBookTitle(String bookTitle){
        this.title = bookTitle;
    }

    @Override
    public String toString() {
        return "Book Details: " +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearofpub='" + yearofpub + '\''
                ;
    }

    /*
    Builder Pattern used for Book Class
    */
    public static  class Builderbook {
        private final int bookId;
        private final String title;
        private final String author;
        private String isbn = "";
        private String yearofpub = "";

        public Builderbook(int bookdId, String title, String author){
            this.bookId = bookdId;
            this.title = title;
            this.author = author;
        }
        public Builderbook isbn(String isbn){
            this.isbn  = isbn;
            return this;
        }
        public Builderbook yearofpub(String yearofpub){
            this.yearofpub = yearofpub;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
