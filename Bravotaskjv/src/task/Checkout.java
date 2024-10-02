package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        ArrayList<String> checkouts = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String moreItems = "";

        do {
            System.out.println("Enter Customer Name: ");
            String collectCustomerName = input.nextLine();

            System.out.println("Enter Product Name: ");
            String collectProductName = input.nextLine();

            System.out.println("Enter Product Quantity: ");
            int collectProductQuantity = input.nextInt();

            System.out.println("Enter How Much per Unit: ");
            double collectProductPrice = input.nextDouble();
            input.nextLine();

            String getName = getCustomerName(collectCustomerName);
            String getProductName = getProductName(collectProductName);
            int getProductQuantity = getProductQuantity(collectProductQuantity);
            double getProductPrice = getProductPrice(collectProductPrice);

            checkouts.add("Customer Name: " + getName);
            checkouts.add("Product Name: " + getProductName);
            checkouts.add("Product Quantity: " + getProductQuantity);
            checkouts.add("Product Unit Price: " + getProductPrice);

            System.out.println("Add More Items? (yes/no): ");
            moreItems = input.nextLine();
        }
        while(moreItems.equalsIgnoreCase("yes"));


        for (String details : checkouts) {
            System.out.println(details);
        }
    }




    public static String checkout() {
        ArrayList<String> checkouts = new ArrayList<>();
        return null;
    }
    public static String getCustomerName(String collectCustomerName) {
        return collectCustomerName;
    }

    public static String getProductName(String collectProductName) {
        return collectProductName;
    }

    public static int getProductQuantity(int collectProductQuantity) {
        return collectProductQuantity;
    }

    public static double getProductPrice(double collectProductPrice) {
        return collectProductPrice;
    }

}



