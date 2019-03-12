import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {
    @Test
    void return_zero_for_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void perform_add_when_input_is_a_single_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void returns_2_if_given_string_2() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(2, stringCalculator.add("2"));
    }
}
