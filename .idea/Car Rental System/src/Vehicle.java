abstract class  Vehicle {
    protected int ID;
    protected String Model;
    private int RentalPricePerDay;

    public Vehicle(int ID, String model, int rentalPricePerDay) {
        this.ID = ID;
        Model = model;
        RentalPricePerDay = rentalPricePerDay;
    }



    public void calculateRentalCost(int days) {
        System.out.println("The rent for " + Model + " for " + days + " days is:" + RentalPricePerDay*days +"$");
    }
    public abstract void getDescription();



}
