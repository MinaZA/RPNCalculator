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

    @Test
    public void testSubtraction() {
        assertEquals(2.0, calculator.evaluate("5 3 -"), 0.0001);
        assertEquals(0.0, calculator.evaluate("3 3 -"), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(12.0, calculator.evaluate("6 2 *"), 0.0001);
        assertEquals(15.0, calculator.evaluate("3 5 *"), 0.0001);
    }
}
