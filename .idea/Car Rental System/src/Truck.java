public class Truck extends Vehicle {
    private int cargoCapacity;
    private String truckType;

    public Truck(int ID, String model, int rentalPricePerDay, int cargoCapacity, String truckType) {
        super(ID, model, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
        this.truckType = truckType;
    }
    @Override
    public void getDescription() {
        System.out.println("ID:" + ID);
        System.out.println("Model:" + Model);
        System.out.println("cargo capacity:" + this.cargoCapacity);
        System.out.println("Truck type:" +this.truckType);

    }

}
