package arrays;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerName;
        String cashierName;
        String addMore;

        String[] itemName = new String[50];
        int[] quantity = new int[50];
        double[] price = new double[50];
        double[] total = new double[50];

        int count = 0;

        System.out.println("What is the customer's name? ");
        customerName = input.nextLine();

        do {
            System.out.println("What did the user buy? ");
            itemName[count] = input.nextLine();

            System.out.println("How many pieces? ");
            quantity[count] = input.nextInt();

            System.out.println("How much per unit? ");
            price[count] = input.nextDouble();

            total[count] = quantity[count] * price[count];

            input.nextLine();
            System.out.println("Add more items? ");
            addMore = input.nextLine();

            count++;
        } while (addMore.equalsIgnoreCase("yes"));

        System.out.println("What is your name? ");
        cashierName = input.nextLine();

        System.out.println("How much discount will he get? ");
        double discountPercent = input.nextDouble();

        double subTotal = 0;
        for (int i = 0; i < count; i++) {
            subTotal = subTotal + total[i];
        }

        double discount = (discountPercent / 100) * subTotal;
        double vat = 0.075 * subTotal;
        double billTotal = subTotal - discount + vat;

        System.out.println();
        System.out.println("UBBY's STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===============================================");
        System.out.println("ITEM\t\tQTY\tPRICE\tTOTAL");

        for (int i = 0; i < count; i++) {
            System.out.println(itemName[i] + "\t\t" + quantity[i] + "\t" + price[i] + "\t" + total[i]);
        }

        System.out.println("===============================================");
        System.out.println("Sub Total: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT @ 7.5%: " + vat);
        System.out.println("Bill Total: " + billTotal);
        System.out.println();
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
        System.out.println();

        System.out.print("How much did the customer give to you? ");
        double amountPaid = input.nextDouble();

        double balance = amountPaid - billTotal;

        System.out.println();
        System.out.println("UBBY's STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===============================================");
        System.out.println("ITEM\t\tQTY\tPRICE\tTOTAL");

        for (int i = 0; i < count; i++) {
            System.out.println(itemName[i] + "\t\t" + quantity[i] + "\t" + price[i] + "\t" + total[i]);
        }

        System.out.println("===============================================");
        System.out.println("Sub Total: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT @ 7.5%: " + vat);
        System.out.println("Bill Total: " + billTotal);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + balance);
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
    }

}
