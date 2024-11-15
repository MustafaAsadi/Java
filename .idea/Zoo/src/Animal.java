public class Animal {
    private String name;
    private int ID;
    private int section;

    public Animal(String name, int ID, int section) {
        this.name = name;
        this.ID = ID;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getID() {
        System.out.println("The ID of the animal is:" + this.ID);;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void getSection() {
        System.out.println("The section that this animal belong to is:" + this.section);;
    }

    public void setSection(int section) {
        this.section = section;
    }
    public void Feed() {
        System.out.println("Nothing");
    }
}