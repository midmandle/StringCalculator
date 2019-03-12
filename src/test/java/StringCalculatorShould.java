import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {
    @Test
    void return_zero_for_empty_string() {
        assertEquals(0, StringCalculator.Add(""));
    }
}
