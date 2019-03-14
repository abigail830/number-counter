import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveCounterTest {

    @Test
    void should_get_positive_count() {
        PositiveCounter numberCounter = new PositiveCounter();
        assertEquals(9, numberCounter.count(-1,-2,3,4,5,6,7,8,9,10,11));
    }

}