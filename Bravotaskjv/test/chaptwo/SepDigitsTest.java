package chaptwo;

import org.junit.Test;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.*;

public class SepDigitsTest {
   //private final SepDigits sep = new SepDigits();

    @Test
    public void test_That_Separate_Digit_Function_Exist() {
        String exist = SepDigits.spaceDigit(42339);
        assertNotNull(exist);
    }

    @Test
    public void test_That_Digits_In_Integers_Can_Be_Separated() {
        SepDigits sep = new SepDigits();
        String separated = SepDigits.spaceDigit(42339);
        assertEquals(separated, " 4 2 3 3 9");
    }

}
