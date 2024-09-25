package task;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CardValidatorTest {
    private final CardValidator validator = new CardValidator();

    @Test
    public void test_That_Credit_Card_Validator_App_Exist() {
        assertNotNull(validator);
    }

    @Test
    public void test_That_Every_Second_Digit_Right_To_Left() {
        long addUp = CardValidator.everySecondDigitRightToLeft(4388576018402626L);
        assertEquals(addUp, 37);
    }

    @Test
    public void test_That_Every_Second_Digit_Right_To_Left_Odd_Place() {
        long sumUp = CardValidator.everySecondDigitRightToLeftOddPlace(4388576018402626L);
        assertEquals(sumUp, 38);
    }

    @Test
    public void test_To_Get_First_Digit_To_Check_Card_Type() {
        String cardType = CardValidator.getCardType(4388576018402626L);
        assertEquals(cardType, "Visa Card");
    }

    @Test
    public void test_To_Get_First_Digit_To_Check_Wrong_Card_Type() {
        String cardType = CardValidator.getCardType(8388576018402626L);
        assertEquals(cardType, "Invalid Card Type");
    }

    @Test
    public void test_To_Get_Card_Length() {
        String cardLength = CardValidator.countNumDigit(4388576018402626L);
        assertEquals(cardLength, "16");
    }

    @Test
    public void test_To_Get_Wrong_Card_Length() {
        String wrongCardLength = CardValidator.countNumDigit(43885760184022L);
        assertEquals(wrongCardLength, "Invalid Card Number");
    }

    @Test
    public void test_To_Validate_Card_Status() {
        String cardStatus = CardValidator.validateCount(4388576018410707L);
        assertEquals(cardStatus, "Valid Card Status");
    }

    @Test
    public void test_To_Validate_Wrong_Card_Status() {
        String wrongCardStatus = CardValidator.validateCount(83885760184022L);
        assertEquals(wrongCardStatus, "Card Status Invalid");
    }
}
