package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        ArrayList<String> checkouts = new ArrayList<>();

        //String collectCustomerName = "Bravo";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String collectCustomerName = input.nextLine();
        System.out.println("Enter Product Name: ");
        String collectProductName = input.nextLine();
        int collectProductQuantity = input.nextInt();

        String getName = getCustomerName(collectCustomerName);
        String getProductName = getProductName(collectProductName);
        int getProductQuantity = getProductQuantity(collectProductQuantity);

        checkouts.add(getName);
        for(String customerName : checkouts) {
            System.out.println(customerName);
            System.out.println(getProductName);
            System.out.println(getProductQuantity);
        }
    }

    public static String checkout() {
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
}
