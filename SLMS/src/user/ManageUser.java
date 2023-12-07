package user;

import operation.*;

import java.util.Scanner;

public class ManageUser extends User {//继承了抽象类User需要重写抽象类中的所有方法
    public ManageUser(String name) {//也需要普通的构造方法
        super(name);//super来调用父类的非抽象普通的构造方法
        this.ioPerations = new IOperation[] {//继承的父类的ioPerations，数组的初始化方法,
                new Exit(),
                new SearchBook(),
                new AddBook(),
                new DeletBook(),
                new ShowBook()

        };
    }


    public int menu(){//重写的User中的方法，可以通过
        System.out.println("**** ManageUser ****");
        System.out.println("1.Search Books");
        System.out.println("2.Add New Book");
        System.out.println("3.Delete Book");
        System.out.println("4.Display Books");
        System.out.println("0.Exit System");
        System.out.println("********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your operation");
        int choice = scanner.nextInt();

        return choice;
    }
}


