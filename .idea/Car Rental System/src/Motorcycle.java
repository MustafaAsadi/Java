public class Motorcycle extends Vehicle{
    private int engineSize;
    private boolean hasSidecar;

    public Motorcycle(int ID, String model, int rentalPricePerDay, int engineSize, boolean hasSidecar) {
        super(ID, model, rentalPricePerDay);
        this.engineSize = engineSize;
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void getDescription() {
        System.out.println("ID:" + ID);
        System.out.println("Model:" + Model);
        System.out.println("engine size:" + this.engineSize+" KG");
        if(hasSidecar==true ) {
            System.out.println("The motorcycle has side car");
        }
        else {
            System.out.println("The motorcycle does not have side car");
        }


    }
}

