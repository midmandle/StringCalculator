import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {
    @Test
    void return_zero_for_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
}
