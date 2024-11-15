import java.util.List;

public abstract class Product {
    protected int ID;
    protected double Price;
    protected String Name;

    public Product(int ID, double price, String name) {
        this.ID = ID;
        Price = price;
        Name = name;
    }

    public abstract double Discount();

    public  double getPrice() {
        return this.Price;
    }
    public abstract void getInfo();


}
