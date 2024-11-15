import java.awt.*;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle x = new Car(433124,"Ford mustang",30,2,"Petrol");
        x.getDescription();
        x.calculateRentalCost(20);
        System.out.println("-------------------------------------------");
        Vehicle y = new Truck(124,"Mercedes",45,250,"cargo");
        y.getDescription();
        y.calculateRentalCost(10);
        System.out.println("-------------------------------------------");
        Vehicle z = new Motorcycle(222,"BMW (BMW Motorrad)",100,14,false);
        z.getDescription();
        z.calculateRentalCost(33);
    }

}
