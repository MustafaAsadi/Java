public class Metal extends Cage {
    private String MetalType;
    private boolean isOpen;



    public Metal(boolean isFit, String foodPlace, String metalType, boolean isOpen) {
        super(isFit, foodPlace);
        MetalType = metalType;
        this.isOpen = isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getMetalType() {
        return MetalType;
    }

    public void setMetalType(String metalType) {
        MetalType = metalType;
    }



    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }


    public void isOpen (){
        if(this.isOpen) {
            System.out.println("Caution:the animal is unleashed");
        }
        else {
            System.out.println("the cage is closed");
        }

    }

    @Override
    public String setMadeIn(String nameOfLand) {
        return Countries.getCountry(nameOfLand).name();
        //return null;
    }
    @Override
    public String setMadeInByCode(int code) {
        //return Countries.getContryByCode(code);
        //return null;
        return Countries.getContryByCode(code).name();
    }

    @Override
    public String toString() {
        return "Metal{" +
                "MetalType='" + MetalType + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}