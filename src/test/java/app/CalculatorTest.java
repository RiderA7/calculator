package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"7,3,4", "10,10,0", "3,4,-1"})
    @DisplayName("Should correctly add")
    void ShouldCorrectlyAdd(double checkSum, double a, double b) {
        assertEquals(checkSum, calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({"3,7,4", "10,10,0", "5,4,-1"})
    @DisplayName("Should correctly subtract")
    void ShouldCorrectlySubtract(double checkDiff, double a, double b) {
        assertEquals(checkDiff, calculator.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({"26,13,2", "0,10,0", "-4,4,-1"})
    @DisplayName("Should correctly multiply")
    void ShouldCorrectlyMultiply(double checkProduct, double a, double b) {
        assertEquals(checkProduct, calculator.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2,6,3", "0,0,10", "-4,4,-1"})
    @DisplayName("Should correctly divide")
    void ShouldCorrectlyDivide(double checkQuotient, double a, double b) {
        assertEquals(checkQuotient, calculator.divide(a, b));
    }

    @Test
    @DisplayName("Should throw exception when performed divide by zero")
    void shouldThrowExceptionWhenPerformedDivideByZero() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> calculator.divide(3, 0));
        assertEquals("The divisor cannot be equal to 0", exception.getMessage());
    }

}