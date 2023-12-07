package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class SearchBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("Please enter the book you want to find. ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("Got it.Here's the information.");
                System.out.println(book);
                return;
            }
        }
        System.out.println("No relevant information found.");
    }
}
