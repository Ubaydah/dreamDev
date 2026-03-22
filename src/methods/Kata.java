package methods;

public class Kata {
    public static boolean isEvenOrOdd(int inputNumber){
        int result = inputNumber % 2;

        return result == 0;
    }

    public static boolean isPrimeNumber(int inputNumber){
        if (inputNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int subtract(int numberOne, int numberTwo){
        return Math.abs(numberOne - numberTwo);
    }

    public static double divide(int numberOne, int numberTwo){
        if (numberTwo == 0){
            return 0;
        }

        return (double) numberOne / numberTwo;
    }

    public static int factorOf(int inputNumber){
        int factorCount = 0;

        for (int i =1; i <= inputNumber; i++){
            if ( inputNumber % i == 0){
                factorCount++;
            }
        }
        return factorCount;
    }

    public static boolean isSquare(int inputNumber){
        if (inputNumber < 0) {
            return false;
        }

        int root = (int) Math.sqrt(inputNumber);

        int square = root * root;

        return square == inputNumber;
    }

    public static boolean isPalindrome(int inputNumber) {
        int originalNumber = inputNumber;
        int reversedNumber = 0;
        int lastDigit;

        while (inputNumber != 0) {

            lastDigit = inputNumber % 10;

            reversedNumber = reversedNumber * 10 + lastDigit;

            inputNumber = inputNumber / 10;
        }
        return originalNumber == reversedNumber;
    }

    public static long factorialOf(int inputNumber){
        long result = 1;

        for (int i=1; i <= inputNumber; i++){
            result = result * i;
        }
        return result;
    }

    public static long squareOf(int inputNumber){

        return (long) inputNumber * inputNumber;
    }

    public static void main(String[] args){
        System.out.println(isEvenOrOdd(2));
        System.out.println(isEvenOrOdd(3));

        System.out.println(isPrimeNumber(65));
        System.out.println(isPrimeNumber(17));

        System.out.println(subtract(3,7));
        System.out.println(subtract(7,3));

        System.out.println(divide(7, 3));
        System.out.println(divide(6,0));

        System.out.println(factorOf(10));

        System.out.println(isSquare(26));
        System.out.println(isSquare(16));

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(456));

        System.out.println(factorialOf(5));

        System.out.println(squareOf(5));
    }
}
