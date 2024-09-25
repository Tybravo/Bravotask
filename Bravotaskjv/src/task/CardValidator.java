package task;

import java.util.Scanner;

public class CardValidator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter card number to verify: ");
        long cardNumL = input.nextLong();

        long rightToLeft = everySecondDigitRightToLeft(cardNumL);
        System.out.println(rightToLeft);

        long oddNum = everySecondDigitRightToLeftOddPlace(cardNumL);
        System.out.println(oddNum);

        String cardType = getCardType(cardNumL);
        System.out.println(cardType);

        String count = countNumDigit(cardNumL);
        System.out.println(count);

        String validate = validateCount(cardNumL);
        System.out.println(validate);

        System.out.println("***********************************************");
        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumL);
        System.out.println("Credit Card Digit Length: " + count);
        System.out.println("Credit Card Validity status: " + validate);
        System.out.println("***********************************************");

    }

    static int addUp = 0;
    static int sumUp = 0;

    public CardValidator() {
    }


    public static long everySecondDigitRightToLeft(long digit) {
        String cardNum = Long.toString(digit);
        int addUp = 0;
        int addNumBelow10 = 0;
        int addSplitAbove10 = 0;

        for (int index = cardNum.length()-2; index >= 0; index = index - 2) {
            //System.out.println(+index);
            char eachChar = cardNum.charAt(index);
            int evenNum = Character.getNumericValue(eachChar);
            evenNum = evenNum * 2;
            //System.out.println(+evenNum);
            if(evenNum >= 10){
                String getNum = Integer.toString(evenNum);
                for(int count = 0; count <= getNum.length()-1; count++){
                    char getChar = getNum.charAt(count);
                    int splitCharAbove10 = Character.getNumericValue(getChar);
                    addSplitAbove10 = addSplitAbove10 + splitCharAbove10;
                    System.out.println(+addSplitAbove10);
                }

            }
            if(evenNum < 10){
                addNumBelow10 = addNumBelow10 + evenNum;
                System.out.println(+addNumBelow10);
            }
            addUp = addNumBelow10 + addSplitAbove10;
        }
        return addUp;
    }


    public static long everySecondDigitRightToLeftOddPlace(long number) {
        String cardNum = Long.toString(number);
        long sumUp = 0;

        for (int index = cardNum.length()-1; index > 0; index = index - 2) {
            char eachChar = cardNum.charAt(index);
            int oddNum = Character.getNumericValue(eachChar);
            sumUp = sumUp + oddNum;
        }
        return sumUp;
    }


    public static String getCardType(long cardType) {
        String cardTypeStr = Long.toString(cardType);
        char firstDigit = cardTypeStr.charAt(0);

        switch (firstDigit) {
            case '3':
                return "American Express Card";
            case '4':
                return "Visa Card";
            case '5':
                return "Master Card";
            default:
                return "Invalid Card Type";
        }
    }



    public static String countNumDigit(long cardDigit) {
        String getDigit = Long.toString(cardDigit);
        if (getDigit.length() != 16) {
            return "Invalid Card Number";
        } else {
            return "16";
        }
    }


    public static String validateCount(long cardDigit) {
        String getDigit = Long.toString(cardDigit);
        int sumOfNum = (addUp + sumUp);
        if (sumOfNum % 10 != 0 || getDigit.length() != 16) {
            return "Card Status Invalid";
        } else {
            return "Valid Card Status";
        }
    }

}
