package operation;

import book.Book;
import book.BookList;

public class ShowBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("Show books!");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
