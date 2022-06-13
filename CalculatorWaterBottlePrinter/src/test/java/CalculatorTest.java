import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void ShouldAdd(){
        assertEquals(10, calculator.add(2,8));
    }

    @Test
    public void ShouldSubtract(){
        assertEquals(1, calculator.subtract(9,8));
    }

    @Test
    public void ShouldMultiply(){
        assertEquals(36, calculator.multiply(4,9));
    }

    @Test
    public void ShouldDivide(){
        assertEquals(2.5, calculator.divide(10.0,4.0), 0.0);
    }
}
