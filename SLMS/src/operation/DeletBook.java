package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

// This class implements the IOperation interface for deleting a book
public class DeletBook implements IOperation {

    // The work method to perform the delete operation on the BookList
    @Override
    public void work(BookList bookList) {
        System.out.println("Please enter the book's name you want to delete.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Variables to keep track of the position of the book to be deleted
        int pos = -1;
        int currentSize = bookList.getUsedSize();
        int i = 0;

        // Iterate through the existing books to find the position of the book to be deleted
        for (; i < currentSize; i++) {
            Book bool = bookList.getBook(i);
            if (bool.getName().equals(name)) {
                pos = i;
                break;
            }
        }

        // Check if the book to be deleted is found
        if (i == currentSize) {
            System.out.println("Can't find the specified book.");
            return;
        }

        // Shift the books to fill the gap left by the deleted book
        int j = pos;
        for (; j < currentSize - 1; j++) {
            Book book = bookList.getBook(j + 1);
            bookList.setBooks(j, book);
        }

        // Set the last position to null and update the used size
        bookList.setBooks(j, null);
        bookList.setUsedSize(currentSize - 1);
    }
}