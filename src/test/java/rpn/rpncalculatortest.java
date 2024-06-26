package rpn;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RPNCalculatorTest {
    private final RPNCalculator calculator = new RPNCalculator();

    @Test
    public void testAddition() {
        assertEquals(7.0, calculator.evaluate("3 4 +"), 0.0001);
        assertEquals(5.0, calculator.evaluate("2 3 +"), 0.0001);
    }
}
