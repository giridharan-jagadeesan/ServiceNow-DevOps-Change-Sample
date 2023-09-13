package test.java;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.java.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
    
    // Add more test cases as needed
}
