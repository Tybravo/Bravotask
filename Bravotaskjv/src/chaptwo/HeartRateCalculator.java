package chaptwo;

import java.util.Scanner;

public class HeartRateCalculator {
    public static void main(String[] args) {

        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        int getHeartRate = maximumRate(age);
        System.out.println(getHeartRate);

        String targetHeartRateRange = targetRateRange(age);
        System.out.println(targetHeartRateRange);

    }


    public static int maximumRate(int age) {
        int GIVEN = 220;
        int max_Heart_Rate_beat;
        max_Heart_Rate_beat = GIVEN - age;

        return max_Heart_Rate_beat;
    }


    public static String targetRateRange(int age) {
        int GIVEN = 220;
        int max_Heart_Rate_Beat = GIVEN - age;
        double rangeFrom = (50.0 / 100) * max_Heart_Rate_Beat;
        double rangeTo = (85.0/ 100) * max_Heart_Rate_Beat;

        return String.format("%.0f - %.0f", rangeFrom, rangeTo);
    }


}
