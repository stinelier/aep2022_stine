package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void fivePlusTwoShouldBeSeven() {
        var addition = new Calculator();
        assertEquals(7, addition.add(5, 2));
    }

    @Test
    public void tenMinusFiveShouldBeFive() {
        var cal = new Calculator();
        assertEquals(5, cal.subtract(10, 5));
    }

    @Test
    public void fifteenDividedByThreeShouldBeFive() {
        var cal = new Calculator();
        assertEquals(5, cal.divide(15, 3), 0.01);
    }

    @Test
    public void fourMultipliedByFiveShouldBeTwenty() {
        var cal = new Calculator();
        assertEquals(20, cal.multiply(4, 5), 0.01);
    }




}
