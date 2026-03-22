package methods;
import java.util.Scanner;

public class backToSender {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the delivery collection rate");
        int collectionRate = inputCollector.nextInt();

        int basePay = 5000;
        int amountPerParcel = 0;

        if (collectionRate < 50) {
            amountPerParcel = 160;
        }
        else if (collectionRate < 60) {
            amountPerParcel = 200;
        }
        else if (collectionRate < 70) {
            amountPerParcel = 250;
        }
        else {
            amountPerParcel = 500;
        }
        int riderWage = collectionRate * amountPerParcel + basePay;

        System.out.printf("The rider's wage is %d",riderWage);
    }
}
