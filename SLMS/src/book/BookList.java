package book;

/**
 * The BookList class represents a list of books int the library.
 */
public class BookList {
    private Book[] books; //Array to store books
    private int usedSize; //Number of used elements in the array
    public static final int DEFAULT_CAPACITY = 10; //Default capaacity of the array

    /**
     * Constructor to initialize a new BookList with default books
     */
    public BookList(){
        this.books = new Book[DEFAULT_CAPACITY];
        //Initializing the array with some default books
        this.books[0] = new Book("romance novel","The Love Hypothesis","Laura Steven",45);
        this.books[1] = new Book("Financial","The Psychology of Money","Morgan Housel",40);

        this.usedSize = 2; //Number of initially used elements
    }

    /**
     * Get the number of used elements in the BookList.
     * @return The number of used elements.
     */

    public int getUsedSize() {
        return usedSize;
    }

    /**
     * Set the number of used elements in the BookList.
     * @param usedSize The new number of used elements.
     */

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    /**
     * Get the book at the specified position in the BookList.
     * @param pos The position of the book to retrieve.
     * @return The Book object at the specified position.
     */

    public Book getBook(int pos) {
        return books[pos];
    }

/**
 * Set the book at the specified position in the BookList.
 * @param pos The position to set the book.
 * @param book The Book object to set at the specified position.
 */

    public void setBook(int pos,Book book) {
        books[pos] = book;
    }

    /**
     * Get the array of books in the BookList.
     * @return The array of books.
     */

    public Book[] getBooks() {
        return books;
    }

    /**
     * Set the book at the specified position in the BookList.
     * @param pos The position to set the book.
     * @param book The Book object to set at the specified position.
     */

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }
}
