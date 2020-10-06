package tddStringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringCalculatorTest {

    @Test
    public void whenAddIsCalledWithEmptyStringItShouldReturnZero() {
        StringCalculator adder = new StringCalculator();
        int result = adder.add("");
        assertEquals(0, result);
    }

    @Test
    public void whenAddIsCalledWithOneItShouldReturnOne() {
        StringCalculator adder = new StringCalculator();
        int result = adder.add("1");
        assertEquals(1, result);
    }

    @Test
    void whenAddIsCalledWithMinusOneItShouldReturnMinusOne() {

    }
}
