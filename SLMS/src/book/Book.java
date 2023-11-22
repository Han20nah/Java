package book;

public class Book {

    private String type;
    private String name;
    private String auther;
    private int price;
    private boolean isborrowed;

    public Book(String type, String name, String auther, int price) {
        this.type = type;
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIsborrowed() {
        return isborrowed;
    }

    public void setIsborrowed(boolean isborrowed) {
        this.isborrowed = isborrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                ", isborrowed=" + isborrowed +
                '}';
    }
}
