import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.Add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.Subtract(20, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.Multiply(10, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(10, calculator.Divide(50, 5), 10);
    }
}
