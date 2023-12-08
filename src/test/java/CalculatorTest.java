import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("足し算テスト")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result, "2 + 2 should equal 4");
    }

    @Test
    @DisplayName("引き算テスト")
    public void testDelete() {
        Calculator calculator = new Calculator();
        int result = calculator.delete(2, 2);
        assertEquals(0, result, "2 - 2 should equal 0");
    }
}

