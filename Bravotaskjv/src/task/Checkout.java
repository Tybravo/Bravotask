package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        ArrayList<String> customerNames = new ArrayList<>();

        //String collectCustomerName = "Bravo";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String collectCustomerName = input.nextLine();

        String getName = getCustomerName(collectCustomerName);

        customerNames.add(getName);
        for(String customerName : customerNames) {
            System.out.println(customerName);
        }
    }

    public static String checkout() {
        return null;
    }


    public static String getCustomerName(String collectCustomerName) {
            return collectCustomerName;
        }




}
