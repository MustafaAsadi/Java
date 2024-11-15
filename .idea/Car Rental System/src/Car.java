public class Car extends Vehicle {
    private int numberOFSeat;
    private String fuelType;

    public Car(int ID, String model, int rentalPricePerDay, int numberOFSeat, String fuelType) {
        super(ID, model, rentalPricePerDay);
        this.numberOFSeat = numberOFSeat;
        this.fuelType = fuelType;
    }

    @Override
    public void getDescription() {
        System.out.println("ID:" + ID);
        System.out.println("Model:" + Model);
        System.out.println("Number of seats:" + this.numberOFSeat);
        System.out.println("Fuel type:" + this.fuelType);

    }


}
