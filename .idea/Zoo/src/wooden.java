public class wooden extends Cage{
    private String woodType;
    private boolean isOpen;

    public void getWoodType() {
        System.out.println("The type of wood is" + woodType);;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public void isOpen() {
        if(this.isOpen){
            System.out.println("the cage is opened");
        }
        else {
            System.out.println("the cage is cloesd");
        }
    }



    public wooden(boolean isFit, String foodPlace, String woodType) {
        super(isFit, foodPlace);
        this.woodType = woodType;
    }


    @Override
    public String setMadeIn(String nameOfLand) {
        return Countries.getCountry(nameOfLand).name();
    }

    @Override
    public String setMadeInByCode(int code) {
        return Countries.getContryByCode(code).name();
    }
}
