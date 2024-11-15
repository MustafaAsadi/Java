import java.util.Scanner;

public class Worker {

    private String name;
    private int ID;
    private int section;

    private String animalName;
    private int animalID;
    private int animalSection;

    private boolean isDangerousToHuman;
    private float speed;

    private String mobilty;

    private boolean dealsWithPredetor;

    private boolean isFit;
    private String foodPlace;

    private String metalType;

    private boolean isOpen;

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

    public Worker(String name, int ID, int section, String animalName, int animalID,
                  int animalSection, boolean isDangerousToHuman, float speed, String mobilty, boolean dealsWithPredetor) {
        this.name = name;
        this.ID = ID;
        this.section = section;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalSection = animalSection;
        this.isDangerousToHuman = isDangerousToHuman;
        this.speed = speed;
        this.mobilty = mobilty;
        this.dealsWithPredetor = dealsWithPredetor;
    }

    public Worker(String name, int ID, int section, boolean dealsWithPredetor) {
        this.name = name;
        this.ID = ID;
        this.section = section;
        this.dealsWithPredetor = dealsWithPredetor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
    public void decide(boolean display,Cage ca) {
        if( this.dealsWithPredetor ) {
            Predetor x = new Predetor(animalName,animalID,animalSection,isDangerousToHuman,speed,ca);
            if(display) {
                System.out.println("Animal info:");
                x.getID();
                x.getName();
                x.getSection();
                x.Feed();
                System.out.println("------------------------------------------------------");
                System.out.println("The Cage info:");
                x.displayCageinfo(ca);
                System.out.println("-----------------------------------------------------");
                System.out.println("The worker info:");
                System.out.println("Name:"+name);
                System.out.println("ID:"+ID);
                System.out.println("Section#:"+section);
            }

        }
        else {
            Animal y = new UnPredetor(animalName,animalID,animalSection,mobilty,speed);
            System.out.println("unpred");
        }
    }
}
