public class Predetor extends Animal {
    private boolean isDangerousToHuman;
    private float speed;
    private Cage metal;

    private boolean isFit;
    private String foodPlace;

    private String metalType;

    private boolean isOpen;

    public Predetor(String name, int ID, int section, boolean isDangerousToHuman, float speed
            ,Cage metal) {
        super(name, ID, section);
        this.isDangerousToHuman = isDangerousToHuman;
        this.speed = speed;
        this.metal = metal;
    }

    public void displayCageinfo(Cage ca) {
        System.out.println(ca.toString());;

    }
    public void setFit(boolean fit) {
        isFit = fit;
    }

    public void setFoodPlace(String foodPlace) {
        this.foodPlace = foodPlace;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }



    public boolean isFit() {
        return isFit;
    }

    public String getFoodPlace() {
        return foodPlace;
    }

    public String getMetalType() {
        return metalType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void isDangerousToHuman() {
        if (this.isDangerousToHuman) {
            System.out.println("This animal is dangerous to humans careful!");
        } else {
            System.out.println("This animal is harmless to humans");
        }
    }

    public void setDangerousToHuman(boolean dangerousToHuman) {
        isDangerousToHuman = dangerousToHuman;
    }

    public void getSpeed() {
        System.out.println("The speed of this animal reaches " + this.speed + "KM");

    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void Feed() {
        System.out.println(getName() +" feeds on Meat");
    }

    public void getIfno(){
        System.out.println(metal.setMadeInByCode(222));

        metal.getFoodPlace();
    }
}