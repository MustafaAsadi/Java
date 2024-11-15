import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //,,,,);
        System.out.print("Enter the worker name:");
        String workerName = scan.nextLine();

        System.out.print("Enter the worker ID:");
        int ID = scan.nextInt();

        System.out.print("Enter the section which the worker belongs to:");
        int workerSection = scan.nextInt();

        System.out.println("Enter the name of the animal:");
        String animalName = scan.next();

        System.out.print("Enter the animal ID:");
        int animalID = scan.nextInt();

        System.out.print("Enter the section that the animal belongs:");
        int animalSection = scan.nextInt();

        System.out.print("Is this animal dengerous to humans? ");
        boolean isDangerousToHuman = scan.nextBoolean();

        System.out.print("Enter the speed of the animal in KM:");
        int speed = scan.nextInt();

        System.out.print("Enter how the anmial moves:");
        String mobility = scan.next();

        System.out.println("Enter if the worker deals with predetors");
        boolean dealsWithPredetor = scan.nextBoolean();
        Cage ca = null;

        if(isDangerousToHuman) {
            //boolean isFit, String foodPlace, String metalType, boolean isOpen)
            System.out.println("Enter the cage metal");
            String metalType = scan.next();
            System.out.println("Enter if it's opened");
            boolean isOpen = scan.nextBoolean();
            System.out.println("Enter food place if exists");
            String fp = scan.next();
            System.out.println("is fit the animal");
            Boolean isFit = scan.nextBoolean();
            ca = new Metal(isFit,fp,metalType,isOpen);


        }else {
            //ca = new wooden()
        }


        Worker x = new Worker(workerName,ID,workerSection,animalName,animalID,animalSection,isDangerousToHuman,speed,mobility,dealsWithPredetor);
        boolean display = true;
        x.decide(display,ca);

    }





}