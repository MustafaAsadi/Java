import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        List<Product> Cart = new ArrayList<>();
        boolean run = true;

        while (run) {
            System.out.println("1-Grocery");
            System.out.println("2-Clothing");
            System.out.println("3-Electronics");
            System.out.println("4-Details of Products in the Cart");
            System.out.println("5-Buy");
            System.out.println("Choose:");
            int decision = scan.nextInt();
            switch (decision) {
                case 1: //Grocery
                    System.out.print("Enter the product name:");
                    String GName = scan.next();

                    System.out.print("Enter the Price:");
                    double GPrice = scan.nextDouble();


                    System.out.print("Enter the ID:");
                    int GID = scan.nextInt();

                    System.out.print("Enter the product Type:");
                    String GType = scan.next();

                    System.out.print("Enter the expiration date (dd/MM/yyyy):");
                    String expirationDate = scan.next();
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(expirationDate);



                    Product x = new Grocery(GID,GPrice,GName,date,GType);
                    Cart.add(x);

                    System.out.println("--------------------------------------------------------------");
                    break;



                case 2: //Clothing
                    System.out.print("Enter the product name:");
                    String CName = scan.next();


                    System.out.print("Enter the ID:");
                    int CID = scan.nextInt();

                    System.out.print("Enter the Price:");
                    double CPrice = scan.nextDouble();

                    System.out.print("Enter the Size:");
                    String Size = scan.next();

                    Product y = new Clothing(CID,CPrice,CName,Size);

                    Cart.add(y);

                    System.out.println("--------------------------------------------------------------");
                    break;



                case 3: //Electronics
                    System.out.print("Enter the product name:");
                    String EName = scan.next();

                    System.out.print("Enter the ID:");
                    int EID = scan.nextInt();

                    System.out.print("Enter the Price:");
                    double EPrice = scan.nextDouble();

                    System.out.print("Enter the warranty Period:");
                    int warrantyPeriod = scan.nextInt();

                    Product z = new Electronics(EID,EPrice,EName,warrantyPeriod);
                    Cart.add(z);

                    System.out.println("--------------------------------------------------------------");
                    break;

                case 4:
                    getAllInfo(Cart);
                    break;

                case 5:
                    calculateTotalPrice(Cart);
                    run=false;
                    break;
                default:
                    System.out.println("invalid decision");



            }

        }



    }


    public static void getAllInfo(List<Product> products) {
        int Elements = products.size();
        for(int i = 0 ; i<Elements ; i++){
            products.get(i).getInfo();
            System.out.println("--------------------------------------------------------------");
        }
    }

    public static void calculateTotalPrice (List<Product> products) {
       int Elements = products.size();
        double totalPrice = 0;
        double discountedPrice = 0;
       for(int i = 0 ; i<Elements ; i++) {
           discountedPrice = products.get(i).Discount();
           totalPrice =discountedPrice+totalPrice;
        }
        System.out.println("--------------------------------------------------------------");
       System.out.println("The total price is: " + totalPrice+"$");
        System.out.println("--------------------------------------------------------------");
    }
}