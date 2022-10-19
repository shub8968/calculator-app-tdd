package test;

import main.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void returnZeroOnEmptyString() {

        int res = Calculator.add("");
        assertEquals(0, res);
    }


}
