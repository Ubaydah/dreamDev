package methods;

public class BackToSender {
    public static int calculateRiderPayment( int collectionRate) {
        int basePay = 5000;
        int amountPerParcel = 0;

        int successfulDelivery;

        if (collectionRate < 50) {
            amountPerParcel = 160;
            successfulDelivery = collectionRate * amountPerParcel + basePay;
        }
        else if (collectionRate < 60) {
            amountPerParcel = 200;
            successfulDelivery = collectionRate * amountPerParcel + basePay;
        }
        else if (collectionRate < 70) {
            amountPerParcel = 250;
            successfulDelivery = collectionRate * amountPerParcel + basePay;
        }
        else {
            amountPerParcel = 500;
            successfulDelivery = collectionRate * amountPerParcel + basePay;
        }
        return successfulDelivery;
    }

    public static void main(String[] args) {
        System.out.println(calculateRiderPayment(80));
        System.out.println(calculateRiderPayment(25));
    }
}
