import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result, "Sum should be 15");
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 3;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(7, result, "Difference should be 7");
    }

    @Test
    public void testMultiplication() {
        // Arrange
        int a = 4;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(24, result, "Product should be 24");
    }

    @Test
    public void testDivision() {
        // Arrange
        int a = 20;
        int b = 5;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assertEquals(4, result, 0.001, "Quotient should be 4");
    }

    @Test
    public void testPower() {
        // Arrange
        double base = 2;
        double exponent = 3;

        // Act
        double result = calculator.power(base, exponent);

        // Assert
        assertEquals(8, result, 0.001, "2^3 should be 8");
    }
}