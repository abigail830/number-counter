import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddStrategicTest {

    @Test
    void should_count_when_input_as_odd() {
        assertTrue(new OddStrategic().shouldCount(1));
    }

    @Test
    void should_not_count_when_input_as_even() {
        assertFalse(new OddStrategic().shouldCount(2));
    }
}