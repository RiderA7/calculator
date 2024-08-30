import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(7,4));
    }

    @Test
    void multiply() {
        assertEquals(26,calculator.multiply(13,2));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
//        System.out.println(calculator.divide(3,0));
        assertThrows(IllegalArgumentException.class, () -> {calculator.divide(3,0);});
    }

}