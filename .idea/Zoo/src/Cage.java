public abstract class Cage {
    private boolean isFit;
    private String foodPlace;
    private String madein;

    public Cage(boolean isFit, String  foodPlace) {
        this.isFit = isFit;
        this.foodPlace = foodPlace;
    }

    public boolean isFit() {
        return isFit;
    }

    public String getFoodPlace() {
        return foodPlace;
    }

    public String getMadein() {
        return madein;
    }

    public  void setIsFit(boolean isFit) {
        this.isFit = isFit;
    }


    public void setFoodPlace (String foodPlace) {
        this.foodPlace = foodPlace;
    }

    public abstract String setMadeIn(String nameOfLand);
    public abstract String setMadeInByCode(int code);

    @Override
    public String toString() {
        return "Cage{" +
                "isFit=" + isFit +
                ", foodPlace='" + foodPlace + '\'' +
                ", madein='" + madein + '\'' +
                '}';
    }
}