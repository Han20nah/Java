package user;

public class ManageUser extends User{
    public ManageUser(String name) {
        super(name);
    }

    public void menu(){
        System.out.println("******************");
        System.out.println("1.Search Books");
        System.out.println("2.Add New Book");
        System.out.println("3.Delete Book");
        System.out.println("4.Display Books");
        System.out.println("0.Exit System");
        System.out.println("******************");
    }


}
