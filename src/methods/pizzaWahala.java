package methods;
import java.util.Scanner;
public class pizzaWahala {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int noOfSlices = 0;
        int pricePerBox = 0;
        System.out.println("Enter the number of people that wants pizza");
        int noOfPeople = inputCollector.nextInt();

        System.out.println(
                """
                Choose a Pizza Type between these options
                1. Sapa size
                2. Small Money
                3. Big boys
                4. Odogwu
                
                """
        );
        int pizzaType = inputCollector.nextInt();

        if (pizzaType == 1){
            noOfSlices = 4;
            pricePerBox = 2500;

        }
        else if (pizzaType == 2){
            noOfSlices = 6;
            pricePerBox = 2900;
        }
        else if (pizzaType == 3){
            noOfSlices = 8;
            pricePerBox = 4000;
        }
        else if (pizzaType == 4){
            noOfSlices = 12;
            pricePerBox = 5200;
        }
        else {
            System.out.println("Invalid pizza type");
        }

        int noOfBoxes = (int) Math.ceil((double) noOfPeople / noOfSlices);
        int leftOverSlices = noOfBoxes * noOfSlices - noOfPeople;

        int pizzaPrice = noOfBoxes * pricePerBox;

        System.out.printf("The number of boxes needed are %d%n", noOfBoxes);
        System.out.printf("The left over slices remaining are %d%n", leftOverSlices);
        System.out.printf("The total price for the pizza boxes are %d ", pizzaPrice);

    }
}
