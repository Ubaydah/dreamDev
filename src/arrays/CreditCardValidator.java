package arrays;
import java.util.Scanner;

public class CreditCardValidator {
    public static int[] toDigitArray(String cardNumber) {
        int[] digits = new int[cardNumber.length()];

        for (int i = 0; i < cardNumber.length(); i++) {
            digits[i] = cardNumber.charAt(i) - '0';
        }

        return digits;
    }

    public static String getCardType(int[] digits) {
        if (digits.length >= 1 && digits[0] == 4) {
            return "Visa Card";
        } else if (digits.length >= 1 && digits[0] == 5) {
            return "MasterCard";
        } else if (digits.length >= 2 && digits[0] == 3 && digits[1] == 7) {
            return "American Express Card";
        } else if (digits.length >= 1 && digits[0] == 6) {
            return "Discover Card";
        } else {
            return "Invalid Card Type";
        }
    }

    public static boolean isValidCard(int[] digits) {
        if (digits.length < 13 || digits.length > 16) {
            return false;
        }

        if (getCardType(digits).equals("Invalid Card Type")) {
            return false;
        }

        int evenSum = sumOfDoubleEvenPlace(digits);
        int oddSum = sumOfOddPlace(digits);
        int total = evenSum + oddSum;

        return total % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(int[] digits) {
        int sum = 0;

        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int doubled = digits[i] * 2;

            if (doubled > 9) {
                doubled = (doubled / 10) + (doubled % 10);
            }

            sum += doubled;
        }

        return sum;
    }

    public static int sumOfOddPlace(int[] digits) {
        int sum = 0;

        for (int i = digits.length - 1; i >= 0; i -= 2) {
            sum += digits[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter card details to verify: ");
        String cardNumber = input.nextLine();

        int[] digits = toDigitArray(cardNumber);

        String cardType = getCardType(digits);
        int length = digits.length;
        boolean isValid = isValidCard(digits);

        System.out.println("************************************");
        System.out.println("**Credit Card Type: " + cardType);
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + length);
        System.out.println("**Credit Card Validity Status: " + (isValid ? "Valid" : "Invalid"));
        System.out.println("************************************");
    }
}
