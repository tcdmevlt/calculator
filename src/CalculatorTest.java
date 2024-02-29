import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {

        int a = 5;
        int b = 10;

        int result = calculator.add(a, b);

        assertEquals(15, result, "Sum should be 15");
    }
}