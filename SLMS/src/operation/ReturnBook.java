package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("Please enter the book you want to return. ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setIsborrowed(false);
                System.out.println(book);
                System.out.println("return success.");
            }
        }
        System.out.println("Can't return. ");
    }
}
