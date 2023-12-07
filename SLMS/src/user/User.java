package user;

import book.BookList;
import operation.IOperation;

public abstract class User {//抽象方法
    protected String name;//protected是除了不同包中的非子类不可以访问

    protected IOperation[] ioPerations;

    public User(String name) {
        this.name = name;
    }//抽象类中也可以包含普通方法，构造方法等

    public abstract int menu();//抽象方法不能有具体实现，需要子类对其进行重写

    public void doOperation(int choice, BookList bookList){
        ioPerations[choice].work(bookList);
    }

}
