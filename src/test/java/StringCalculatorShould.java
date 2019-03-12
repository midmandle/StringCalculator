import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void return_zero_for_empty_string() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void perform_add_when_input_is_a_single_number() {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void returns_2_if_given_string_2() {
        assertEquals(2, stringCalculator.add("2"));
    }
}
