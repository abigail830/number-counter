import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EventStrategicTest {

    @Test
    void should_count_when_input_as_even() {
        assertTrue(new EventStrategic().shouldCount(2));
    }

    @Test
    void should_not_count_when_input_as_odd() {
        assertFalse(new EventStrategic().shouldCount(1));
    }
}