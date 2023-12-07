package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("Please enter the book you want to add.[type,name,auther,price] ");
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextInt());
        String name = book.getName();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book1 = bookList.getBook(i);
            if(book1.getName().equals(name)){
                System.out.println("Already exist.");
                return;
            }
        }
        if(currentSize == bookList.getBooks().length){
            System.out.println("No place to put down.");
        }else {
            bookList.setBook(currentSize,book);
            bookList.setUsedSize(currentSize+1);
        }
    }
}
