package book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public void BookList(){
        this.books = new Book[10];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(int pos,Book book) {
        books[pos] = book;
    }
}
