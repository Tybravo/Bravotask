package chaptwo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class InvestmentReturnTest {

    @Test
    public void test_that_investment_return_function_exist() {
        InvestmentReturn investment = new InvestmentReturn();
        assertNotNull(investment);
    }

    @Test
    public void test_investment_return_yielded_after_10_years() {
        InvestmentReturn investment = new InvestmentReturn();
        double tenYears = InvestmentReturn.after10Years(10);
        Assertions.assertEquals(tenYears, 1967.15);
    }

    @Test
    public void test_investment_return_yielded_after_20_years() {
        InvestmentReturn investment = new InvestmentReturn();
        double twentyYears = InvestmentReturn.after20Years(20);
        Assertions.assertEquals(twentyYears, 3869.68);
    }

    @Test
    public void test_investment_return_yielded_after_30_years() {
        InvestmentReturn investment = new InvestmentReturn();
        double thirtyYears = InvestmentReturn.after30Years(30);
        Assertions.assertEquals(thirtyYears, 7612.26);
    }
}
