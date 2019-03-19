import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NegativeStrategicTest {

    @Test
    void should_count_when_input_as_negative() {
        assertTrue(new NegativeStrategic().shouldCount(-1));
    }

    @Test
    void should_not_count_when_input_as_positive() {
        assertFalse(new NegativeStrategic().shouldCount(2));
    }
}