package chaptwo;

import org.junit.Test;
import static org.junit.Assert.*;

public class SepDigitsTest {
   // private final SepDigits sep = new SepDigitsTest()

    @Test
    public void test_That_Separate_Digit_Function_Exist() {
        SepDigits sep = new SepDigits();
        int exist =   sep.sep_Digits(42339);
    }



}
