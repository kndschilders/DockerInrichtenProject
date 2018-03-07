import org.junit.*;

/**
 * Test class to test methods of the Calculator class.
 */
public class CalculatorTest {
    public Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(0, calc.subtract(1, 1));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(1, calc.multiply(1, 1));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(1, calc.divide(1, 1));
    }
}
