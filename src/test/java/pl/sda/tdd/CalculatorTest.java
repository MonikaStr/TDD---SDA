package pl.sda.tdd;

import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void addTest() {
        int result = calc.add(7, 2);
        assertEquals(9, result);
    }

    @Test
    public void subtractTest() {
        int result = calc.subtract(7, 2);
            assertEquals(5, result);
        }

    @Test
    public void multiplyTest() {
        //int result = calc.multiply(7, 2);
        assertEquals(14, calc.multiply(7, 2));
    }

    @Test
    public void divideTest() {
        double result = calc.divide(7, 2);
        assertEquals(3.5, result, 0.5);
    }

    @Test (expected = IllegalArgumentException.class)
        public void divideZeroTest() {
            calc.divide(7, 0);
    }

    @Test
    public void shouldNullPointerException() {
        Integer a = 2;
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Parametr jest nullem");
        calc.add2(a, null);
    }

}