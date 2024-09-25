package chaptwo;

import static java.lang.Math.round;

public class InvestmentReturn {

    public static void main(String[] args) {
        int tenYears = 10;
        double get10Years = after10Years(tenYears);

        int twentyYears = 20;
        double get20Years = after10Years(twentyYears);

        int thirtyYears = 30;
        double get30Years = after10Years(thirtyYears);

        System.out.println("$"+get10Years);
        System.out.println("$"+get20Years);
        System.out.println("$"+get30Years);

    }



        int ANNUAL_RATE = 7;
        static double amount_invested = 1000;
        static double percentage_rate = (double) 7 / 100;

    public static double after10Years(int tenYears) {
        double  money_Year10 = 0;
        double ten_years_return = Math.pow((1 + percentage_rate), tenYears);
        double money_after_10_years = amount_invested * ten_years_return;
        money_Year10 = Math.round(money_after_10_years * 100.0) / 100.0;

        return money_Year10;
    }

    public static double after20Years(int twentyYears) {
        double money_Year20 = 0;
        double twenty_Years_Return = Math.pow((1 + percentage_rate), twentyYears);
        double money_After_10_Years = amount_invested * twenty_Years_Return;
        money_Year20 = Math.round(money_After_10_Years * 100.0) / 100.0;

        return money_Year20;
    }

    public static double after30Years(int thirtyYears) {
        double money_Year30 = 0;
        double thirty_Years_Return = Math.pow((1 + percentage_rate), thirtyYears);
        double money_After_10_Years = amount_invested * thirty_Years_Return;
        money_Year30 = Math.round(money_After_10_Years * 100.0) / 100.0;

        return money_Year30;
    }


}
