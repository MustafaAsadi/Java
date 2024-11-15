public class UnPredetor extends Animal {

    private String mobilty;
    private float speed;
    private Cage Wooden;

    private String woodType;
    private boolean isOpen;

    private boolean isFit;
    private String foodPlace;

    public UnPredetor(String name, int ID, int section, String mobilty, float speed) {
        super(name, ID, section);
        this.mobilty = mobilty;
        this.speed = speed;
        this.Wooden = new wooden(isFit(),getFoodPlace(),getWoodType());
    }

    public Cage getWooden() {
        return Wooden;
    }

    public void setWooden(Cage wooden) {
        Wooden = wooden;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isFit() {
        return isFit;
    }

    public void setFit(boolean fit) {
        isFit = fit;
    }

    public String getFoodPlace() {
        return foodPlace;
    }

    public void setFoodPlace(String foodPlace) {
        this.foodPlace = foodPlace;
    }

    public void getMobilty() {
        System.out.println("This animal moves by:"+this.mobilty);
    }

    public void setMobilty(String mobilty) {
        this.mobilty = mobilty;
    }

    public void getSpeed() {
        System.out.println("the speed of this animal is:" + this.speed);
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    @Override
    public void Feed() {
        System.out.println("This anmial feeds on herbs");
    }
    public void displayInfo () {
        getName();
        getID();
        getSection();
        System.out.println("This animal moves by:"+this.mobilty);
        System.out.println("the speed of this animal is:" + this.speed);



    }
}