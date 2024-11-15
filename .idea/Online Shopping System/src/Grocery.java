import java.text.SimpleDateFormat;
import java.util.Date;

public class Grocery extends Product{
    private Date  expirationDate;
    private String Type;

    public Grocery(int ID, double price, String name, Date expirationDate, String type) {
        super(ID, price, name);
        this.expirationDate = expirationDate;
        this.Type = type;
    }

    @Override
    public  double  Discount() {
        double newPrice = this.Price;
        if(Type.equals("Fruits"))
            newPrice= this.Price * 0.95; //discount 5% for fruits
        if(Type.equals("Vegetables"))
            newPrice = this.Price * 0.85; //discount 15% for vegetables
        if(Type.equals("Cheese"))
            newPrice = this.Price * 0.7; //discount 30% for Cheese
        if(Type.equals("Cleaning"))
            newPrice =this.Price * 0.5; //discount 50% for Cleaning
        if(Type.equals("Meat"))
            newPrice =this.Price * 0.3; //discount 70% for Meat
        return newPrice;

    }
    @Override
    public  void getInfo() {

        System.out.println("Name:" + this.Name);
        System.out.println("ID:"+this.ID);
        System.out.println("Price:" + this.Price + "$");
        System.out.println("Expiration date:" +this.expirationDate);
        System.out.println("Type:Grocery");
        System.out.println("Grocery Type:" + this.Type);

    }

}
