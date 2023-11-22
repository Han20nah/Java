package user;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
    }
    public void menu(){
        System.out.println("******************");
        System.out.println("1.Search Books");
        System.out.println("2.Borrow Books");
        System.out.println("3.Return Books");
        System.out.println("0.Exit System");
        System.out.println("******************");
    }
}
