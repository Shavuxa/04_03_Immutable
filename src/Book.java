public class Book {

    private final String bookName;
    private final String bookAutor;
    private final int bookCountPages;
    private final String bookISBN;

    public Book(String bookName, String bookAutor, int bookCountPages, String bookISBN) {
        this.bookName = bookName;
        this.bookAutor = bookAutor;
        this.bookCountPages = bookCountPages;
        this.bookISBN = bookISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public int getBookCountPages() {
        return bookCountPages;
    }

    public String getBookISBN() {
        return bookISBN;
    }
}
