import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCounterTest {

    @Test
    void should_get_5_even_count_when_input_1_to_11() {
        NumberCounter numberCounter = new NumberCounter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(5, numberCounter.count(NumberCounter.EVEN));
    }

    @Test
    void should_get_6_odd_count_when_input_1_to_11() {
        NumberCounter numberCounter = new NumberCounter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(6, numberCounter.count(NumberCounter.ODD));
    }

    @Test
    void should_get_positive_count() {
        NumberCounter numberCounter = new NumberCounter(-1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(9, numberCounter.count(NumberCounter.POSITIVE));
    }

    @Test
    void should_get_negative_count() {
        NumberCounter numberCounter = new NumberCounter(-1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(2, numberCounter.count(NumberCounter.NEGATIVE));
    }
}