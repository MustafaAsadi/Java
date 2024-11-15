public class Electronics extends Product {

    private int warrantyPeriod;

    public Electronics(int ID, double price, String name, int warrantyPeriod) {
        super(ID, price, name);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double Discount() {
        return this.Price*0.8;
    }

    @Override
    public void getInfo() {
        System.out.println("Name:" + this.Name);
        System.out.println("ID:"+this.ID);
        System.out.println("Price:" + this.Price + "$");
        System.out.println("Type:electronics");
        System.out.println("Warranty period:" + this.warrantyPeriod);

    }



}
