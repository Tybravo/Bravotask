package task;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutTest {
    private final Checkout checkout = new Checkout();

    @Test
    public void test_That_Checkout_Function_Exist() {
        String exist = Checkout.checkout();
        assertTrue(exist,true);
    }
    @Test
    public void test_That_Customer_Name_Is_Added() {
        String customerName = Checkout.getCustomerName("Michael");
        assertEquals(customerName, "Michael");
    }
    @Test
    public void test_That_Product_Name_Is_Added() {
        String productName = Checkout.getProductName("Chair");
        assertEquals(productName, "Chair");
    }
    @Test
    public void test_That_Product_Quantity_Added() {
        int productQuantity = Checkout.getProductQuantity(3);
        assertEquals(productQuantity, "3");
    }






}
