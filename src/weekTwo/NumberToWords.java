package weekTwo;

public class NumberToWords {
    public static String convert(int inputNumber){

        String[] oneNames = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tenNames = {"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String inputNumberString = String.valueOf(inputNumber);
        String finalStr = null;

        if (inputNumberString.length() == 1) {
            for (int i = 0; i <= 9; i++) {
                if (inputNumber == i) {
                    finalStr = oneNames[i];
                }
            }

        } else if (inputNumberString.length() == 2 & inputNumberString.charAt(1) == '0'){
            for (int i = 0; i <= tenNames.length; i++){
                if ( inputNumber == i * 10 ) {
                    finalStr = tenNames[i-1];
                }
            }


        } else if (inputNumberString.length() == 2 & inputNumberString.charAt(1) != '0') {

        }
//            if (inputNumberString.charAt(0) == '0'){
//                finalStr = oneNames[0];
//            }
//            else if (inputNumberString.charAt(0) == '1'){
//                finalStr = oneNames[1];
//            }
//            else if (inputNumberString.charAt(0) == '2'){
//                finalStr = oneNames[2];
//            }
//            else if (inputNumberString.charAt(0) == '3'){
//                finalStr = oneNames[3];
//            }
//            else if (inputNumberString.charAt(0) == '4'){
//                finalStr = oneNames[4];
//            }
//            else if (inputNumberString.charAt(0) == '5'){
//                finalStr = oneNames[5];
//            }
//            else if (inputNumberString.charAt(0) == '3'){
//                finalStr = oneNames[3];
//            }

        return finalStr;
    }

    public static void main(String[] args){
        System.out.println(convert(9));
        System.out.println(convert(10));
        System.out.println(convert(80));
    }
}
