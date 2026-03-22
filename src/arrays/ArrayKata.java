package arrays;

import java.util.Arrays;

public class ArrayKata {
    public static int maximumIn(int[] numbers) {
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    public static int minimumIn(int[] numbers) {
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }

    public static int sumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int[] maximumAndMinimumOf(int[] numbers) {
        int maxNum = numbers[0];
        int minNum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }

        return new int[]{minNum, maxNum};
    }

    public static int noOfOddNumbersIn(int[] numbers) {
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static int noOfEvenNumbersIn(int[] numbers) {
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int[] evenNumbersIn(int[] numbers) {
        int count = noOfEvenNumbersIn(numbers);
        int[] evenNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index] = number;
                index++;
            }
        }

        return evenNumbers;
    }

    public static int[] oddNumbersIn(int[] numbers) {
        int count = noOfOddNumbersIn(numbers);
        int[] oddNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[index] = number;
                index++;
            }
        }

        return oddNumbers;
    }

    public static int[] squareNumbersIn(int[] numbers) {
        int count = 0;

        for (int j : numbers) {
            int root = (int) Math.sqrt(j);
            if (root * root == j) {
                count++;
            }
        }

        int[] squareNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            int root = (int) Math.sqrt(number);
            if (root * root == number) {
                squareNumbers[index] = number;
                index++;
            }
        }

        return squareNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 16, 3, 2, 25, 8};

        System.out.println(maximumIn(numbers));
        System.out.println(minimumIn(numbers));
        System.out.println(sumOf(numbers));
        System.out.println(sumOfEvenNumbersIn(numbers));
        System.out.println(sumOfOddNumbersIn(numbers));
        System.out.println(Arrays.toString(maximumAndMinimumOf(numbers)));
        System.out.println(noOfOddNumbersIn(numbers));
        System.out.println(noOfEvenNumbersIn(numbers));
        System.out.println(Arrays.toString(evenNumbersIn(numbers)));
        System.out.println(Arrays.toString(oddNumbersIn(numbers)));
        System.out.println(Arrays.toString(squareNumbersIn(numbers)));
    }

}
