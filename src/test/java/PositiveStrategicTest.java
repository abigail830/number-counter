import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PositiveStrategicTest {

    @Test
    void should_count_when_input_as_positive() {
        assertTrue(new PositiveStrategic().shouldCount(1));
    }

    @Test
    void should_not_count_when_input_as_negative() {
        assertFalse(new PositiveStrategic().shouldCount(-2));
    }
}