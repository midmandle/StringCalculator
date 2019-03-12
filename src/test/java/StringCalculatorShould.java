import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "'1,2', 3",
            "'10,1', 11",
            "'10,1,2', 13",
    })
    void add_multiple_numbers(String numbers, int expectedSum) {
        assertEquals(expectedSum, stringCalculator.add(numbers));
    }
}
