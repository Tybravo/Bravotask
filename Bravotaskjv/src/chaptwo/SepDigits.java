package chaptwo;

public class SepDigits {

    public static void main(String[] args) {

        int getSeparated = 42339;
        int sepValue = sep_Digits(getSeparated);

        System.out.println(sepValue);
    }



    public static int sep_Digits(int number) {

        //StringBuilder Separated = new StringBuilder();
        String digitsStr = Integer.toString(number);
        int SizeOfDigits = digitsStr.length();

        for(int index = 0; index < SizeOfDigits; index++) {

            char getChar = digitsStr.charAt(index);
            int separated = Character.getNumericValue(getChar);

        }

//return Separated.toString();
//return Integer.parseInt(String.valueOf(Separated));

    }
}
