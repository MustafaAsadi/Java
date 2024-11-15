public class Clothing extends Product {
    private String Size;

    public Clothing(int ID, double price, String name, String size) {
        super(ID, price, name);
        Size = size;
    }
    @Override
    public double Discount() {
        return this.Price * 0.8;
    }


    @Override
    public  void getInfo() {

        System.out.println("Name:" + this.Name);
        System.out.println("ID:"+this.ID);
        System.out.println("Price:" + this.Price + "$");
        System.out.println("Type:Clothing");
        System.out.println("size:" + this.Size);

    }


}
