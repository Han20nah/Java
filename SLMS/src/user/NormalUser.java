package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOperation[]{
                new Exit(),
                new SearchBook(),
                new BorrowBook(),
                new ReturnBook()
        };

    }
    public int menu(){
        System.out.println("**** NormalUser ****");
        System.out.println("1.Search Books");
        System.out.println("2.Borrow Books");
        System.out.println("3.Return Books");
        System.out.println("0.Exit System");
        System.out.println("*********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enetr your operation");
        int choice = scanner.nextInt();

        return choice;
    }
}
