package chaptwo;

public class SepDigits {

    public static void main(String[] args) {

        int getSeparated = 42339;
        String sepValue = spaceDigit(getSeparated);

        System.out.println(sepValue);
    }



    public static String spaceDigit(int number) {
        StringBuilder sepNum = new StringBuilder();

        String digitsStr = Integer.toString(number);
        for(int index = 0; index < digitsStr.length(); index++) {

            char getChar = digitsStr.charAt(index);
            String separated = Character.toString(getChar);
         sepNum.append(" ").append(separated);
        }

        return sepNum.toString();
    }
}
