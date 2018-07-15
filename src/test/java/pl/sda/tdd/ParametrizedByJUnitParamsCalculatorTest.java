package pl.sda.tdd;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedByJUnitParamsCalculatorTest {

    private Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({
            "-1, 5, 4",
            "1, 12, 13",
            "3, 3, 6"
    })

    public void addTest(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void subtract() {

    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }


    /*
    Rozszerz klasę Calculator tak, żeby przyjmowała wartości typu Integer
    zamiast int. Jeśli któryś z argumentów = null -> rzucamy wyjątek z
    odpowiednią wiadomością. Jeśli dzielnik = null -> rzucamy wyjątek z
    odpowiednią wartością.
     */
    @Test
    public void shouldAddTwoNumbers() {
        Integer a = 2;
        Integer b = 3;
        //assertEquals(5, calc.add2(a, b));
    }

    @Test
    public void shouldNullPointerException() {
        Integer a = 2;
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Parametr jest nullem");
        calculator.add2(a, null);
    }

}