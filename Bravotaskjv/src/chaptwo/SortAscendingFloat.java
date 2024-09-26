package chaptwo;

import java.util.Arrays;
import java.util.Scanner;

public class SortAscendingFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] collectNum = new float[3];

        for (int index = 0; index < 3; index++) {
            System.out.print("Enter three floating-point numbers: ");
            collectNum[index] = input.nextFloat();
        }

        System.out.println("Numbers: " + Arrays.toString(collectNum));

        float[] sorted = getSorted(collectNum);
        System.out.println("The sorted number is: " + Arrays.toString(sorted));
    }


    public static float[] getSorted(float[] collectNum) {
        float smallest = 0;

        for(int index = 0; index < collectNum.length; index++){
            for(int count = index; count < collectNum.length; count++){
                if(collectNum[index] > collectNum [count]){

                    smallest = collectNum[index];
                    collectNum[index] = collectNum[count];
                    collectNum[count] = smallest;
                }
            }
        }
        return collectNum;

    }
}

