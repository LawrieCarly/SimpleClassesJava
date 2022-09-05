import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;

    @Before
    public void before(){
        myCalculator = new Calculator(10, 5, 5.5, 10.5);
    }


    @Test
    public void Add(){
        assertEquals(15, myCalculator.sumOf(10, 5));
    }

    @Test
    public void Subtract(){
        assertEquals(5, myCalculator.minusTotal(10, 5));
    }

    @Test
    public void Multiply(){
        assertEquals(50, myCalculator.timesTotal(10, 5));
    }

    @Test
    public void Divide(){
        assertEquals(1.9090909090909092, myCalculator.divideTotal(10.5, 5.5), 0.0);
    }

}
