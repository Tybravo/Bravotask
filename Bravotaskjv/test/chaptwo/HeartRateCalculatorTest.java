package chaptwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HeartRateCalculatorTest {

    @Test
    public void testThatHeartRateCalculatorFunctionExist() {
        HeartRateCalculator heartRate = new HeartRateCalculator();
        Assertions.assertNotNull(heartRate);
    }

    @Test
    public void testThatHeartRateCalculatorReturnsMinHeartRateBeat() {
        HeartRateCalculator heartRate = new HeartRateCalculator();
        double maximum = HeartRateCalculator.maximumRate(35);
        Assertions.assertEquals(maximum, 185.0);
    }

    @Test
    public void testThatHeartRateCalculatorReturnsTargetHeartRateRange() {
        HeartRateCalculator heartRate = new HeartRateCalculator();
        String target = HeartRateCalculator.targetRateRange(28);
        Assertions.assertEquals(target, "96 - 163");
    }
}
