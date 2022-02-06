package ukraine.odessa.hillel.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    @Test
    void addSuccessTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void addFailedTest() {
        Calculator calculator = new Calculator();
        assertNotEquals(3, calculator.add(1, 1));
    }

    @Test
    void subtractSuccessTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1, 1));
    }

    @Test
    void subtractFailedTest() {
        Calculator calculator = new Calculator();
        assertNotEquals(2, calculator.subtract(1, 1));
    }

    @Test
    void multiplySuccessTest() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    void multiplyFailedTest() {
        Calculator calculator = new Calculator();
        assertNotEquals(0, calculator.multiply(2, 5));
    }

    @Test
    void divideSuccessTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divideFailedTest() {
        Calculator calculator = new Calculator();
        assertNotEquals(1, calculator.divide(10, 2));
    }
}
