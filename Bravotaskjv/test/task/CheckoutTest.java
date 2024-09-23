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
        String exist = Checkout.getCustomerName("Michael");
        assertEquals(exist, "Michael");
    }





}
